
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*12.110*/("""">
        <script type="text/javascript" src=""""),_display_(/*13.46*/routes/*13.52*/.Assets.versioned("javascripts/jquery-1.11.0.min.js")),format.raw/*13.105*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*14.46*/routes/*14.52*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*14.101*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*15.46*/routes/*15.52*/.Assets.versioned("javascripts/skyApp.js")),format.raw/*15.94*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*16.46*/routes/*16.52*/.Assets.versioned("javascripts/jquery.toaster.js")),format.raw/*16.102*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*17.46*/routes/*17.52*/.Assets.versioned("javascripts/jquery.session.js")),format.raw/*17.102*/(""""></script>
        <link rel="apple-touch-icon" href="apple-touch-icon.png">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*19.54*/routes/*19.60*/.Assets.versioned("stylesheets/bootstrap-theme.min.css")),format.raw/*19.116*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*20.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/skyShop.css")),format.raw/*21.104*/("""">

        <link rel="shortcut icon" type="image/ico" href=""""),_display_(/*23.59*/routes/*23.65*/.Assets.versioned("images/favicon.ico")),format.raw/*23.104*/(""""/>
        </script>
        <!-- Start of skyblueteam Zendesk Widget script -->
        <script>/*<![CDATA[*/window.zEmbed||function(e,t)"""),format.raw/*26.58*/("""{"""),format.raw/*26.59*/("""var n,o,d,i,s,a=[],r=document.createElement("iframe");window.zEmbed=function()"""),format.raw/*26.137*/("""{"""),format.raw/*26.138*/("""a.push(arguments)"""),format.raw/*26.155*/("""}"""),format.raw/*26.156*/(""",window.zE=window.zE||window.zEmbed,r.src="javascript:false",r.title="",r.role="presentation",(r.frameElement||r).style.cssText="display: none",d=document.getElementsByTagName("script"),d=d[d.length-1],d.parentNode.insertBefore(r,d),i=r.contentWindow,s=i.document;try"""),format.raw/*26.423*/("""{"""),format.raw/*26.424*/("""o=s"""),format.raw/*26.427*/("""}"""),format.raw/*26.428*/("""catch(c)"""),format.raw/*26.436*/("""{"""),format.raw/*26.437*/("""n=document.domain,r.src='javascript:var d=document.open();d.domain="'+n+'";void(0);',o=s"""),format.raw/*26.525*/("""}"""),format.raw/*26.526*/("""o.open()._l=function()"""),format.raw/*26.548*/("""{"""),format.raw/*26.549*/("""var o=this.createElement("script");n&&(this.domain=n),o.id="js-iframe-async",o.src=e,this.t=+new Date,this.zendeskHost=t,this.zEQueue=a,this.body.appendChild(o)"""),format.raw/*26.709*/("""}"""),format.raw/*26.710*/(""",o.write('<body onload="document._l();">'),o.close()"""),format.raw/*26.762*/("""}"""),format.raw/*26.763*/("""("//assets.zendesk.com/embeddable_framework/main.js","skyblueteam.zendesk.com");/*]]>*/</script>
        <!-- End of skyblueteam Zendesk Widget script -->
</head>
<!--[if lt IE 8]>
    <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->
<body>

  <script>
    window.fbAsyncInit = function() """),format.raw/*35.37*/("""{"""),format.raw/*35.38*/("""
      """),format.raw/*36.7*/("""FB.init("""),format.raw/*36.15*/("""{"""),format.raw/*36.16*/("""
        """),format.raw/*37.9*/("""appId      : '1646184328992477',
        xfbml      : true,
        version    : 'v2.4'
      """),format.raw/*40.7*/("""}"""),format.raw/*40.8*/(""");
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/(""";

    (function(d, s, id)"""),format.raw/*43.24*/("""{"""),format.raw/*43.25*/("""
       """),format.raw/*44.8*/("""var js, fjs = d.getElementsByTagName(s)[0];
       if (d.getElementById(id)) """),format.raw/*45.34*/("""{"""),format.raw/*45.35*/("""return;"""),format.raw/*45.42*/("""}"""),format.raw/*45.43*/("""
       """),format.raw/*46.8*/("""js = d.createElement(s); js.id = id;
       js.src = "//connect.facebook.net/en_US/sdk.js";
       fjs.parentNode.insertBefore(js, fjs);
     """),format.raw/*49.6*/("""}"""),format.raw/*49.7*/("""(document, 'script', 'facebook-jssdk'));
  </script>
  <script>
  // This is called with the results from from FB.getLoginStatus().
  function statusChangeCallback(response) """),format.raw/*53.43*/("""{"""),format.raw/*53.44*/("""
    """),format.raw/*54.5*/("""console.log('statusChangeCallback');
    console.log(response);
    // The response object is returned with a status field that lets the
    // app know the current login status of the person.
    // Full docs on the response object can be found in the documentation
    // for FB.getLoginStatus().
    if (response.status === 'connected') """),format.raw/*60.42*/("""{"""),format.raw/*60.43*/("""
      """),format.raw/*61.7*/("""// Logged into your app and Facebook.
      testAPI();
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""" """),format.raw/*63.7*/("""else if (response.status === 'not_authorized') """),format.raw/*63.54*/("""{"""),format.raw/*63.55*/("""
      """),format.raw/*64.7*/("""// The person is logged into Facebook, but not your app.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into this app.';
    """),format.raw/*67.5*/("""}"""),format.raw/*67.6*/(""" """),format.raw/*67.7*/("""else """),format.raw/*67.12*/("""{"""),format.raw/*67.13*/("""
      """),format.raw/*68.7*/("""// The person is not logged into Facebook, so we're not sure if
      // they are logged into this app or not.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into Facebook.';
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""
  """),format.raw/*73.3*/("""}"""),format.raw/*73.4*/("""

  """),format.raw/*75.3*/("""// This function is called when someone finishes with the Login
  // Button.  See the onlogin handler attached to it in the sample
  // code below.
  function checkLoginState() """),format.raw/*78.30*/("""{"""),format.raw/*78.31*/("""
    """),format.raw/*79.5*/("""FB.getLoginStatus(function(response) """),format.raw/*79.42*/("""{"""),format.raw/*79.43*/("""
      """),format.raw/*80.7*/("""statusChangeCallback(response);
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/(""");
  """),format.raw/*82.3*/("""}"""),format.raw/*82.4*/("""

  """),format.raw/*84.3*/("""window.fbAsyncInit = function() """),format.raw/*84.35*/("""{"""),format.raw/*84.36*/("""
  """),format.raw/*85.3*/("""FB.init("""),format.raw/*85.11*/("""{"""),format.raw/*85.12*/("""
    """),format.raw/*86.5*/("""appId      : '1646184328992477',
    cookie     : true,  // enable cookies to allow the server to access
                        // the session
    xfbml      : true,  // parse social plugins on this page
    version    : 'v2.2' // use version 2.2
  """),format.raw/*91.3*/("""}"""),format.raw/*91.4*/(""");

  // Now that we've initialized the JavaScript SDK, we call
  // FB.getLoginStatus().  This function gets the state of the
  // person visiting this page and can return one of three states to
  // the callback you provide.  They can be:
  //
  // 1. Logged into your app ('connected')
  // 2. Logged into Facebook, but not your app ('not_authorized')
  // 3. Not logged into Facebook and can't tell if they are logged into
  //    your app or not.
  //
  // These three cases are handled in the callback function.

  FB.getLoginStatus(function(response) """),format.raw/*105.40*/("""{"""),format.raw/*105.41*/("""
    """),format.raw/*106.5*/("""statusChangeCallback(response);
  """),format.raw/*107.3*/("""}"""),format.raw/*107.4*/(""");

  """),format.raw/*109.3*/("""}"""),format.raw/*109.4*/(""";

  // Load the SDK asynchronously
  (function(d, s, id) """),format.raw/*112.23*/("""{"""),format.raw/*112.24*/("""
    """),format.raw/*113.5*/("""var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
  """),format.raw/*118.3*/("""}"""),format.raw/*118.4*/("""(document, 'script', 'facebook-jssdk'));

  // Here we run a very simple test of the Graph API after login is
  // successful.  See statusChangeCallback() for when this call is made.
  function testAPI() """),format.raw/*122.22*/("""{"""),format.raw/*122.23*/("""
    """),format.raw/*123.5*/("""console.log('Welcome!  Fetching your information.... ');
    FB.api('/me', function(response) """),format.raw/*124.38*/("""{"""),format.raw/*124.39*/("""
      """),format.raw/*125.7*/("""console.log('Successful login for: ' + response.name);
      document.getElementById('status').innerHTML =
        'Thanks for logging in, ' + response.name + '!';
    """),format.raw/*128.5*/("""}"""),format.raw/*128.6*/(""");
  """),format.raw/*129.3*/("""}"""),format.raw/*129.4*/("""
"""),format.raw/*130.1*/("""</script>

<!--
  Below we include the Login Button social plugin. This button uses
  the JavaScript SDK to present a graphical Login button that triggers
  the FB.login() function when clicked.
-->



  <div id="easterEggContainer">
    <div id="easterEgg">
      <img id="gnome" src=""""),_display_(/*142.29*/routes/*142.35*/.Assets.versioned("images/gnomeTransparent.jpg")),format.raw/*142.83*/(""""></img>
    </div>
  </div>

<nav class="navbar navbar-inverse navbar-fixed-top navBarCustom" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>

      <a class="navbar-brand" href="/"><img id="skylogo" src=""""),_display_(/*156.64*/routes/*156.70*/.Assets.versioned("images/sky-logo.png")),format.raw/*156.110*/("""">Accessories</a></img>

    </div>

    <div id="navbar" class="navbar-collapse collapse">
      <ul class="nav navbar-nav">
        <li><a href="/">Home</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Products <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/tshirts">T-Shirts</a></li>
            <li><a href="/phones">Phones</a></li>
            <li><a href="/gnomes">Gnomes</a></li>
          </ul>
        </li>
        <li><a href="/faq">Help/FAQ's</a></li>
      </ul>
      <form class="navbar-form navbar-right" role="form">
        <button class="btn btn-sm btn-default like-btn active" type="button" id="shoppingCart">
             <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
             <span class="text">&#32;</span>
             <span id="shoppingCartBadge" class="badge shoppingBadge"></span>
        </button>
        <div class="form-group">
          <input type="text" placeholder="Email" class="form-control">
        </div>
        <div class="form-group">
          <input type="password" placeholder="Password" class="form-control">
        </div>
        <button type="submit" class="btn btn-success">Sign in</button>
      </form>
    </div>
  </div>
</nav>

"""),_display_(/*191.2*/content),format.raw/*191.9*/("""

"""),format.raw/*193.1*/("""<hr />

<div class="container">
    <footer>
        <p>Sky Blue Team 2015</p>
        <button type="button" id ="resetSession" class="btn btn-info">Reset Basket</button>
        <div class="fb-like" data-share="true" data-width="450" data-show-faces="true">
            
        </div>

        <fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
        </fb:login-button>
    </footer>
</div>
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
                  DATE: Thu Oct 01 12:33:10 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/main.scala.html
                  HASH: dbb04593c8bd71be550f5cc6c2bc486ec3021e8c
                  MATRIX: 748->1|873->31|901->33|1090->196|1115->201|1326->385|1341->391|1413->441|1488->489|1503->495|1578->548|1662->605|1677->611|1748->660|1832->717|1847->723|1910->765|1994->822|2009->828|2081->878|2165->935|2180->941|2252->991|2410->1122|2425->1128|2503->1184|2586->1240|2601->1246|2664->1287|2747->1343|2762->1349|2828->1393|2917->1455|2932->1461|2993->1500|3160->1639|3189->1640|3296->1718|3326->1719|3372->1736|3402->1737|3698->2004|3728->2005|3760->2008|3790->2009|3827->2017|3857->2018|3974->2106|4004->2107|4055->2129|4085->2130|4274->2290|4304->2291|4385->2343|4415->2344|4872->2773|4901->2774|4935->2781|4971->2789|5000->2790|5036->2799|5157->2893|5185->2894|5219->2901|5247->2902|5301->2928|5330->2929|5365->2937|5470->3014|5499->3015|5534->3022|5563->3023|5598->3031|5767->3173|5795->3174|5997->3348|6026->3349|6058->3354|6426->3694|6455->3695|6489->3702|6575->3761|6603->3762|6631->3763|6706->3810|6735->3811|6769->3818|6951->3973|6979->3974|7007->3975|7040->3980|7069->3981|7103->3988|7339->4197|7367->4198|7397->4201|7425->4202|7456->4206|7661->4383|7690->4384|7722->4389|7787->4426|7816->4427|7850->4434|7913->4470|7941->4471|7973->4476|8001->4477|8032->4481|8092->4513|8121->4514|8151->4517|8187->4525|8216->4526|8248->4531|8525->4781|8553->4782|9140->5340|9170->5341|9203->5346|9265->5380|9294->5381|9328->5387|9357->5388|9444->5446|9474->5447|9507->5452|9754->5671|9783->5672|10016->5876|10046->5877|10079->5882|10202->5976|10232->5977|10267->5984|10463->6152|10492->6153|10525->6158|10554->6159|10583->6160|10898->6447|10914->6453|10984->6501|11587->7076|11603->7082|11666->7122|13075->8504|13103->8511|13133->8513
                  LINES: 27->1|32->1|34->3|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|66->35|66->35|67->36|67->36|67->36|68->37|71->40|71->40|72->41|72->41|74->43|74->43|75->44|76->45|76->45|76->45|76->45|77->46|80->49|80->49|84->53|84->53|85->54|91->60|91->60|92->61|94->63|94->63|94->63|94->63|94->63|95->64|98->67|98->67|98->67|98->67|98->67|99->68|103->72|103->72|104->73|104->73|106->75|109->78|109->78|110->79|110->79|110->79|111->80|112->81|112->81|113->82|113->82|115->84|115->84|115->84|116->85|116->85|116->85|117->86|122->91|122->91|136->105|136->105|137->106|138->107|138->107|140->109|140->109|143->112|143->112|144->113|149->118|149->118|153->122|153->122|154->123|155->124|155->124|156->125|159->128|159->128|160->129|160->129|161->130|173->142|173->142|173->142|187->156|187->156|187->156|222->191|222->191|224->193
                  -- GENERATED --
              */
          