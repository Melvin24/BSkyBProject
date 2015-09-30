
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
        <th>&nbsp</th>
    </tr>
"""),_display_(/*23.2*/for(product <- products) yield /*23.26*/{_display_(Seq[Any](format.raw/*23.27*/("""
    """),format.raw/*24.5*/("""<tr>
        <td>"""),_display_(/*25.14*/product/*25.21*/.stock_id),format.raw/*25.30*/("""</td>
        <td>"""),_display_(/*26.14*/product/*26.21*/.category_id),format.raw/*26.33*/("""</td>
        <td>"""),_display_(/*27.14*/product/*27.21*/.name),format.raw/*27.26*/("""</td>
        <td>"""),_display_(/*28.14*/product/*28.21*/.total_stock),format.raw/*28.33*/("""</td>
        <td>"""),_display_(/*29.14*/product/*29.21*/.unit_price),format.raw/*29.32*/("""</td>
        <td><input type="button" class="btn btn-primary" value="Delete"></td>
    </tr>
""")))}),format.raw/*32.2*/("""
"""),format.raw/*33.1*/("""</table>

</div>

""")))}),format.raw/*37.2*/("""
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
                  DATE: Wed Sep 30 07:30:40 BST 2015
                  SOURCE: /Users/mpe12/BSkyBProject/Website/app/views/products.scala.html
                  HASH: c911e9a64154157e7f1db02db589a585844338bc
                  MATRIX: 756->1|874->24|902->27|945->62|984->64|1012->66|1567->595|1607->619|1646->620|1678->625|1723->643|1739->650|1769->659|1815->678|1831->685|1864->697|1910->716|1926->723|1952->728|1998->747|2014->754|2047->766|2093->785|2109->792|2141->803|2266->898|2294->899|2343->918
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|63->32|64->33|68->37
                  -- GENERATED --
              */
          