
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tshirts_Scope0 {
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

class tshirts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("List of all products pages.")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),format.raw/*4.3*/("""<ol class="breadcrumb breadCrumbStyle">
    <li><a href="/">Home</a></li>
    <li><a href="/products">T-Shirts</a></li>
  </ol>



<!-- Main jumbotron for a primary marketing message or call to action
<div class="jumbotron headline-img">
  <div class="container">
    <p>"""),_display_(/*14.9*/products),format.raw/*14.17*/("""</p>
    <p><a class="btn btn-primary btn-lg" href="/products/iphone6" role="button">Learn more &raquo;</a></p>
  </div>
<div id = "productsContainer">
  <div id = "filterDiv">

  </div>
glyphicon glyphicon-plus-sign
</div>-->
</div>
  <h1 class="centerText"> T-Shirts</h1>


<div class="row thumbnailContainer" id ="mainThumbnail">
  <div class="col-sm-4 col-md-3 tshirtPageLeftImage">
    <div class="thumbnail">
      <img id="tshirt-1" src=""""),_display_(/*30.32*/routes/*30.38*/.Assets.versioned("images/mensTshirt.png")),format.raw/*30.80*/(""""/>
      <p class="centerText">Mens T-Shirt - <span class="price">£10.00</span></p>
      <div class="caption productCaption">
        <button type="button" class="btn decItem" id="dec1" itemNumber="1"><span class="glyphicon glyphicon-minus-sign red"></span></button>
        <input type="text" class="quantityWidth centerText" id="quantityItem1" value ="0">
        <button type="button" class="btn incItem" id = "inc1" itemNumber="1"><span class="glyphicon glyphicon-plus-sign green"></span></button>
      </div>
      <div>
        <button type="button" class="btn btn-success addToBasketButton" id = "addToBasket1" itemNumber="1" itemType="tshirt" unitPrice="10" imagePath = """"),_display_(/*38.155*/routes/*38.161*/.Assets.versioned("images/mensTshirt-small.png")),format.raw/*38.209*/("""">Add To Basket</button>
    </div>
  </div>
</div>

<div class="col-sm-4 col-md-3 tshirtPageRightImage">
  <div class="thumbnail">
    <img id="tshirt-2" src=""""),_display_(/*45.30*/routes/*45.36*/.Assets.versioned("images/womensTshirt.png")),format.raw/*45.80*/(""""/>
    <p class="centerText">Ladies T-Shirt - <span class="price">£10.00</span></p>
    <div class="caption productCaption">
      <button itemType="button" class="btn decItem" id="dec2" itemNumber="2"><span class="glyphicon glyphicon-minus-sign red"></span></button>
      <input type="text" class="quantityWidth centerText" id="quantityItem2" value ="0">
      <button type="button" class="btn incItem" id = "inc2" itemNumber="2"><span class="glyphicon glyphicon-plus-sign green"></span></button>
    </div>
    <div>
      <button type="button" class="btn btn-success addToBasketButton" id = "addToBasket2" itemNumber="2" itemType="tshirt" unitPrice="10" imagePath = """"),_display_(/*53.153*/routes/*53.159*/.Assets.versioned("images/womensTshirt-small.png")),format.raw/*53.209*/("""">Add To Basket</button>
  </div>
</div>
</div>


</div>

""")))}),format.raw/*61.2*/("""
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
object tshirts extends tshirts_Scope0.tshirts
              /*
                  -- GENERATED --
                  DATE: Thu Oct 01 10:39:19 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/tshirts.scala.html
                  HASH: 08d8503c4324374fc2521009b68f8ed47b61956c
                  MATRIX: 749->1|862->19|890->22|933->57|972->59|1001->62|1299->334|1328->342|1801->788|1816->794|1879->836|2590->1519|2606->1525|2676->1573|2864->1734|2879->1740|2944->1784|3645->2457|3661->2463|3733->2513|3822->2572
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|45->14|45->14|61->30|61->30|61->30|69->38|69->38|69->38|76->45|76->45|76->45|84->53|84->53|84->53|92->61
                  -- GENERATED --
              */
          