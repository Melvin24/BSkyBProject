
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object product_Scope0 {
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

class product extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("individual product page")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""

"""),format.raw/*5.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron headline-img">
  <div class="container">
    <h1>Hello, world!</h1>
    <p>"""),_display_(/*9.9*/products),format.raw/*9.17*/("""</p>
    <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p>
  </div>
</div>

<div class="container">
  Product pages.
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
object product extends product_Scope0.product
              /*
                  -- GENERATED --
                  DATE: Fri Sep 25 14:36:45 BST 2015
                  SOURCE: /Users/rsp04/Websites/BSkyBProject/Website/app/views/product.scala.html
                  HASH: e7b77f467b795e8ceda83c3927b6d1c210fef0c0
                  MATRIX: 749->1|862->19|890->22|929->53|968->55|996->57|1193->229|1221->237|1414->400
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|49->18
                  -- GENERATED --
              */
          