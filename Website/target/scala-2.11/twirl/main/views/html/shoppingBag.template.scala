
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

    <h1 class="rightText">Order Summary</h1>
    <h2 class="rightText">Total Cost: <span id = "orderTotalCost"><span></h2>
    <h2 class="rightText">Delivery Cost: £3.99</h2>



""")))}),format.raw/*35.2*/("""
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
                  DATE: Thu Oct 01 10:39:19 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/shoppingBag.scala.html
                  HASH: 837499a0e3d2f0efefdc7b1c13cb6c359590b57b
                  MATRIX: 757->1|870->19|898->22|941->57|980->59|1009->62|1688->711
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|66->35
                  -- GENERATED --
              */
          