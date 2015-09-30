
var shoppingCart = [];


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

      $("#resetSession").click(function() {
        $.session.set("numberShoppingCartItems","");
        $.session.set("shoppingCart", "");
      });

      $(".addToBasketButton").click(function(event) {
              var itemNumber = $(this).attr("itemNumber"),
                  quantityToAdd = $('#quantityItem' + itemNumber).val(),
                  numberShoppingCartItems = parseInt($.session.get("numberShoppingCartItems")),
                  unitPrice = $(this).attr("unitPrice"),
                  imagePath = $(this).attr("imagePath");

              if(isNaN(numberShoppingCartItems))
                numberShoppingCartItems = 0;

              if(quantityToAdd > 0){
                  addToShoppingBasketJSON($(this).attr("itemType"),quantityToAdd,itemNumber, unitPrice, imagePath);


                numberShoppingCartItems += parseInt(quantityToAdd);
                $('#shoppingCartBadge').text(numberShoppingCartItems);
                $('#quantityItem' + itemNumber).val(0);
                maketoast(event);

                $.session.set("numberShoppingCartItems",parseInt(numberShoppingCartItems));

              }
          });


        function addToShoppingBasketJSON(itemType, quantity, itemNumber, unitPrice, imagePath){
          var temp  = sessionStorage.getItem('shoppingCart');
          if(temp != "")
            shoppingCart = $.parseJSON(temp);
          if(shoppingCart == null)
            shoppingCart = [];
          shoppingCart.push({   "type" : itemType,
                                "itemNumber" : itemNumber,
                                "qty" : quantity,
                                "unitPrice" : unitPrice,
                                "imagePath" : imagePath
                          });

          $.session.set("shoppingCart", JSON.stringify(shoppingCart));
        }

      $('#shoppingCart').click(function(){
        var numberShoppingCartItems = parseInt($.session.get("numberShoppingCartItems"));
         //$('#link').click();
         if(!isNaN(numberShoppingCartItems)){
            onSuccessClientCustomerData();
            location.href=('/shoppingBag');

          }

      });
});


function onSuccessClientCustomerData() {
    var stringBuild,
        imagePath,
        temp  = sessionStorage.getItem('shoppingCart'),
        itemType,
        itemNumber,
        quantity,
        unitPrice;

    if(temp != "")
      shoppingCart = $.parseJSON(temp);

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
        stringBuild = '<td><img src="' + imagePath + '"/></td><td>' + quantity + '</td><td> £' + unitPrice + '</td><td><button type ="button" class="btn removeItem" itemNumber="2"><span class="glyphicon glyphicon-remove-circle red"></span></button></td>';
        $('#orderList').find('tbody:last').append('<tr>' + stringBuild + '</tr>');
    }
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
