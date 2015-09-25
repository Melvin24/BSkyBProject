
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*14.110*/("""">
        <style>
            body """),format.raw/*16.18*/("""{"""),format.raw/*16.19*/("""
                """),format.raw/*17.17*/("""padding-top: 50px;
                padding-bottom: 20px;
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""
        """),format.raw/*20.9*/("""</style>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/bootstrap-theme.min.css")),format.raw/*21.116*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*22.54*/routes/*22.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*22.101*/("""">
</head>
<!--[if lt IE 8]>
    <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/">Sky Blue Team</a>
    </div>
    <div id="navbar" class="navbar-collapse collapse">
      <form class="navbar-form navbar-right" role="form">
        <div class="form-group">
          <input type="text" placeholder="Email" class="form-control">
        </div>
        <div class="form-group">
          <input type="password" placeholder="Password" class="form-control">
        </div>
        <button type="submit" class="btn btn-success">Sign in</button>
      </form>
    </div><!--/.navbar-collapse -->
  </div>
</nav>

<!-- Content -->

"""),_display_(/*55.2*/content),format.raw/*55.9*/("""

"""),format.raw/*57.1*/("""<hr />

<footer>
    <p>&copy; Company 2015</p>
</footer>
</div>
<script src=""""),_display_(/*63.15*/routes/*63.21*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*63.70*/("""" type="text/javascript"></script>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Sep 25 14:49:24 BST 2015
                  SOURCE: /Users/rsp04/Websites/BSkyBProject/Website/app/views/main.scala.html
                  HASH: 40636100b43598c2e03d3fdfebda26383a5aed73
                  MATRIX: 748->1|873->31|901->33|1090->196|1115->201|1393->452|1408->458|1480->508|1544->544|1573->545|1618->562|1715->631|1744->632|1780->641|1869->703|1884->709|1962->765|2045->821|2060->827|2123->868|3429->2148|3456->2155|3485->2157|3591->2236|3606->2242|3676->2291
                  LINES: 27->1|32->1|34->3|40->9|40->9|45->14|45->14|45->14|47->16|47->16|48->17|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|86->55|86->55|88->57|94->63|94->63|94->63
                  -- GENERATED --
              */
          