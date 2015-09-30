
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object allstock_Scope0 {
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

class allstock extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Stock],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[Stock]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("Stock page!")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

"""),format.raw/*5.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron headline-img">
  <div class="container">
    <h1>Stock</h1>
    <p>Add/remove stock and order more.</p>
  </div>
</div>

<div class="container">
  <table class="table table-condensed">
    <tr>
        <th>Stock ID</th>
        <th>Category ID</th>
        <th>Name</th>
        <th>Total Stock</th>
        <th>Unit Price</th>
        <th></th>
    </tr>
"""),_display_(/*23.2*/for(product <- products) yield /*23.26*/{_display_(Seq[Any](format.raw/*23.27*/("""
    """),format.raw/*24.5*/("""<tr>
        <td>"""),_display_(/*25.14*/product/*25.21*/.stock_id),format.raw/*25.30*/("""</td>
        <td>"""),_display_(/*26.14*/product/*26.21*/.category_id),format.raw/*26.33*/("""</td>
        <td>"""),_display_(/*27.14*/product/*27.21*/.name),format.raw/*27.26*/("""</td>
        <td>"""),_display_(/*28.14*/product/*28.21*/.total_stock),format.raw/*28.33*/("""</td>
        <td>"""),_display_(/*29.14*/product/*29.21*/.unit_price),format.raw/*29.32*/("""</td>
        <td>
        <input type="button" class="btn btn-primary" value="Order More">
        <a href="/stock/delete/"""),_display_(/*32.33*/product/*32.40*/.stock_id),format.raw/*32.49*/(""""><input type="button" class="btn btn-primary" value="Delete"></a>
        </td>
    </tr>
""")))}),format.raw/*35.2*/("""
"""),format.raw/*36.1*/("""</table>

<a href="/stock/new"><input type="button" class="btn btn-primary" value="Add new items"></a>

</div>

""")))}))
      }
    }
  }

  def render(products:List[Stock]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[Stock]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object allstock extends allstock_Scope0.allstock
              /*
                  -- GENERATED --
                  DATE: Wed Sep 30 18:34:41 BST 2015
                  SOURCE: /Users/rsp04/Websites/Wednesday/BSkyBProject/Website/app/views/allstock.scala.html
                  HASH: e9de750feb31457bf042974ced69af19cf9ccf59
                  MATRIX: 756->1|874->24|902->27|929->46|968->48|996->50|1475->503|1515->527|1554->528|1586->533|1631->551|1647->558|1677->567|1723->586|1739->593|1772->605|1818->624|1834->631|1860->636|1906->655|1922->662|1955->674|2001->693|2017->700|2049->711|2200->835|2216->842|2246->851|2368->943|2396->944
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|63->32|63->32|63->32|66->35|67->36
                  -- GENERATED --
              */
          