
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(hello : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""


"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""



"""),format.raw/*8.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
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

""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(hello:String): play.twirl.api.HtmlFormat.Appendable = apply(hello)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (hello) => apply(hello)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Sep 29 15:42:53 BST 2015
                  SOURCE: /Users/mpe12/BSkyBProject/Website/app/views/index.scala.html
                  HASH: 21d4e94d0807f96e99613abefd8136fa3d37a03e
                  MATRIX: 745->1|856->17|885->21|916->44|955->46|985->50|2596->1631
                  LINES: 27->1|32->1|35->4|35->4|35->4|39->8|68->37
                  -- GENERATED --
              */
          