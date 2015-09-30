
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
"""),_display_(/*5.2*/main("test")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""

"""),format.raw/*7.1*/("""<h1>Add a product</h1>
<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
  <div class="container">
        """),_display_(/*11.10*/helper/*11.16*/.form(action = routes.Application.save() )/*11.58*/{_display_(Seq[Any](format.raw/*11.59*/("""
            """),format.raw/*12.13*/("""<div class="row">
            """),_display_(/*13.14*/helper/*13.20*/.inputText(create_item("stock_id"))),format.raw/*13.55*/("""
            """),format.raw/*14.13*/("""</div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*17.18*/helper/*17.24*/.inputText(create_item("category_id"))),format.raw/*17.62*/("""
                """),format.raw/*18.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*22.18*/helper/*22.24*/.inputText(create_item("name"))),format.raw/*22.55*/("""
                """),format.raw/*23.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*27.18*/helper/*27.24*/.inputText(create_item("total_stock"))),format.raw/*27.62*/("""
                """),format.raw/*28.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                """),_display_(/*32.18*/helper/*32.24*/.inputText(create_item("unit_price"))),format.raw/*32.61*/("""
                """),format.raw/*33.17*/("""</div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                 <input type="submit" value="Create New Item" class="btn primary">
                </div>
            </div>
        """)))}),format.raw/*40.10*/("""
        """),format.raw/*41.9*/("""</div>
    </div>
<div class="container">

</div>

""")))}),format.raw/*47.2*/("""
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
                  DATE: Wed Sep 30 17:20:30 BST 2015
                  SOURCE: /Users/rsp04/Websites/Wednesday/BSkyBProject/Website/app/views/create_item.scala.html
                  HASH: b2bfea629de48f7907a7fc89b2a29255440ded4f
                  MATRIX: 762->1|898->27|926->46|953->48|973->60|1012->62|1040->64|1223->220|1238->226|1289->268|1328->269|1369->282|1427->313|1442->319|1498->354|1539->367|1660->461|1675->467|1734->505|1779->522|1919->635|1934->641|1986->672|2031->689|2171->802|2186->808|2245->846|2290->863|2430->976|2445->982|2503->1019|2548->1036|2809->1266|2845->1275|2927->1327
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|41->11|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|47->17|47->17|47->17|48->18|52->22|52->22|52->22|53->23|57->27|57->27|57->27|58->28|62->32|62->32|62->32|63->33|70->40|71->41|77->47
                  -- GENERATED --
              */
          