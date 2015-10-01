
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object phones_Scope0 {
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

class phones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("List of all products pages.")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),format.raw/*4.3*/("""<ol class="breadcrumb breadCrumbStyle">
    <li><a href="/">Home</a></li>
    <li><a href="/phones">Phones</a></li>
  </ol>



</div>
  <h1 class="centerText">Phones</h1>


<div class="row thumbnailContainer" id ="mainThumbnail">
  <div class="col-sm-4 col-md-3 phonePageLeftImage">
    <div class="thumbnail">
      <img src=""""),_display_(/*18.18*/routes/*18.24*/.Assets.versioned("images/skyPhone6.png")),format.raw/*18.65*/(""""/>
      <p class="centerText">Sky Phone 6 - <span class="price">£100.00</span></p>
      <div class="caption productCaption">
        <button type="button" class="btn decItem" id="dec1" itemNumber="1"><span class="glyphicon glyphicon-minus-sign red"></span></button>
        <input type="text" class="quantityWidth centerText" id="quantityItem1" value ="0">
        <button type="button" class="btn incItem" id = "inc1" itemNumber="1"><span class="glyphicon glyphicon-plus-sign green"></span></button>
      </div>
      <div>
        <button type="button" class="btn btn-success addToBasketButton" id = "addToBasket1" itemNumber="1" itemid="12192" itemType="phone" unitPrice="100" imagePath=""""),_display_(/*26.168*/routes/*26.174*/.Assets.versioned("images/skyPhone6-small.png")),format.raw/*26.221*/("""">Add To Basket</button>
    </div>
  </div>
</div>

<div class="col-sm-4 col-md-3 phonePageRightImage">
  <div class="thumbnail">
    <img src=""""),_display_(/*33.16*/routes/*33.22*/.Assets.versioned("images/skyPhone5.png")),format.raw/*33.63*/(""""/>
    <p class="centerText">Sky Phone 5 - <span class="price">£75.00</span></p>
    <div class="caption productCaption">
      <button type="button" class="btn decItem" id="dec2" itemNumber="2"><span class="glyphicon glyphicon-minus-sign red"></span></button>
      <input type="text" class="quantityWidth centerText" id="quantityItem2" value ="0">
      <button type="button" class="btn incItem" id = "inc2" itemNumber="2"><span class="glyphicon glyphicon-plus-sign green"></span></button>
    </div>
    <div>
      <button type="button" class="btn btn-success addToBasketButton" id = "addToBasket2" itemNumber="2" itemid="12212" itemType="phone" unitPrice = "75" imagePath = """"),_display_(/*41.169*/routes/*41.175*/.Assets.versioned("images/skyPhone5-small.png")),format.raw/*41.222*/("""">Add To Basket</button>
  </div>
</div>
</div>


</div>

""")))}),format.raw/*49.2*/("""
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
object phones extends phones_Scope0.phones
              /*
                  -- GENERATED --
                  DATE: Thu Oct 01 16:10:12 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/phones.scala.html
                  HASH: a13cc99750ba0d9b04efa47825412e7ea3b041be
                  MATRIX: 747->1|860->19|888->22|931->57|970->59|999->62|1354->390|1369->396|1431->437|2155->1133|2171->1139|2240->1186|2413->1332|2428->1338|2490->1379|3200->2061|3216->2067|3285->2114|3374->2173
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|49->18|49->18|49->18|57->26|57->26|57->26|64->33|64->33|64->33|72->41|72->41|72->41|80->49
                  -- GENERATED --
              */
          