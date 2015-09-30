
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object show_cart_Scope0 {
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

class show_cart extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Orders,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(show_cart: Orders):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/main("Trolley")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*5.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron headline-img">
  <div class="container">
    <h1>Your shopping trolley.</h1>
    <p></p>
  </div>
</div>


""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(show_cart:Orders): play.twirl.api.HtmlFormat.Appendable = apply(show_cart)

  def f:((Orders) => play.twirl.api.HtmlFormat.Appendable) = (show_cart) => apply(show_cart)

  def ref: this.type = this

}


}

/**/
object show_cart extends show_cart_Scope0.show_cart
              /*
                  -- GENERATED --
                  DATE: Wed Sep 30 14:47:18 BST 2015
                  SOURCE: /Users/rsp04/Websites/Wednesday/BSkyBProject/Website/app/views/show_cart.scala.html
                  HASH: cf4074a374f33a33c630a44653e3c7be0aa4d606
                  MATRIX: 753->1|867->20|895->23|918->38|957->40|985->42|1219->246
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|45->14
                  -- GENERATED --
              */
          