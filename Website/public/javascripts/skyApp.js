
var shoppingCart,
    numberShoppingCartItems;
    
$(document).ready(function () {
    $('.dropdown-toggle').dropdown();
    $('.carousel').carousel();

    shoppingCart = [];
    numberShoppingCartItems = 0;

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

      $(".addToBasketButton").click(function(event) {
              var itemNumber = $(this).attr("itemNumber"),
                  currentBadgeCount = $('#shoppingCartBadge').text();
                  quantityToAdd = $('#quantityItem' + itemNumber).val();

              if(quantityToAdd > 0){
                  shoppingCart.push({  "type" : $(this).attr("itemType"),
                                        "qty" : quantityToAdd,
                                        "itemNumber" : itemNumber
                                  });
                numberShoppingCartItems += parseInt(quantityToAdd);
                $('#shoppingCartBadge').text(numberShoppingCartItems);
                $('#quantityItem' + itemNumber).val(0);
                maketoast(event);
              }
          });


      $('#shoppingCart').click(function(){
         //$('#link').click();
         if(numberShoppingCartItems > 0)
            location.href=('/shoppingBag');

      });
});

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
