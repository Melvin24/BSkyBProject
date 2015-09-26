
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

class item extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(item: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/main("individual product page")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""

"""),format.raw/*5.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
  <div class="container">
    <h1>"""),_display_(/*8.10*/item),format.raw/*8.14*/("""</h1>
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

  def render(item:String): play.twirl.api.HtmlFormat.Appendable = apply(item)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (item) => apply(item)

  def ref: this.type = this

}


}

/**/
object item extends item_Scope0.item
              /*
                  -- GENERATED --
                  DATE: Fri Sep 25 15:34:22 BST 2015
                  SOURCE: /Users/rsp04/Websites/BSkyBProject/Website/app/views/item.scala.html
                  HASH: 6ef2cf6cb1e92bb4e3a27bc7ec61ed6cde8bab3c
                  MATRIX: 743->1|852->15|880->18|919->49|958->51|986->53|1145->186|1169->190|1387->378
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|49->18
                  -- GENERATED --
              */
          