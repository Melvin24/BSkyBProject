
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rsp04/Websites/thursday/BSkyBProject/Website/conf/routes
// @DATE:Thu Oct 01 10:39:19 BST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_1: controllers.Application,
  // @LINE:48
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_1: controllers.Application,
    // @LINE:48
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tshirts""", """controllers.Application.tshirts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tshirts/$id<[^/]+>""", """controllers.Application.item(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """phones""", """controllers.Application.phones()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gnomes""", """controllers.Application.gnomes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """faq""", """controllers.Application.faq()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shoppingBag""", """controllers.Application.shoppingBag()"""),
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


  // @LINE:7
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
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_Application_index1_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_tshirts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tshirts")))
  )
  private[this] lazy val controllers_Application_tshirts2_invoker = createInvoker(
    Application_1.tshirts(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "tshirts",
      Nil,
      "GET",
      """""",
      this.prefix + """tshirts"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_item3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tshirts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_item3_invoker = createInvoker(
    Application_1.item(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "item",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """tshirts/$id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_phones4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("phones")))
  )
  private[this] lazy val controllers_Application_phones4_invoker = createInvoker(
    Application_1.phones(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "phones",
      Nil,
      "GET",
      """""",
      this.prefix + """phones"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_gnomes5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gnomes")))
  )
  private[this] lazy val controllers_Application_gnomes5_invoker = createInvoker(
    Application_1.gnomes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "gnomes",
      Nil,
      "GET",
      """""",
      this.prefix + """gnomes"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_faq6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("faq")))
  )
  private[this] lazy val controllers_Application_faq6_invoker = createInvoker(
    Application_1.faq(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "faq",
      Nil,
      "GET",
      """""",
      this.prefix + """faq"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_shoppingBag7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shoppingBag")))
  )
  private[this] lazy val controllers_Application_shoppingBag7_invoker = createInvoker(
    Application_1.shoppingBag(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "shoppingBag",
      Nil,
      "GET",
      """""",
      this.prefix + """shoppingBag"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index8_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_products9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_Application_products9_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_Application_item10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_item10_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Application_backofhouse11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backofhouse")))
  )
  private[this] lazy val controllers_Application_backofhouse11_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_Application_createItem12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock/new")))
  )
  private[this] lazy val controllers_Application_createItem12_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_Application_addItem13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock/update")))
  )
  private[this] lazy val controllers_Application_addItem13_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_Application_deleteItem14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteItem14_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_Application_allstock15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock")))
  )
  private[this] lazy val controllers_Application_allstock15_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_Application_save16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock")))
  )
  private[this] lazy val controllers_Application_save16_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_Application_getActiveOrders17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_Application_getActiveOrders17_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_Application_checkout18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout")))
  )
  private[this] lazy val controllers_Application_checkout18_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
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
  
    // @LINE:7
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_Application_index1_route(params) =>
      call { 
        controllers_Application_index1_invoker.call(Application_1.index())
      }
  
    // @LINE:11
    case controllers_Application_tshirts2_route(params) =>
      call { 
        controllers_Application_tshirts2_invoker.call(Application_1.tshirts())
      }
  
    // @LINE:12
    case controllers_Application_item3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_item3_invoker.call(Application_1.item(id))
      }
  
    // @LINE:14
    case controllers_Application_phones4_route(params) =>
      call { 
        controllers_Application_phones4_invoker.call(Application_1.phones())
      }
  
    // @LINE:15
    case controllers_Application_gnomes5_route(params) =>
      call { 
        controllers_Application_gnomes5_invoker.call(Application_1.gnomes())
      }
  
    // @LINE:18
    case controllers_Application_faq6_route(params) =>
      call { 
        controllers_Application_faq6_invoker.call(Application_1.faq())
      }
  
    // @LINE:19
    case controllers_Application_shoppingBag7_route(params) =>
      call { 
        controllers_Application_shoppingBag7_invoker.call(Application_1.shoppingBag())
      }
  
    // @LINE:22
    case controllers_Application_index8_route(params) =>
      call { 
        controllers_Application_index8_invoker.call(Application_1.index())
      }
  
    // @LINE:26
    case controllers_Application_products9_route(params) =>
      call { 
        controllers_Application_products9_invoker.call(Application_1.products())
      }
  
    // @LINE:27
    case controllers_Application_item10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_item10_invoker.call(Application_1.item(id))
      }
  
    // @LINE:31
    case controllers_Application_backofhouse11_route(params) =>
      call { 
        controllers_Application_backofhouse11_invoker.call(Application_1.backofhouse())
      }
  
    // @LINE:33
    case controllers_Application_createItem12_route(params) =>
      call { 
        controllers_Application_createItem12_invoker.call(Application_1.createItem())
      }
  
    // @LINE:34
    case controllers_Application_addItem13_route(params) =>
      call { 
        controllers_Application_addItem13_invoker.call(Application_1.addItem())
      }
  
    // @LINE:35
    case controllers_Application_deleteItem14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deleteItem14_invoker.call(Application_1.deleteItem(id))
      }
  
    // @LINE:36
    case controllers_Application_allstock15_route(params) =>
      call { 
        controllers_Application_allstock15_invoker.call(Application_1.allstock())
      }
  
    // @LINE:37
    case controllers_Application_save16_route(params) =>
      call { 
        controllers_Application_save16_invoker.call(Application_1.save())
      }
  
    // @LINE:40
    case controllers_Application_getActiveOrders17_route(params) =>
      call { 
        controllers_Application_getActiveOrders17_invoker.call(Application_1.getActiveOrders())
      }
  
    // @LINE:44
    case controllers_Application_checkout18_route(params) =>
      call { 
        controllers_Application_checkout18_invoker.call(Application_1.checkout())
      }
  
    // @LINE:48
    case controllers_Assets_versioned19_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_0.versioned(path, file))
      }
  }
}