
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_item_Scope0 {
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

class create_item extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Stock],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(create_item: Form[Stock]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Create a new product for the catalogue.")/*5.49*/ {_display_(Seq[Any](format.raw/*5.51*/("""


"""),format.raw/*8.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
  <div class="container">
      <h1>Add a product.</h1>
      <p>Blah blah blah.</p>
  </div>
</div>
<div class="container">
"""),_display_(/*16.2*/helper/*16.8*/.form(action = routes.Application.save() )/*16.50*/{_display_(Seq[Any](format.raw/*16.51*/("""
            """),format.raw/*17.13*/("""<div class="row">
                <div class="col-xs-12">
                """),_display_(/*19.18*/helper/*19.24*/.inputText(create_item("name"), '_label -> "Product Title:")),format.raw/*19.84*/("""
                """),format.raw/*20.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*24.18*/helper/*24.24*/.inputText(create_item("category_id"), '_label -> "Category ID:")),format.raw/*24.89*/("""
                """),format.raw/*25.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*29.18*/helper/*29.24*/.inputText(create_item("unit_price"), '_label -> "Price:")),format.raw/*29.82*/("""
                """),format.raw/*30.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                 <input type="submit" value="Create New Item" class="btn primary">
                </div>
            </div>
        """)))}),format.raw/*37.10*/("""
"""),format.raw/*38.1*/("""</div>

""")))}),format.raw/*40.2*/("""
"""))
      }
    }
  }

  def render(create_item:Form[Stock]): play.twirl.api.HtmlFormat.Appendable = apply(create_item)

  def f:((Form[Stock]) => play.twirl.api.HtmlFormat.Appendable) = (create_item) => apply(create_item)

  def ref: this.type = this

}


}

/**/
object create_item extends create_item_Scope0.create_item
              /*
                  -- GENERATED --
                  DATE: Thu Oct 01 12:33:10 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/create_item.scala.html
                  HASH: 94d41070f4bf79d14cd626f29a2099519073c5fa
                  MATRIX: 762->1|898->27|926->46|953->48|1008->95|1047->97|1076->100|1326->324|1340->330|1391->372|1430->373|1471->386|1573->461|1588->467|1669->527|1714->544|1854->657|1869->663|1955->728|2000->745|2140->858|2155->864|2234->922|2279->939|2540->1169|2568->1170|2607->1179
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|38->8|46->16|46->16|46->16|46->16|47->17|49->19|49->19|49->19|50->20|54->24|54->24|54->24|55->25|59->29|59->29|59->29|60->30|67->37|68->38|70->40
                  -- GENERATED --
              */
          