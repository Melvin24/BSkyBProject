
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
        
        <!-- Start of skyblueteam Zendesk Widget script -->
        <script>/*<![CDATA[*/window.zEmbed||function(e,t)"""),format.raw/*25.58*/("""{"""),format.raw/*25.59*/("""var n,o,d,i,s,a=[],r=document.createElement("iframe");window.zEmbed=function()"""),format.raw/*25.137*/("""{"""),format.raw/*25.138*/("""a.push(arguments)"""),format.raw/*25.155*/("""}"""),format.raw/*25.156*/(""",window.zE=window.zE||window.zEmbed,r.src="javascript:false",r.title="",r.role="presentation",(r.frameElement||r).style.cssText="display: none",d=document.getElementsByTagName("script"),d=d[d.length-1],d.parentNode.insertBefore(r,d),i=r.contentWindow,s=i.document;try"""),format.raw/*25.423*/("""{"""),format.raw/*25.424*/("""o=s"""),format.raw/*25.427*/("""}"""),format.raw/*25.428*/("""catch(c)"""),format.raw/*25.436*/("""{"""),format.raw/*25.437*/("""n=document.domain,r.src='javascript:var d=document.open();d.domain="'+n+'";void(0);',o=s"""),format.raw/*25.525*/("""}"""),format.raw/*25.526*/("""o.open()._l=function()"""),format.raw/*25.548*/("""{"""),format.raw/*25.549*/("""var o=this.createElement("script");n&&(this.domain=n),o.id="js-iframe-async",o.src=e,this.t=+new Date,this.zendeskHost=t,this.zEQueue=a,this.body.appendChild(o)"""),format.raw/*25.709*/("""}"""),format.raw/*25.710*/(""",o.write('<body onload="document._l();">'),o.close()"""),format.raw/*25.762*/("""}"""),format.raw/*25.763*/("""("//assets.zendesk.com/embeddable_framework/main.js","skyblueteam.zendesk.com");/*]]>*/</script>
        <!-- End of skyblueteam Zendesk Widget script -->
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
    <!--<div id="navbar" class="navbar-collapse collapse">
      <form class="navbar-form navbar-right" role="form">
        <div class="form-group">
          <input type="text" placeholder="Email" class="form-control">
        </div>
        <div class="form-group">
          <input type="password" placeholder="Password" class="form-control">
        </div>
        <button type="submit" class="btn btn-success">Sign in</button>
      </form>
    </div> navbar-collapse -->
  </div>
</nav>

<!-- Content -->

"""),_display_(/*59.2*/content),format.raw/*59.9*/("""

"""),format.raw/*61.1*/("""<hr />

<footer>
    <p>&copy; Sky Blue Team 2015</p>
</footer>
</div>
<script src=""""),_display_(/*67.15*/routes/*67.21*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*67.70*/("""" type="text/javascript"></script>
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
                  DATE: Wed Sep 30 14:52:39 BST 2015
                  SOURCE: /Users/rsp04/Websites/Wednesday/BSkyBProject/Website/app/views/main.scala.html
                  HASH: 4b6ae76e28b76ca751431387f09eadf3239da3f1
                  MATRIX: 748->1|873->31|901->33|1090->196|1115->201|1393->452|1408->458|1480->508|1544->544|1573->545|1618->562|1715->631|1744->632|1780->641|1869->703|1884->709|1962->765|2045->821|2060->827|2123->868|2280->997|2309->998|2416->1076|2446->1077|2492->1094|2522->1095|2818->1362|2848->1363|2880->1366|2910->1367|2947->1375|2977->1376|3094->1464|3124->1465|3175->1487|3205->1488|3394->1648|3424->1649|3505->1701|3535->1702|4992->3133|5019->3140|5048->3142|5160->3227|5175->3233|5245->3282
                  LINES: 27->1|32->1|34->3|40->9|40->9|45->14|45->14|45->14|47->16|47->16|48->17|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|90->59|90->59|92->61|98->67|98->67|98->67
                  -- GENERATED --
              */
          