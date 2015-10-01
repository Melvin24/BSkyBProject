
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viewallorders_Scope0 {
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

class viewallorders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Orders],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(orders: List[Orders]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Manage orders.")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
  <div class="container">
    <h1>Orders</h1>
    <p>View orders.</p>
  </div>
</div>

<div class="container">
  <table class="table table-condensed">
    <tr>
        <th>Order ID</th>
        <th>Category ID</th>
        <th>Date</th>
        <th>Price</th>
        <th>Order Status</th>
        <th></th>
    </tr>
"""),_display_(/*23.2*/for(order <- orders) yield /*23.22*/{_display_(Seq[Any](format.raw/*23.23*/("""
    """),format.raw/*24.5*/("""<tr>
        <td>"""),_display_(/*25.14*/order/*25.19*/.order_id),format.raw/*25.28*/("""</td>
        <td>"""),_display_(/*26.14*/order/*26.19*/.customer_id),format.raw/*26.31*/("""</td>
        <td>"""),_display_(/*27.14*/order/*27.19*/.date),format.raw/*27.24*/("""</td>
        <td>"""),_display_(/*28.14*/order/*28.19*/.price),format.raw/*28.25*/("""</td>
        <td>
        """),_display_(/*30.10*/if(order.order_status_id == 2)/*30.40*/ {_display_(Seq[Any](format.raw/*30.42*/("""
        """),format.raw/*31.9*/("""Warehouse
        """)))}/*32.11*/else/*32.16*/{_display_(Seq[Any](format.raw/*32.17*/("""
        """),format.raw/*33.9*/("""Dispatched
        """)))}),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""</td>
    </tr>
""")))}),format.raw/*37.2*/("""
"""),format.raw/*38.1*/("""</table>

<h1><a href="/backofhouse">Back</a></h1>

</div>

""")))}))
      }
    }
  }

  def render(orders:List[Orders]): play.twirl.api.HtmlFormat.Appendable = apply(orders)

  def f:((List[Orders]) => play.twirl.api.HtmlFormat.Appendable) = (orders) => apply(orders)

  def ref: this.type = this

}


}

/**/
object viewallorders extends viewallorders_Scope0.viewallorders
              /*
                  -- GENERATED --
                  DATE: Thu Oct 01 16:10:12 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/viewallorders.scala.html
                  HASH: e9c13db3ea0d0bce94a64cd12d109ac7913cfe3d
                  MATRIX: 767->1|884->23|912->26|942->48|981->50|1009->52|1452->469|1488->489|1527->490|1559->495|1604->513|1618->518|1648->527|1694->546|1708->551|1741->563|1787->582|1801->587|1827->592|1873->611|1887->616|1914->622|1969->650|2008->680|2048->682|2084->691|2122->711|2135->716|2174->717|2210->726|2261->746|2297->755|2344->772|2372->773
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|65->34|66->35|68->37|69->38
                  -- GENERATED --
              */
          