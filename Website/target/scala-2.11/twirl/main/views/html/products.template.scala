
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Stock],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[Stock]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("List of all products pages.")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""

"""),format.raw/*5.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron headline-img">
  <div class="container">
    <h1>Hello, world!</h1>
    <p><a class="btn btn-primary btn-lg" href="/products/iphone6" role="button">Learn more &raquo;</a></p>
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
    </tr>
"""),_display_(/*22.2*/for(product <- products) yield /*22.26*/{_display_(Seq[Any](format.raw/*22.27*/("""
    """),format.raw/*23.5*/("""<tr>
        <td>"""),_display_(/*24.14*/product/*24.21*/.stock_id),format.raw/*24.30*/("""</td>
        <td>"""),_display_(/*25.14*/product/*25.21*/.category_id),format.raw/*25.33*/("""</td>
        <td>"""),_display_(/*26.14*/product/*26.21*/.name),format.raw/*26.26*/("""</td>
        <td>"""),_display_(/*27.14*/product/*27.21*/.total_stock),format.raw/*27.33*/("""</td>
        <td>"""),_display_(/*28.14*/product/*28.21*/.unit_price),format.raw/*28.32*/("""</td>
    </tr>
""")))}),format.raw/*30.2*/("""
"""),format.raw/*31.1*/("""</table>

<!--
<form action="addProduct" method="post">
    <input type="text" name="stock_id" placeholder="Stock ID">
    <input type="text" name="category_id" placeholder="Category ID">
    <input type="text" name="name" placeholder="Name">
    <input type="text" name="total_stock" placeholder="Total Stock">
    <input type="text" name="unit_price" placeholder="Price">
</form>
-->

</div>

""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(products:List[Stock]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[Stock]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Tue Sep 29 15:42:54 BST 2015
                  SOURCE: /Users/mpe12/BSkyBProject/Website/app/views/products.scala.html
                  HASH: 6bf501e8b579897eda19bc3d009ea7c4b79b3f5c
                  MATRIX: 756->1|874->24|902->27|945->62|984->64|1012->66|1544->572|1584->596|1623->597|1655->602|1700->620|1716->627|1746->636|1792->655|1808->662|1841->674|1887->693|1903->700|1929->705|1975->724|1991->731|2024->743|2070->762|2086->769|2118->780|2165->797|2193->798|2619->1194
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|62->31|76->45
                  -- GENERATED --
              */
          