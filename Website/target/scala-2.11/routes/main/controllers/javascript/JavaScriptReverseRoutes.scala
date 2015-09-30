
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rsp04/Websites/Wednesday/BSkyBProject/Website/conf/routes
// @DATE:Wed Sep 30 17:41:05 BST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:30
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.products",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:18
    def allstock: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.allstock",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stock"})
        }
      """
    )
  
    // @LINE:22
    def getActiveOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getActiveOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders"})
        }
      """
    )
  
    // @LINE:19
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "stock"})
        }
      """
    )
  
    // @LINE:17
    def createItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.createItem",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stock/new"})
        }
      """
    )
  
    // @LINE:11
    def item: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.item",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:26
    def checkout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.checkout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkout"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:15
    def backofhouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.backofhouse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "backofhouse"})
        }
      """
    )
  
  }


}