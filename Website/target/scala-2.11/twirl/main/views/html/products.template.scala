
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("List of all products pages.")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""

"""),format.raw/*5.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron headline-img">
  <div class="container">
    <h1>Hello, world!</h1>
    <p>"""),_display_(/*9.9*/products),format.raw/*9.17*/("""</p>
    <p><a class="btn btn-primary btn-lg" href="/products/iphone6" role="button">Learn more &raquo;</a></p>
  </div>
</div>

<div class="container">
  List of all products pages.
</div>

""")))}),format.raw/*18.2*/("""
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
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Fri Sep 25 14:47:56 BST 2015
                  SOURCE: /Users/rsp04/Websites/BSkyBProject/Website/app/views/products.scala.html
                  HASH: 020db44bd32ed1348c0a9f0ca7ca6a9ab91b4a0e
                  MATRIX: 751->1|864->19|892->22|935->57|974->59|1002->61|1199->233|1227->241|1449->433
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|49->18
                  -- GENERATED --
              */
          