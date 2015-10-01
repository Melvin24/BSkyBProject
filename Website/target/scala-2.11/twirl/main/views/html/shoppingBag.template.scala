
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
        <h2 class="rightText">Item Cost: <span id = "orderTotalCost"><span></h2>
        <h2 class="rightText">Delivery Cost: £3.99</h2>
        <h2 class="rightText">Total Cost: <span id = "orderTotalCostWithDelivery"><span></h2>
      </div>
      <div id="shoppingBagSubmit">
        <form role="form" id = "orderForm">
          <h1>Delivery Address</h1>

          <div id="postcode_lookup"></div>
        <br/>
            <div class="form-group">
              <label for="Address1">Address Line 1:</label>
              <input type="text" class="form-control requiredFields" id="Address1" required>
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
              <input type="text" class="form-control requiredFields" id="Postcode" required pattern ="[A-Za-z]"""),format.raw/*64.111*/("""{"""),format.raw/*64.112*/("""1,2"""),format.raw/*64.115*/("""}"""),format.raw/*64.116*/("""[0-9Rr][0-9A-Za-z]? [0-9][ABD-HJLNP-UW-Zabd-hjlnp-uw-z]"""),format.raw/*64.171*/("""{"""),format.raw/*64.172*/("""2"""),format.raw/*64.173*/("""}"""),format.raw/*64.174*/("""">
            </div>


          <script>
            $('#postcode_lookup').getAddress("""),format.raw/*69.46*/("""{"""),format.raw/*69.47*/("""
                """),format.raw/*70.17*/("""api_key: 'EtGodLRTsUeWBljaQzmvLw1760',
                output_fields:"""),format.raw/*71.31*/("""{"""),format.raw/*71.32*/("""
                    """),format.raw/*72.21*/("""line_1: '#Address1',
                    line_2: '#Address2',
                    line_3: '#Address3',
                    post_town: '#Town',
                    county: '#County',
                    postcode: '#Postcode'
                """),format.raw/*78.17*/("""}"""),format.raw/*78.18*/(""",
            <!--  Optionally register callbacks at specific stages -->
                onLookupSuccess: function(data)"""),format.raw/*80.48*/("""{"""),format.raw/*80.49*/("""/* Your custom code */"""),format.raw/*80.71*/("""}"""),format.raw/*80.72*/(""",
                onLookupError: function()"""),format.raw/*81.42*/("""{"""),format.raw/*81.43*/("""/* Your custom code */"""),format.raw/*81.65*/("""}"""),format.raw/*81.66*/(""",
                onAddressSelected: function(elem,index)"""),format.raw/*82.56*/("""{"""),format.raw/*82.57*/("""/* Your custom code */"""),format.raw/*82.79*/("""}"""),format.raw/*82.80*/("""
            """),format.raw/*83.13*/("""}"""),format.raw/*83.14*/(""");
        </script>
    </div>
    <button type="submit" class="btn btn-default btn-lg" id="submitOrder" >Place Order</button>
  </form>
  </div>


""")))}),format.raw/*91.2*/("""
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
                  DATE: Thu Oct 01 17:37:49 BST 2015
                  SOURCE: /Users/rsp04/Websites/BSkyBProject/Website/app/views/shoppingBag.scala.html
                  HASH: f94815b4acc948efee63a6c230063d6dbd19f26f
                  MATRIX: 757->1|870->19|898->22|941->57|980->59|1009->62|3165->2189|3195->2190|3227->2193|3257->2194|3341->2249|3371->2250|3401->2251|3431->2252|3547->2340|3576->2341|3621->2358|3718->2427|3747->2428|3796->2449|4064->2689|4093->2690|4241->2810|4270->2811|4320->2833|4349->2834|4420->2877|4449->2878|4499->2900|4528->2901|4613->2958|4642->2959|4692->2981|4721->2982|4762->2995|4791->2996|4971->3146
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|100->69|100->69|101->70|102->71|102->71|103->72|109->78|109->78|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|114->83|114->83|122->91
                  -- GENERATED --
              */
          