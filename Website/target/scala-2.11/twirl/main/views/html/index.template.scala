
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Customer],List[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[Customer], users: List[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.49*/("""


"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""



"""),_display_(/*8.2*/for(customer <- customers) yield /*8.28*/{_display_(Seq[Any](format.raw/*8.29*/("""
    """),_display_(/*9.6*/customer/*9.14*/.surname),format.raw/*9.22*/("""
    """),format.raw/*10.5*/("""<br />
    """),_display_(/*11.6*/customer/*11.14*/.forename),format.raw/*11.23*/("""
""")))}),format.raw/*12.2*/("""

"""),_display_(/*14.2*/for(user <- users) yield /*14.20*/{_display_(Seq[Any](format.raw/*14.21*/("""
    """),_display_(/*15.6*/user/*15.10*/.sky_id),format.raw/*15.17*/("""
""")))}),format.raw/*16.2*/("""
"""),format.raw/*17.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron headline-img blue">
  <div class="container">
    <h1>Hello, world!</h1>
    <p></p>
    <p><a class="btn btn-primary btn-lg" href="/products" role="button">Learn more &raquo;</a></p>
  </div>
</div>

<div class="container">
  <!-- Example row of columns -->
  <div class="row">
    <div class="col-md-4">
      <h2>Heading</h2>
      <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
      <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
    </div>
    <div class="col-md-4">
      <h2>Heading</h2>
      <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
      <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
   </div>
    <div class="col-md-4">
      <h2>Heading</h2>
      <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
      <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
    </div>
  </div>

""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(customers:List[Customer],users:List[Users]): play.twirl.api.HtmlFormat.Appendable = apply(customers,users)

  def f:((List[Customer],List[Users]) => play.twirl.api.HtmlFormat.Appendable) = (customers,users) => apply(customers,users)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Sep 28 15:18:14 BST 2015
                  SOURCE: /Users/mpe12/BSkyBProject/Website/app/views/index.scala.html
                  HASH: 2046569dbb05ef4c040b07fe25437d590f61e7f0
                  MATRIX: 765->1|907->48|936->52|967->75|1006->77|1036->82|1077->108|1115->109|1146->115|1162->123|1190->131|1222->136|1260->148|1277->156|1307->165|1339->167|1368->170|1402->188|1441->189|1473->195|1486->199|1514->206|1546->208|1574->209|3185->1790
                  LINES: 27->1|32->1|35->4|35->4|35->4|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|45->14|45->14|45->14|46->15|46->15|46->15|47->16|48->17|77->46
                  -- GENERATED --
              */
          