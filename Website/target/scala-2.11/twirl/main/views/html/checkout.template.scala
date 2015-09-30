
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object checkout_Scope0 {
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

class checkout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(checkout: Form[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Checkout from the Sky Store.")/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""

"""),format.raw/*7.1*/("""<h1>Checkout</h1>
<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
  <div class="container">
        """),_display_(/*11.10*/helper/*11.16*/.form(action = routes.Application.save() )/*11.58*/{_display_(Seq[Any](format.raw/*11.59*/("""
            """),format.raw/*12.13*/("""<div class="row">
            """),_display_(/*13.14*/helper/*13.20*/.inputText(checkout("forename"))),format.raw/*13.52*/("""
            """),format.raw/*14.13*/("""</div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*17.18*/helper/*17.24*/.inputText(checkout("surname"))),format.raw/*17.55*/("""
                """),format.raw/*18.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*22.18*/helper/*22.24*/.inputText(checkout("sky_id"))),format.raw/*22.54*/("""
                """),format.raw/*23.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                 <input type="submit" value="SHIP" class="btn primary">
                </div>
            </div>
        """)))}),format.raw/*30.10*/("""
        """),format.raw/*31.9*/("""</div>
    </div>
<div class="container">

</div>

""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(checkout:Form[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(checkout)

  def f:((Form[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (checkout) => apply(checkout)

  def ref: this.type = this

}


}

/**/
object checkout extends checkout_Scope0.checkout
              /*
                  -- GENERATED --
                  DATE: Wed Sep 30 15:17:37 BST 2015
                  SOURCE: /Users/rsp04/Websites/Wednesday/BSkyBProject/Website/app/views/checkout.scala.html
                  HASH: 47a21c7b45da8c1840644b4136bac05a28efe3dc
                  MATRIX: 759->1|895->27|923->46|950->48|994->84|1033->86|1061->88|1239->239|1254->245|1305->287|1344->288|1385->301|1443->332|1458->338|1511->370|1552->383|1673->477|1688->483|1740->514|1785->531|1925->644|1940->650|1991->680|2036->697|2286->916|2322->925|2404->977
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|41->11|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|47->17|47->17|47->17|48->18|52->22|52->22|52->22|53->23|60->30|61->31|67->37
                  -- GENERATED --
              */
          