
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("List of all products pages.")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""

  """),format.raw/*5.3*/("""<div id="carousel" class="carousel slide carousel-fade" data-ride="carousel">
      <ol class="carousel-indicators">
          <li data-target="#carousel" data-slide-to="0" class="active"></li>
          <li data-target="#carousel" data-slide-to="1"></li>
          <li data-target="#carousel" data-slide-to="2"></li>
      </ol>
      <!-- Carousel items -->
      <div class="carousel-inner">
          <div class="active item"><img class="carouselImage" src=""""),_display_(/*13.69*/routes/*13.75*/.Assets.versioned("images/tShirtCarouselText.png")),format.raw/*13.125*/(""""/></div>
          <div class="item"><img class="carouselImage" src=""""),_display_(/*14.62*/routes/*14.68*/.Assets.versioned("images/iPhone6carousel.png")),format.raw/*14.115*/(""""/></div>
          <div class="item"><img class="carouselImage" src=""""),_display_(/*15.62*/routes/*15.68*/.Assets.versioned("images/gnomeCarouselText.png")),format.raw/*15.117*/(""""/></div>
      </div>
      <!-- Carousel nav -->
      <a class="carousel-control left" href="#carousel" data-slide="prev">&lsaquo;</a>
      <a class="carousel-control right" href="#carousel" data-slide="next">&rsaquo;</a>
  </div>

<p><a href="/sendsms">Send Twillo</a></p>

<div class="row" id ="mainThumbnail">
  <div class="col-sm-4 col-md-3">
    <div class="thumbnail">
      <img src=""""),_display_(/*27.18*/routes/*27.24*/.Assets.versioned("images/mensTshirt.png")),format.raw/*27.66*/(""""/>
      <div class="caption productCaption">
        <p><a href="/tshirts" class="btn btn-primary" role="button">Shop T-Shirts</a> </p>
      </div>
    </div>
  </div>
  <div class="col-sm-4 col-md-3">
    <div class="thumbnail">
      <img src=""""),_display_(/*35.18*/routes/*35.24*/.Assets.versioned("images/skyPhone5.png")),format.raw/*35.65*/(""""/>
      <div class="caption productCaption">
        <p><a href="/phones" class="btn btn-primary" role="button">Shop Phones</a> </p>
      </div>
    </div>
  </div>
  <div class="col-sm-4 col-md-3">
    <div class="thumbnail">
      <img src=""""),_display_(/*43.18*/routes/*43.24*/.Assets.versioned("images/gnome.png")),format.raw/*43.61*/(""""/>
      <div class="caption productCaption">
        <p><a href="/gnomes" class="btn btn-primary" role="button">Shop Gnomes</a> </p>
      </div>
    </div>
  </div>
</div>

""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(products:String): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Thu Oct 01 16:20:31 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/home.scala.html
                  HASH: 063c73cb3d400299702d140b9ba323d311e8c829
                  MATRIX: 743->1|856->19|884->22|927->57|966->59|996->63|1486->526|1501->532|1573->582|1671->653|1686->659|1755->706|1853->777|1868->783|1939->832|2362->1228|2377->1234|2440->1276|2717->1526|2732->1532|2794->1573|3068->1820|3083->1826|3141->1863|3348->2040
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|58->27|58->27|58->27|66->35|66->35|66->35|74->43|74->43|74->43|82->51
                  -- GENERATED --
              */
          