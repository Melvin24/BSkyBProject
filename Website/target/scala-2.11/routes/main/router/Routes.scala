
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rsp04/Websites/Wednesday/BSkyBProject/Website/conf/routes
// @DATE:Wed Sep 30 22:04:54 BST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:32
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:32
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.Application.products()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/$id<[^/]+>""", """controllers.Application.item(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backofhouse""", """controllers.Application.backofhouse()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock/new""", """controllers.Application.createItem()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock/update""", """controllers.Application.addItem()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock/delete/$id<[^/]+>""", """controllers.Application.deleteItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock""", """controllers.Application.allstock()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock""", """controllers.Application.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.Application.getActiveOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout""", """controllers.Application.checkout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_products1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_Application_products1_invoker = createInvoker(
    Application_1.products(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "products",
      Nil,
      "GET",
      """""",
      this.prefix + """products"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_item2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_item2_invoker = createInvoker(
    Application_1.item(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "item",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """products/$id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_backofhouse3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backofhouse")))
  )
  private[this] lazy val controllers_Application_backofhouse3_invoker = createInvoker(
    Application_1.backofhouse(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "backofhouse",
      Nil,
      "GET",
      """""",
      this.prefix + """backofhouse"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_createItem4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock/new")))
  )
  private[this] lazy val controllers_Application_createItem4_invoker = createInvoker(
    Application_1.createItem(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createItem",
      Nil,
      "GET",
      """""",
      this.prefix + """stock/new"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_addItem5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock/update")))
  )
  private[this] lazy val controllers_Application_addItem5_invoker = createInvoker(
    Application_1.addItem(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addItem",
      Nil,
      "POST",
      """""",
      this.prefix + """stock/update"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_deleteItem6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteItem6_invoker = createInvoker(
    Application_1.deleteItem(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteItem",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """stock/delete/$id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_allstock7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock")))
  )
  private[this] lazy val controllers_Application_allstock7_invoker = createInvoker(
    Application_1.allstock(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "allstock",
      Nil,
      "GET",
      """""",
      this.prefix + """stock"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_save8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock")))
  )
  private[this] lazy val controllers_Application_save8_invoker = createInvoker(
    Application_1.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """stock"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_getActiveOrders9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_Application_getActiveOrders9_invoker = createInvoker(
    Application_1.getActiveOrders(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getActiveOrders",
      Nil,
      "GET",
      """ JSON""",
      this.prefix + """orders"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_checkout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout")))
  )
  private[this] lazy val controllers_Application_checkout10_invoker = createInvoker(
    Application_1.checkout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "checkout",
      Nil,
      "GET",
      """""",
      this.prefix + """checkout"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:10
    case controllers_Application_products1_route(params) =>
      call { 
        controllers_Application_products1_invoker.call(Application_1.products())
      }
  
    // @LINE:11
    case controllers_Application_item2_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_item2_invoker.call(Application_1.item(id))
      }
  
    // @LINE:15
    case controllers_Application_backofhouse3_route(params) =>
      call { 
        controllers_Application_backofhouse3_invoker.call(Application_1.backofhouse())
      }
  
    // @LINE:17
    case controllers_Application_createItem4_route(params) =>
      call { 
        controllers_Application_createItem4_invoker.call(Application_1.createItem())
      }
  
    // @LINE:18
    case controllers_Application_addItem5_route(params) =>
      call { 
        controllers_Application_addItem5_invoker.call(Application_1.addItem())
      }
  
    // @LINE:19
    case controllers_Application_deleteItem6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deleteItem6_invoker.call(Application_1.deleteItem(id))
      }
  
    // @LINE:20
    case controllers_Application_allstock7_route(params) =>
      call { 
        controllers_Application_allstock7_invoker.call(Application_1.allstock())
      }
  
    // @LINE:21
    case controllers_Application_save8_route(params) =>
      call { 
        controllers_Application_save8_invoker.call(Application_1.save())
      }
  
    // @LINE:24
    case controllers_Application_getActiveOrders9_route(params) =>
      call { 
        controllers_Application_getActiveOrders9_invoker.call(Application_1.getActiveOrders())
      }
  
    // @LINE:28
    case controllers_Application_checkout10_route(params) =>
      call { 
        controllers_Application_checkout10_invoker.call(Application_1.checkout())
      }
  
    // @LINE:32
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_0.versioned(path, file))
      }
  }
}