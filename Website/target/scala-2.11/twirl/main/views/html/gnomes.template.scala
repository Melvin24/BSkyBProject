
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object gnomes_Scope0 {
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

class gnomes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("List of all products pages.")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),format.raw/*4.3*/("""<ol class="breadcrumb breadCrumbStyle">
    <li><a href="/">Home</a></li>
    <li><a href="/gnomes">Gnomes</a></li>
  </ol>


<h1 class="centerText">Gnomes</h1>

<div id="gnomeContainer">
  <div class="row gnomeContainer" id ="mainThumbnail">
    <div class="col-sm-4 col-md-3 gnomePageImage">
      <div class="thumbnail">
        <img id="gnome-1" src=""""),_display_(/*16.33*/routes/*16.39*/.Assets.versioned("images/gnome.png")),format.raw/*16.76*/(""""/>
        <p class="centerText">Magical Gnome - <span class="price">£5.00</span></p>
        <div class="caption productCaption">
          <button type="button" class="btn decItem" id="dec1" itemNumber="1"><span class="glyphicon glyphicon-minus-sign red"></span></button>
          <input type="text" class="quantityWidth centerText" id="quantityItem1" value ="0">
          <button type="button" class="btn incItem" id = "inc1" itemNumber="1"><span class="glyphicon glyphicon-plus-sign green"></span></button>
        </div>
        <div>
          <button type="button" class="btn btn-success addToBasketButton" id = "addToBasket1" itemID="12122" itemNumber="1" itemType="gnome" unitPrice="5" imagePath=""""),_display_(/*24.168*/routes/*24.174*/.Assets.versioned("images/gnome-small.png")),format.raw/*24.217*/("""")>Add To Basket</button>
        </div>
      </div>
    </div>
  </div>
</div>

""")))}),format.raw/*31.2*/("""
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
object gnomes extends gnomes_Scope0.gnomes
              /*
                  -- GENERATED --
                  DATE: Thu Oct 01 16:10:12 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/gnomes.scala.html
                  HASH: 8a59a1ba006b7e7886092bcad55b3609ae6c87f1
                  MATRIX: 747->1|860->19|888->22|931->57|970->59|999->62|1382->418|1397->424|1455->461|2193->1171|2209->1177|2274->1220|2387->1303
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|47->16|47->16|47->16|55->24|55->24|55->24|62->31
                  -- GENERATED --
              */
          