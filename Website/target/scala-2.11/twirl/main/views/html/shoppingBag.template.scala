
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object shoppingBag_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class shoppingBag extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("List of all products pages.")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),format.raw/*4.3*/("""<ol class="breadcrumb breadCrumbStyle">
    <li><a href="/">Home</a></li>
    <li><a href="/shoppingBag">Shopping Bag</a></li>
  </ol>


</div>
  <h1 class="centerText"> Shopping Bag</h1>



    <table class="table table-hover" id ="orderList">
      <thead>
        <tr>
          <th>Item</th>
          <th>Quantity</th>
          <th>Unit Price</th>
          <th>Remove</th>
        </tr>
      </thead>
      <tbody>
        <tr></tr>
      </tbody>
    </table>
<hr />
    <div id = "shoppingSummary">
      <div id = "priceSummary">
        <h1 class="rightText">Order Summary</h1>
        <h2 class="rightText">Total Cost: <span id = "orderTotalCost"><span></h2>
        <h2 class="rightText">Delivery Cost: £3.99</h2>
      </div>
      <div id="shoppingBagSubmit">
        <form role="form">
          <h1>Delivery Address</h1>

          <div id="postcode_lookup"></div>
        <br/>
            <div class="form-group">
              <label for="Address1">Address Line 1:</label>
              <input type="text" class="form-control" id="Address1" required>
            </div>
            <div class="form-group">
              <label for="Address2">Address Line 2:</label>
              <input type="text" class="form-control" id="Address2">
            </div>
            <div class="form-group">
              <label for="Address3">Address Line 3:</label>
              <input type="text" class="form-control" id="Address3">
            </div>
            <div class="form-group">
              <label for="Town">Town:</label>
              <input type="text" class="form-control" id="Town">
            </div>
            <div class="form-group">
              <label for="County">County:</label>
              <input type="text" class="form-control" id="County">
            </div>
            <div class="form-group">
              <label for="Postcode">Postcode:</label>
              <input type="text" class="form-control" id="Postcode" required>
            </div>


          <script>
            $('#postcode_lookup').getAddress("""),format.raw/*68.46*/("""{"""),format.raw/*68.47*/("""
                """),format.raw/*69.17*/("""api_key: 'EtGodLRTsUeWBljaQzmvLw1760',
                output_fields:"""),format.raw/*70.31*/("""{"""),format.raw/*70.32*/("""
                    """),format.raw/*71.21*/("""line_1: '#Address1',
                    line_2: '#Address2',
                    line_3: '#Address3',
                    post_town: '#Town',
                    county: '#County',
                    postcode: '#Postcode'
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/(""",
            <!--  Optionally register callbacks at specific stages -->
                onLookupSuccess: function(data)"""),format.raw/*79.48*/("""{"""),format.raw/*79.49*/("""/* Your custom code */"""),format.raw/*79.71*/("""}"""),format.raw/*79.72*/(""",
                onLookupError: function()"""),format.raw/*80.42*/("""{"""),format.raw/*80.43*/("""/* Your custom code */"""),format.raw/*80.65*/("""}"""),format.raw/*80.66*/(""",
                onAddressSelected: function(elem,index)"""),format.raw/*81.56*/("""{"""),format.raw/*81.57*/("""/* Your custom code */"""),format.raw/*81.79*/("""}"""),format.raw/*81.80*/("""
            """),format.raw/*82.13*/("""}"""),format.raw/*82.14*/(""");
        </script>
    </div>
    <button type="submit" class="btn btn-default btn-lg" id="submitOrder">Place Order</button>
  </form>
  </div>


""")))}),format.raw/*90.2*/("""
"""))
      }
    }
  }

  def render(products:String): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object shoppingBag extends shoppingBag_Scope0.shoppingBag
              /*
                  -- GENERATED --
                  DATE: Thu Oct 01 16:10:12 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/shoppingBag.scala.html
                  HASH: b9148b030e0b8cd67e101db3bba7d72d5230ba06
                  MATRIX: 757->1|870->19|898->22|941->57|980->59|1009->62|3092->2117|3121->2118|3166->2135|3263->2204|3292->2205|3341->2226|3609->2466|3638->2467|3786->2587|3815->2588|3865->2610|3894->2611|3965->2654|3994->2655|4044->2677|4073->2678|4158->2735|4187->2736|4237->2758|4266->2759|4307->2772|4336->2773|4515->2922
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|99->68|99->68|100->69|101->70|101->70|102->71|108->77|108->77|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|121->90
                  -- GENERATED --
              */
          