
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
      You are signed in, please checkout using the form below...
  </div>
</div>

<div class="container">
"""),_display_(/*16.2*/helper/*16.8*/.form(action = routes.Application.save() )/*16.50*/{_display_(Seq[Any](format.raw/*16.51*/("""
            """),format.raw/*17.13*/("""<div class="row">
            """),_display_(/*18.14*/helper/*18.20*/.inputText(checkout("forename"))),format.raw/*18.52*/("""
            """),format.raw/*19.13*/("""</div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*22.18*/helper/*22.24*/.inputText(checkout("surname"))),format.raw/*22.55*/("""
                """),format.raw/*23.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*27.18*/helper/*27.24*/.inputText(checkout("sky_customer_id"))),format.raw/*27.63*/("""
                """),format.raw/*28.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*32.18*/helper/*32.24*/.inputText(checkout("address_id"))),format.raw/*32.58*/("""
                """),format.raw/*33.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*37.18*/helper/*37.24*/.inputText(checkout("customer_id"))),format.raw/*37.59*/("""
                """),format.raw/*38.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                 <input type="submit" value="SHIP" class="btn primary">
                </div>
            </div>
            
            <!-- update database order status. send email notification/sms from twillo -->
        """)))}),format.raw/*47.10*/("""
"""),format.raw/*48.1*/("""</div>

""")))}),format.raw/*50.2*/("""
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
                  DATE: Thu Oct 01 12:33:10 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/checkout.scala.html
                  HASH: 45bdad90e0b72b831cd1eace25685ca8ed4a095c
                  MATRIX: 759->1|895->27|923->46|950->48|994->84|1033->86|1061->88|1336->337|1350->343|1401->385|1440->386|1481->399|1539->430|1554->436|1607->468|1648->481|1769->575|1784->581|1836->612|1881->629|2021->742|2036->748|2096->787|2141->804|2281->917|2296->923|2351->957|2396->974|2536->1087|2551->1093|2607->1128|2652->1145|3006->1468|3034->1469|3073->1478
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|46->16|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|52->22|52->22|52->22|53->23|57->27|57->27|57->27|58->28|62->32|62->32|62->32|63->33|67->37|67->37|67->37|68->38|77->47|78->48|80->50
                  -- GENERATED --
              */
          