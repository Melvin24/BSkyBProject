
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""


"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""



"""),format.raw/*8.1*/("""Size: """),_display_(/*8.8*/customers/*8.17*/.size()),format.raw/*8.24*/("""


"""),_display_(/*11.2*/for(customer <- customers) yield /*11.28*/{_display_(Seq[Any](format.raw/*11.29*/("""
    """),_display_(/*12.6*/customer/*12.14*/.surname),format.raw/*12.22*/("""
    """),format.raw/*13.5*/("""<br />
    """),_display_(/*14.6*/customer/*14.14*/.forename),format.raw/*14.23*/("""
""")))}),format.raw/*15.2*/("""
"""),format.raw/*16.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
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

""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(customers:List[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Sep 28 14:26:38 BST 2015
                  SOURCE: /Users/mpe12/BSkyBProject/Website/app/views/index.scala.html
                  HASH: 5a83e79f6befee12e0a263b4dea779d29f834f60
                  MATRIX: 753->1|875->28|904->32|935->55|974->57|1004->61|1036->68|1053->77|1080->84|1110->88|1152->114|1191->115|1223->121|1240->129|1269->137|1301->142|1339->154|1356->162|1386->171|1418->173|1446->174|3057->1755
                  LINES: 27->1|32->1|35->4|35->4|35->4|39->8|39->8|39->8|39->8|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|76->45
                  -- GENERATED --
              */
          