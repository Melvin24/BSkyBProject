
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object faq_Scope0 {
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

class faq extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("List of all products pages.")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),format.raw/*4.3*/("""<ol class="breadcrumb breadCrumbStyle">
    <li><a href="/">Home</a></li>
    <li><a href="/faq">FAQ</a></li>
  </ol>

<br>


<h1>Frequently Asked Questions.</h1>

  <p>This is a brief list of our most frequesntly asked questions, if you cannot find the answer you are looking for please contact us using the live chat found in the bottom right corner.</p>

    <h3 data-toggle="collapse" data-target="#q1">How will my product be delivered?</h3>
     <div id="q1" class="collapse">
     Items are delivered directly from our distribution centre and dispatched via DPD.
     </div>

    <h3 data-toggle="collapse" data-target="#q2">How do I track my order?</h3>
     <div id="q2" class="collapse">
     You can track your order by visiting our DPD's Track It page <a href="http://www.dpd.co.uk/"> here </a>.
     </div>

    <h3 data-toggle="collapse" data-target="#q3">How do I return an unwanted product?</h3>
     <div id="q3" class="collapse">
     We understand that sometimes you may change your mind about a purchase. You can return unwanted items to store,
     by phone, or online following the instructions on your paperwork.
     </div>

    <h3 data-toggle="collapse" data-target="#q4">I have a faulty product that is in warranty. What can I do?</h3>
     <div id="q4" class="collapse">
     We will always help you out if your product develops a fault while under warranty. For assistance, you can contact us either by phone
     or instore and our colleagues in store will check your product and, depending on the manufacturer’s warranty policy,
     will either book your product in for repair or provide you with a replacement.
     </div>


    <h3 data-toggle="collapse" data-target="#q5">I have a faulty product that is not in warranty. What can I do?</h3>
     <div id="q5" class="collapse">
     We will always do our best to help you with a faulty product when it is out of warranty, however we may not be able to replace your product.
     For assistance, you can contact us either by phone or instore and we will check your product and assess the possibility of
     repair or replacement.
     </div>




""")))}),format.raw/*50.2*/("""
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
object faq extends faq_Scope0.faq
              /*
                  -- GENERATED --
                  DATE: Thu Oct 01 17:37:49 BST 2015
                  SOURCE: /Users/rsp04/Websites/BSkyBProject/Website/app/views/faq.scala.html
                  HASH: 96e67e259e9b5ae7895f0417d143ee8be8da2729
                  MATRIX: 741->1|854->19|882->22|925->57|964->59|993->62|3153->2192
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|81->50
                  -- GENERATED --
              */
          