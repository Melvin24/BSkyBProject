
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rsp04/Websites/BSkyBProject/Website/conf/routes
// @DATE:Thu Oct 01 21:53:54 BST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:47
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def gnomes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.gnomes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gnomes"})
        }
      """
    )
  
    // @LINE:19
    def shoppingBag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.shoppingBag",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shoppingBag"})
        }
      """
    )
  
    // @LINE:11
    def tshirts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.tshirts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tshirts"})
        }
      """
    )
  
    // @LINE:14
    def phones: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.phones",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "phones"})
        }
      """
    )
  
    // @LINE:23
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.products",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:33
    def allstock: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.allstock",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stock"})
        }
      """
    )
  
    // @LINE:39
    def getActiveOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getActiveOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders"})
        }
      """
    )
  
    // @LINE:32
    def deleteItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteItem",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stock/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:36
    def viewallorders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewallorders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage/orders"})
        }
      """
    )
  
    // @LINE:18
    def faq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.faq",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "faq"})
        }
      """
    )
  
    // @LINE:43
    def checkout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.checkout",
      """
        function(id,price) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkout/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("price", price)})
        }
      """
    )
  
    // @LINE:34
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "stock"})
        }
      """
    )
  
    // @LINE:30
    def createItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.createItem",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stock/new"})
        }
      """
    )
  
    // @LINE:12
    def item: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.item",
      """
        function(id) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tshirts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
          }
        
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:28
    def backofhouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.backofhouse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "backofhouse"})
        }
      """
    )
  
    // @LINE:31
    def addItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "stock/update"})
        }
      """
    )
  
  }


}