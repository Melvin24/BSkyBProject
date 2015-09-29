
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


"""),_display_(/*6.2*/for(product <- products) yield /*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
    """),_display_(/*7.6*/product/*7.13*/.stock_id),format.raw/*7.22*/("""
""")))}),format.raw/*8.2*/("""
"""),format.raw/*9.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron headline-img">
  <div class="container">
    <h1>Hello, world!</h1>
    <p><a class="btn btn-primary btn-lg" href="/products/iphone6" role="button">Learn more &raquo;</a></p>
  </div>
</div>

<div class="container">
  List of all products pages.
</div>

""")))}),format.raw/*21.2*/("""
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
                  DATE: Tue Sep 29 11:51:50 BST 2015
                  SOURCE: /Users/mpe12/BSkyBProject/Website/app/views/products.scala.html
                  HASH: dcd79448eccd49c0d823c66a9d54dfd5606f90e8
                  MATRIX: 756->1|874->24|902->27|945->62|984->64|1013->68|1052->92|1090->93|1121->99|1136->106|1165->115|1196->117|1223->118|1604->469
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|52->21
                  -- GENERATED --
              */
          