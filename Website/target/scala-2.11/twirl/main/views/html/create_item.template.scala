
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
    <p><a class="btn btn-primary btn-lg" href="/" role="button"></a></p>
  </div>
</div>

<div class="container">
"""),_display_(/*16.2*/helper/*16.8*/.form(action = routes.Application.save() )/*16.50*/{_display_(Seq[Any](format.raw/*16.51*/("""
    """),_display_(/*17.6*/helper/*17.12*/.inputText(create_item("stock_id"),'_label -> "Stock ID", '_help -> "")),format.raw/*17.83*/("""
    """),_display_(/*18.6*/helper/*18.12*/.inputText(create_item("category_id"),'_label -> "Category ID", '_help -> "")),format.raw/*18.89*/("""
    """),_display_(/*19.6*/helper/*19.12*/.inputText(create_item("name"),'_label -> "Name", '_help -> "")),format.raw/*19.75*/("""
    """),_display_(/*20.6*/helper/*20.12*/.inputText(create_item("total_stock"),'_label -> "Total Stock", '_help -> "")),format.raw/*20.89*/("""
    """),_display_(/*21.6*/helper/*21.12*/.inputText(create_item("unit_price"),'_label -> "Price", '_help -> "")),format.raw/*21.82*/("""
    """),format.raw/*22.5*/("""<input type="submit" value="Create New Item" class="btn primary">   
""")))}),format.raw/*23.2*/("""

"""),format.raw/*25.1*/("""</div>

""")))}),format.raw/*27.2*/("""
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
                  DATE: Tue Sep 29 17:48:29 BST 2015
                  SOURCE: /Users/mpe12/BSkyBProject/Website/app/views/create_item.scala.html
                  HASH: 8786577d32143502f8017651c9bfeabba023195d
                  MATRIX: 762->1|898->27|926->46|953->48|973->60|1012->62|1040->64|1328->326|1342->332|1393->374|1432->375|1464->381|1479->387|1571->458|1603->464|1618->470|1716->547|1748->553|1763->559|1847->622|1879->628|1894->634|1992->711|2024->717|2039->723|2130->793|2162->798|2262->868|2291->870|2330->879
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|46->16|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|55->25|57->27
                  -- GENERATED --
              */
          