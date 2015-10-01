
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

"""),_display_(/*3.2*/main("Stock page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

"""),format.raw/*5.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
  <div class="container">
    <h1>Stock</h1>
    <p>View stock levels, order more or remove from the product catalogue.</p>
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
        <a href="#" onclick="$.post('/stock/update', """),format.raw/*31.54*/("""{"""),format.raw/*31.55*/(""" """),format.raw/*31.56*/("""id: '"""),_display_(/*31.62*/product/*31.69*/.stock_id),format.raw/*31.78*/("""', amount: '10' """),format.raw/*31.94*/("""}"""),format.raw/*31.95*/(""" """),format.raw/*31.96*/(""");" type="button" class="btn btn-primary">Order More</a>
        <a href="/stock/delete/"""),_display_(/*32.33*/product/*32.40*/.stock_id),format.raw/*32.49*/("""" type="button" class="btn btn-danger">Delete</a>
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
                  DATE: Thu Oct 01 17:37:48 BST 2015
                  SOURCE: /Users/rsp04/Websites/BSkyBProject/Website/app/views/allstock.scala.html
                  HASH: 095dfd06c7e90e65edfffcfe520b515eeff7e0c5
                  MATRIX: 756->1|874->24|902->27|928->45|967->47|995->49|1496->524|1536->548|1575->549|1607->554|1652->572|1668->579|1698->588|1744->607|1760->614|1793->626|1839->645|1855->652|1881->657|1927->676|1943->683|1976->695|2022->714|2038->721|2070->732|2170->804|2199->805|2228->806|2261->812|2277->819|2307->828|2351->844|2380->845|2409->846|2525->935|2541->942|2571->951|2676->1026|2704->1027
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|62->31|62->31|62->31|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|66->35|67->36
                  -- GENERATED --
              */
          