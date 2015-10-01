
var shoppingCart = [];
var totalOrderCost;
$(document).ready(function () {
    $('.dropdown-toggle').dropdown();
    $('.carousel').carousel();
    onSuccessClientCustomerData();

    var numberShoppingCartItems = parseInt($.session.get("numberShoppingCartItems"));

    if(!isNaN(numberShoppingCartItems))
      $('#shoppingCartBadge').text(numberShoppingCartItems);


    var easterEgg = "gnomepoints",
        keyHistory = "",
        code,
        pageWidth = $(window).width() - 400;


    $(document).keypress(function(e) {
        code = e.keyCode || e.which;
          keyHistory += String.fromCharCode(e.which);
          console.log(keyHistory);

          if(keyHistory === easterEgg) {
            $("#easterEggContainer").show();
              $("#easterEgg").animate({left: "+=" + pageWidth}, 3000);
          $("#easterEgg").animate({left: "-=" + pageWidth }, 2000, function(){
            $("#easterEggContainer").fadeOut(1000);
          });
              keyHistory = "";
          }
          else if (keyHistory.length > 30 || code == 13) {
              keyHistory = "";
          }
      });

      $(".decItem").click(function() {
          var itemNumber = $(this).attr("itemNumber");
          if($("#quantityItem" + itemNumber).val() > 0){
            $("#quantityItem" + itemNumber).val($("#quantityItem" + itemNumber).val() - 1);
          }
      });

      $(".incItem").click(function() {
          var itemNumber = $(this).attr("itemNumber");
        $("#quantityItem" + itemNumber).val(parseInt($("#quantityItem" + itemNumber).val()) + 1);
      });

      $(".removeItem").click(function() {
          var numberShoppingCartItems = parseInt($.session.get("numberShoppingCartItems"));
              image = $(this).closest('tr').find('td.basketImage')[0].innerHTML,
              quantity = $(this).closest('tr').find('td.basketQuantity').text(),
              unitPrice = $(this).closest('tr').find('td.basketUnitPrice').text();



          numberShoppingCartItems -= parseInt($(this).closest('tr').find('td.basketQuantity').text());

          if(numberShoppingCartItems > 0){
            $('#shoppingCartBadge').text(numberShoppingCartItems);
            $.session.set("numberShoppingCartItems",parseInt(numberShoppingCartItems));
          }
          else{
            $('#shoppingCartBadge').text("");
            $.session.set("numberShoppingCartItems","");
          }

          removeFromShoppingBasketJSON(image, quantity, unitPrice);


          $(this).closest('tr').remove();

      });



      $("#resetSession").click(function() {
        if (confirm('Are you sure you want to empty your basket?')) {
          resetSession();
        }

      });

      function resetSession(){
        $.session.set("numberShoppingCartItems","");
        $.session.set("shoppingCart", "");
        $('#shoppingCartBadge').text("");
      }

      $(".addToBasketButton").click(function(event) {
              var itemNumber = $(this).attr("itemNumber"),
                  quantityToAdd = $('#quantityItem' + itemNumber).val(),
                  numberShoppingCartItems = parseInt($.session.get("numberShoppingCartItems")),
                  unitPrice = $(this).attr("unitPrice"),
                  imagePath = $(this).attr("imagePath"),
                  itemID = $(this).attr("itemID");

              if(isNaN(numberShoppingCartItems))
                numberShoppingCartItems = 0;

              if(quantityToAdd > 0){
                  addToShoppingBasketJSON($(this).attr("itemType"),quantityToAdd,itemNumber, unitPrice, imagePath, itemID);


                numberShoppingCartItems += parseInt(quantityToAdd);
                $('#shoppingCartBadge').text(numberShoppingCartItems);
                $('#quantityItem' + itemNumber).val(0);
                maketoast(event);

                $.session.set("numberShoppingCartItems",parseInt(numberShoppingCartItems));

              }
          });

          /*
          $(".requiredFields").keyup(function(){
              if($("#Address1").val().length && $("#Postcode").val().length && $("#Postcode").valid())
              //if($("#orderForm").valid())
                  $("#submitOrder").prop('disabled', false);
              else
                  $("#submitOrder").prop('disabled', true);
          });
          */

        function addToShoppingBasketJSON(itemType, quantity, itemNumber, unitPrice, imagePath, itemID){
          var temp  = sessionStorage.getItem('shoppingCart');
          if(temp != "")
            shoppingCart = $.parseJSON(temp);
          if(shoppingCart == null)
            shoppingCart = [];
          shoppingCart.push({   "type" : itemType,
                                "itemNumber" : itemNumber,
                                "qty" : quantity,
                                "unitPrice" : unitPrice,
                                "imagePath" : imagePath,
                                "itemID" : itemID
                          });

          $.session.set("shoppingCart", JSON.stringify(shoppingCart));
        }


        function removeFromShoppingBasketJSON(image, quantity, unitPrice) {
          var temp  = sessionStorage.getItem('shoppingCart');
          if(temp != "")
            shoppingCart = $.parseJSON(temp);
          if(shoppingCart == null)
            shoppingCart = [];



            var price = unitPrice.replace("£", "");
            var imagePath = image.replace("<img src=\"", "")
            var imagePathNew = imagePath.replace("\">","")
            totalOrderCost = parseInt(totalOrderCost - (parseInt(quantity)* parseInt(price)));
            $('#orderTotalCost').text("£" + totalOrderCost);
            $('#orderTotalCostWithDelivery').text("£" + parseFloat(totalOrderCost + 3.99));
          for(var i = 0; i < shoppingCart.length; i++){
            if(shoppingCart[i].imagePath == imagePathNew && shoppingCart[i].qty == quantity && shoppingCart[i].unitPrice == price){
              shoppingCart.splice(i, 1);
              $.session.set("shoppingCart", JSON.stringify(shoppingCart));
              return;
            }
          }


        }


      $('#shoppingCart').click(function(){
        var numberShoppingCartItems = parseInt($.session.get("numberShoppingCartItems"));
         //$('#link').click();
         if(!isNaN(numberShoppingCartItems)){
            onSuccessClientCustomerData();
            location.href=('/shoppingBag');

          }

      });

      $('#submitOrder').click(function(){
        var temp  = sessionStorage.getItem('shoppingCart');

        if(temp != "")
          shoppingCart = $.parseJSON(temp);

          //put your code here


          resetSession();
          location.href=('/');
      });



      $('#findPostcosde').click(function(){
        $('#inputPostCode').getAddress({
            api_key: 'EtGodLRTsUeWBljaQzmvLw1760',
            output_fields:{
                line_1: '#Address1',
                line_2: '#Address2',
                line_3: '#Address3',
                post_town: '#Town',
                county: '#County',
                postcode: '#postcode'
            },
            onLookupSuccess: function(data){alert(data);},
            onLookupError: function(){alert("Postcode not recognised. Please enter address manually")},
            onAddressSelected: function(elem,index){alert("here")},
            onLookupError: function(){alert("here")}
        });
      });


});


function onSuccessClientCustomerData() {
    var stringBuild,
        imagePath,
        temp  = sessionStorage.getItem('shoppingCart'),
        itemType,
        itemNumber,
        quantity,
        unitPrice,
        orderPrice = 0;

    if(temp != "")
      shoppingCart = $.parseJSON(temp);
    if(shoppingCart !== null) {
    for (var i = 0; i < shoppingCart.length; i++) {
        stringBuild = "";
        var itemDetails = shoppingCart[i];

        for (var key in itemDetails) {
          if (itemDetails.hasOwnProperty(key)) {
            switch(key) {
                  case "type":
                      itemType = itemDetails[key];
                      break;
                  case "itemNumber":
                      itemNumber = itemDetails[key];
                      break;
                  case "qty":
                      quantity = itemDetails[key];
                      break;
                  case "unitPrice":
                      unitPrice = itemDetails[key];
                      break;
                  case "imagePath":
                      imagePath = itemDetails[key];
                      break;
                  default:
                      break;
              }
          }
        }
        orderPrice += parseInt(unitPrice) * parseInt(quantity);
        stringBuild = '<td class="basketImage"><img src="' + imagePath + '"/></td><td class="basketQuantity">' + quantity + '</td><td class="basketUnitPrice">£' + unitPrice + '</td><td class="basketRemove"><button type ="button" class="btn removeItem" itemNumber="2"><span class="glyphicon glyphicon-remove-circle red"></span></button></td>';
        $('#orderList').find('tbody:last').append('<tr>' + stringBuild + '</tr>');
    }
    totalOrderCost = orderPrice;
    updateTotalCost(orderPrice);
  }
}


function updateTotalCost(orderPrice){
  $('#orderTotalCost').text("£" + orderPrice);
  $('#orderTotalCostWithDelivery').text("£" + parseFloat(orderPrice + 3.99));
}

      function maketoast (evt)
      {

        var codetmpl = "<code>%codeobj%</code><br><code>%codestr%</code>";
        evt.preventDefault();

        var options =
        {
          priority : 'success',
          title    : 'Success',
          message  : 'Added to Basket'
        };


        var codeobj = [];
        var codestr = [];

        var labels = ['message', 'title', 'priority'];
        for (var i = 0, l = labels.length; i < l; i += 1)
        {
          if (options[labels[i]] !== null)
          {
            codeobj.push([labels[i], "'" + options[labels[i]] + "'"].join(' : '));
          }

          codestr.push((options[labels[i]] !== null) ? "'" + options[labels[i]] + "'" : 'null');
        }

        if (codestr[2] === 'null')
        {
          codestr.pop();
          if (codestr[1] === 'null')
          {
            codestr.pop();
          }
        }

        codeobj = "$.toaster({ " + codeobj.join(", ") + " });"
        codestr = "$.toaster(" + codestr.join(", ") + ");"

        $('#toastCode').html(codetmpl.replace('%codeobj%', codeobj).replace('%codestr%', codestr));
        $.toaster(options);
      }
