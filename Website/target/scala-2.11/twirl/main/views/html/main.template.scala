
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
        <script src="https://getaddress.io/js/jquery.getAddress-2.0.0.min.js"></script>
        <link rel="apple-touch-icon" href="apple-touch-icon.png">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("stylesheets/bootstrap-theme.min.css")),format.raw/*20.116*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*22.54*/routes/*22.60*/.Assets.versioned("stylesheets/skyShop.css")),format.raw/*22.104*/("""">

        <link rel="shortcut icon" type="image/ico" href=""""),_display_(/*24.59*/routes/*24.65*/.Assets.versioned("images/favicon.ico")),format.raw/*24.104*/(""""/>
        </script>
        <!-- Start of skyblueteam Zendesk Widget script -->
        <script>/*<![CDATA[*/window.zEmbed||function(e,t)"""),format.raw/*27.58*/("""{"""),format.raw/*27.59*/("""var n,o,d,i,s,a=[],r=document.createElement("iframe");window.zEmbed=function()"""),format.raw/*27.137*/("""{"""),format.raw/*27.138*/("""a.push(arguments)"""),format.raw/*27.155*/("""}"""),format.raw/*27.156*/(""",window.zE=window.zE||window.zEmbed,r.src="javascript:false",r.title="",r.role="presentation",(r.frameElement||r).style.cssText="display: none",d=document.getElementsByTagName("script"),d=d[d.length-1],d.parentNode.insertBefore(r,d),i=r.contentWindow,s=i.document;try"""),format.raw/*27.423*/("""{"""),format.raw/*27.424*/("""o=s"""),format.raw/*27.427*/("""}"""),format.raw/*27.428*/("""catch(c)"""),format.raw/*27.436*/("""{"""),format.raw/*27.437*/("""n=document.domain,r.src='javascript:var d=document.open();d.domain="'+n+'";void(0);',o=s"""),format.raw/*27.525*/("""}"""),format.raw/*27.526*/("""o.open()._l=function()"""),format.raw/*27.548*/("""{"""),format.raw/*27.549*/("""var o=this.createElement("script");n&&(this.domain=n),o.id="js-iframe-async",o.src=e,this.t=+new Date,this.zendeskHost=t,this.zEQueue=a,this.body.appendChild(o)"""),format.raw/*27.709*/("""}"""),format.raw/*27.710*/(""",o.write('<body onload="document._l();">'),o.close()"""),format.raw/*27.762*/("""}"""),format.raw/*27.763*/("""("//assets.zendesk.com/embeddable_framework/main.js","skyblueteam.zendesk.com");/*]]>*/</script>
        <!-- End of skyblueteam Zendesk Widget script -->
</head>
<!--[if lt IE 8]>
    <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->
<body>

  <script>
    window.fbAsyncInit = function() """),format.raw/*36.37*/("""{"""),format.raw/*36.38*/("""
      """),format.raw/*37.7*/("""FB.init("""),format.raw/*37.15*/("""{"""),format.raw/*37.16*/("""
        """),format.raw/*38.9*/("""appId      : '1646184328992477',
        xfbml      : true,
        version    : 'v2.4'
      """),format.raw/*41.7*/("""}"""),format.raw/*41.8*/(""");
    """),format.raw/*42.5*/("""}"""),format.raw/*42.6*/(""";

    (function(d, s, id)"""),format.raw/*44.24*/("""{"""),format.raw/*44.25*/("""
       """),format.raw/*45.8*/("""var js, fjs = d.getElementsByTagName(s)[0];
       if (d.getElementById(id)) """),format.raw/*46.34*/("""{"""),format.raw/*46.35*/("""return;"""),format.raw/*46.42*/("""}"""),format.raw/*46.43*/("""
       """),format.raw/*47.8*/("""js = d.createElement(s); js.id = id;
       js.src = "//connect.facebook.net/en_US/sdk.js";
       fjs.parentNode.insertBefore(js, fjs);
     """),format.raw/*50.6*/("""}"""),format.raw/*50.7*/("""(document, 'script', 'facebook-jssdk'));
  </script>
  <script>
  // This is called with the results from from FB.getLoginStatus().
  function statusChangeCallback(response) """),format.raw/*54.43*/("""{"""),format.raw/*54.44*/("""
    """),format.raw/*55.5*/("""console.log('statusChangeCallback');
    console.log(response);
    // The response object is returned with a status field that lets the
    // app know the current login status of the person.
    // Full docs on the response object can be found in the documentation
    // for FB.getLoginStatus().
    if (response.status === 'connected') """),format.raw/*61.42*/("""{"""),format.raw/*61.43*/("""
      """),format.raw/*62.7*/("""// Logged into your app and Facebook.
      testAPI();
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/(""" """),format.raw/*64.7*/("""else if (response.status === 'not_authorized') """),format.raw/*64.54*/("""{"""),format.raw/*64.55*/("""
      """),format.raw/*65.7*/("""// The person is logged into Facebook, but not your app.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into this app.';
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/(""" """),format.raw/*68.7*/("""else """),format.raw/*68.12*/("""{"""),format.raw/*68.13*/("""
      """),format.raw/*69.7*/("""// The person is not logged into Facebook, so we're not sure if
      // they are logged into this app or not.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into Facebook.';
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/("""
  """),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""

  """),format.raw/*76.3*/("""// This function is called when someone finishes with the Login
  // Button.  See the onlogin handler attached to it in the sample
  // code below.
  function checkLoginState() """),format.raw/*79.30*/("""{"""),format.raw/*79.31*/("""
    """),format.raw/*80.5*/("""FB.getLoginStatus(function(response) """),format.raw/*80.42*/("""{"""),format.raw/*80.43*/("""
      """),format.raw/*81.7*/("""statusChangeCallback(response);
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""");
  """),format.raw/*83.3*/("""}"""),format.raw/*83.4*/("""

  """),format.raw/*85.3*/("""window.fbAsyncInit = function() """),format.raw/*85.35*/("""{"""),format.raw/*85.36*/("""
  """),format.raw/*86.3*/("""FB.init("""),format.raw/*86.11*/("""{"""),format.raw/*86.12*/("""
    """),format.raw/*87.5*/("""appId      : '1646184328992477',
    cookie     : true,  // enable cookies to allow the server to access
                        // the session
    xfbml      : true,  // parse social plugins on this page
    version    : 'v2.2' // use version 2.2
  """),format.raw/*92.3*/("""}"""),format.raw/*92.4*/(""");

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

  FB.getLoginStatus(function(response) """),format.raw/*106.40*/("""{"""),format.raw/*106.41*/("""
    """),format.raw/*107.5*/("""statusChangeCallback(response);
  """),format.raw/*108.3*/("""}"""),format.raw/*108.4*/(""");

  """),format.raw/*110.3*/("""}"""),format.raw/*110.4*/(""";

  // Load the SDK asynchronously
  (function(d, s, id) """),format.raw/*113.23*/("""{"""),format.raw/*113.24*/("""
    """),format.raw/*114.5*/("""var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
  """),format.raw/*119.3*/("""}"""),format.raw/*119.4*/("""(document, 'script', 'facebook-jssdk'));

  // Here we run a very simple test of the Graph API after login is
  // successful.  See statusChangeCallback() for when this call is made.
  function testAPI() """),format.raw/*123.22*/("""{"""),format.raw/*123.23*/("""
    """),format.raw/*124.5*/("""console.log('Welcome!  Fetching your information.... ');
    FB.api('/me', function(response) """),format.raw/*125.38*/("""{"""),format.raw/*125.39*/("""
      """),format.raw/*126.7*/("""console.log('Successful login for: ' + response.name);
      document.getElementById('status').innerHTML =
        'Thanks for logging in, ' + response.name + '!';
    """),format.raw/*129.5*/("""}"""),format.raw/*129.6*/(""");
  """),format.raw/*130.3*/("""}"""),format.raw/*130.4*/("""
"""),format.raw/*131.1*/("""</script>

<!--
  Below we include the Login Button social plugin. This button uses
  the JavaScript SDK to present a graphical Login button that triggers
  the FB.login() function when clicked.
-->



  <div id="easterEggContainer">
    <div id="easterEgg">
      <img id="gnome" src=""""),_display_(/*143.29*/routes/*143.35*/.Assets.versioned("images/gnomeTransparent.jpg")),format.raw/*143.83*/(""""></img>
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

      <a class="navbar-brand" href="/"><img id="skylogo" src=""""),_display_(/*157.64*/routes/*157.70*/.Assets.versioned("images/sky-logo.png")),format.raw/*157.110*/("""">Accessories</a></img>

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

"""),_display_(/*192.2*/content),format.raw/*192.9*/("""

"""),format.raw/*194.1*/("""<hr />

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
                  DATE: Thu Oct 01 16:10:12 BST 2015
                  SOURCE: /Users/rsp04/Websites/thursday/BSkyBProject/Website/app/views/main.scala.html
                  HASH: db2269fc08c17bf4a98c783624ced6025d289299
                  MATRIX: 748->1|873->31|901->33|1090->196|1115->201|1326->385|1341->391|1413->441|1488->489|1503->495|1578->548|1662->605|1677->611|1748->660|1832->717|1847->723|1910->765|1994->822|2009->828|2081->878|2165->935|2180->941|2252->991|2498->1210|2513->1216|2591->1272|2674->1328|2689->1334|2752->1375|2835->1431|2850->1437|2916->1481|3005->1543|3020->1549|3081->1588|3248->1727|3277->1728|3384->1806|3414->1807|3460->1824|3490->1825|3786->2092|3816->2093|3848->2096|3878->2097|3915->2105|3945->2106|4062->2194|4092->2195|4143->2217|4173->2218|4362->2378|4392->2379|4473->2431|4503->2432|4960->2861|4989->2862|5023->2869|5059->2877|5088->2878|5124->2887|5245->2981|5273->2982|5307->2989|5335->2990|5389->3016|5418->3017|5453->3025|5558->3102|5587->3103|5622->3110|5651->3111|5686->3119|5855->3261|5883->3262|6085->3436|6114->3437|6146->3442|6514->3782|6543->3783|6577->3790|6663->3849|6691->3850|6719->3851|6794->3898|6823->3899|6857->3906|7039->4061|7067->4062|7095->4063|7128->4068|7157->4069|7191->4076|7427->4285|7455->4286|7485->4289|7513->4290|7544->4294|7749->4471|7778->4472|7810->4477|7875->4514|7904->4515|7938->4522|8001->4558|8029->4559|8061->4564|8089->4565|8120->4569|8180->4601|8209->4602|8239->4605|8275->4613|8304->4614|8336->4619|8613->4869|8641->4870|9228->5428|9258->5429|9291->5434|9353->5468|9382->5469|9416->5475|9445->5476|9532->5534|9562->5535|9595->5540|9842->5759|9871->5760|10104->5964|10134->5965|10167->5970|10290->6064|10320->6065|10355->6072|10551->6240|10580->6241|10613->6246|10642->6247|10671->6248|10986->6535|11002->6541|11072->6589|11675->7164|11691->7170|11754->7210|13163->8592|13191->8599|13221->8601
                  LINES: 27->1|32->1|34->3|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|58->27|67->36|67->36|68->37|68->37|68->37|69->38|72->41|72->41|73->42|73->42|75->44|75->44|76->45|77->46|77->46|77->46|77->46|78->47|81->50|81->50|85->54|85->54|86->55|92->61|92->61|93->62|95->64|95->64|95->64|95->64|95->64|96->65|99->68|99->68|99->68|99->68|99->68|100->69|104->73|104->73|105->74|105->74|107->76|110->79|110->79|111->80|111->80|111->80|112->81|113->82|113->82|114->83|114->83|116->85|116->85|116->85|117->86|117->86|117->86|118->87|123->92|123->92|137->106|137->106|138->107|139->108|139->108|141->110|141->110|144->113|144->113|145->114|150->119|150->119|154->123|154->123|155->124|156->125|156->125|157->126|160->129|160->129|161->130|161->130|162->131|174->143|174->143|174->143|188->157|188->157|188->157|223->192|223->192|225->194
                  -- GENERATED --
              */
          