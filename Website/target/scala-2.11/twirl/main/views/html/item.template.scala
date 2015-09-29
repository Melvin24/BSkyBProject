
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
    <h1>"""),_display_(/*8.10*/item/*8.14*/.name),format.raw/*8.19*/("""</h1>
    <p>Short description.</p>
    <p><a class="btn btn-primary btn-lg" href="/" role="button">Home!</a></p>
  </div>
</div>

<div class="container">
  Individual item page.
</div>

""")))}),format.raw/*18.2*/("""
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
                  DATE: Tue Sep 29 15:43:27 BST 2015
                  SOURCE: /Users/mpe12/BSkyBProject/Website/app/views/item.scala.html
                  HASH: 5aedae0d6257c4f49b9418fb80865ac0dc6fb81a
                  MATRIX: 742->1|850->14|878->17|917->48|956->50|984->52|1143->185|1155->189|1180->194|1398->382
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|49->18
                  -- GENERATED --
              */
          