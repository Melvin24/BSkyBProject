
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object item_Scope0 {
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

class item extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Stock,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(item: Stock):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("individual product page")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""

"""),format.raw/*5.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
  <div class="container">
    <h1>Item Name: """),_display_(/*8.21*/item/*8.25*/.name),format.raw/*8.30*/("""</h1>
    <h3>Total Left: """),_display_(/*9.22*/item/*9.26*/.total_stock),format.raw/*9.38*/("""</h3>
    <h3>Price: """),_display_(/*10.17*/item/*10.21*/.unit_price),format.raw/*10.32*/("""</h3>
    <p><a class="btn btn-primary btn-lg" href="/" role="button">Home!</a></p>
  </div>
</div>

<div class="container">
  Individual item page.
</div>

""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(item:Stock): play.twirl.api.HtmlFormat.Appendable = apply(item)

  def f:((Stock) => play.twirl.api.HtmlFormat.Appendable) = (item) => apply(item)

  def ref: this.type = this

}


}

/**/
object item extends item_Scope0.item
              /*
                  -- GENERATED --
                  DATE: Thu Oct 01 12:33:10 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/item.scala.html
                  HASH: d536c6455d1829a369e07831f46e7ff1435b416e
                  MATRIX: 742->1|850->14|878->17|917->48|956->50|984->52|1154->196|1166->200|1191->205|1244->232|1256->236|1288->248|1337->270|1350->274|1382->285|1570->443
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|50->19
                  -- GENERATED --
              */
          