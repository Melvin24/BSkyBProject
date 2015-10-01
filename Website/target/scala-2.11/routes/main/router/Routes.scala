
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rsp04/Websites/BSkyBProject/Website/conf/routes
// @DATE:Thu Oct 01 21:53:54 BST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Application_1: controllers.Application,
  // @LINE:47
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Application_1: controllers.Application,
    // @LINE:47
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tshirts""", """controllers.Application.tshirts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tshirts/$id<[^/]+>""", """controllers.Application.item(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """phones""", """controllers.Application.phones()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gnomes""", """controllers.Application.gnomes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """faq""", """controllers.Application.faq()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shoppingBag""", """controllers.Application.shoppingBag()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.Application.products()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/$id<[^/]+>""", """controllers.Application.item(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backofhouse""", """controllers.Application.backofhouse()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock/new""", """controllers.Application.createItem()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock/update""", """controllers.Application.addItem()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock/delete/$id<[^/]+>""", """controllers.Application.deleteItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock""", """controllers.Application.allstock()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stock""", """controllers.Application.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage/orders""", """controllers.Application.viewallorders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.Application.getActiveOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout/$id<[^/]+>/$price<[^/]+>""", """controllers.Application.checkout(id:Int, price:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
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

  // @LINE:11
  private[this] lazy val controllers_Application_tshirts1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tshirts")))
  )
  private[this] lazy val controllers_Application_tshirts1_invoker = createInvoker(
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
  private[this] lazy val controllers_Application_item2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tshirts/"), DynamicPart("id", """[^/]+""",true)))
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
      this.prefix + """tshirts/$id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_phones3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("phones")))
  )
  private[this] lazy val controllers_Application_phones3_invoker = createInvoker(
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
  private[this] lazy val controllers_Application_gnomes4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gnomes")))
  )
  private[this] lazy val controllers_Application_gnomes4_invoker = createInvoker(
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
  private[this] lazy val controllers_Application_faq5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("faq")))
  )
  private[this] lazy val controllers_Application_faq5_invoker = createInvoker(
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
  private[this] lazy val controllers_Application_shoppingBag6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shoppingBag")))
  )
  private[this] lazy val controllers_Application_shoppingBag6_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Application_products7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_Application_products7_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_Application_item8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_item8_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_Application_backofhouse9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backofhouse")))
  )
  private[this] lazy val controllers_Application_backofhouse9_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_Application_createItem10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock/new")))
  )
  private[this] lazy val controllers_Application_createItem10_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Application_addItem11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock/update")))
  )
  private[this] lazy val controllers_Application_addItem11_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_Application_deleteItem12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteItem12_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_Application_allstock13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock")))
  )
  private[this] lazy val controllers_Application_allstock13_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_Application_save14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stock")))
  )
  private[this] lazy val controllers_Application_save14_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_Application_viewallorders15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage/orders")))
  )
  private[this] lazy val controllers_Application_viewallorders15_invoker = createInvoker(
    Application_1.viewallorders(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewallorders",
      Nil,
      "GET",
      """""",
      this.prefix + """manage/orders"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_getActiveOrders16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_Application_getActiveOrders16_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_Application_checkout17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("price", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_checkout17_invoker = createInvoker(
    Application_1.checkout(fakeValue[Int], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "checkout",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      """""",
      this.prefix + """checkout/$id<[^/]+>/$price<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
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
  
    // @LINE:9
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:11
    case controllers_Application_tshirts1_route(params) =>
      call { 
        controllers_Application_tshirts1_invoker.call(Application_1.tshirts())
      }
  
    // @LINE:12
    case controllers_Application_item2_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_item2_invoker.call(Application_1.item(id))
      }
  
    // @LINE:14
    case controllers_Application_phones3_route(params) =>
      call { 
        controllers_Application_phones3_invoker.call(Application_1.phones())
      }
  
    // @LINE:15
    case controllers_Application_gnomes4_route(params) =>
      call { 
        controllers_Application_gnomes4_invoker.call(Application_1.gnomes())
      }
  
    // @LINE:18
    case controllers_Application_faq5_route(params) =>
      call { 
        controllers_Application_faq5_invoker.call(Application_1.faq())
      }
  
    // @LINE:19
    case controllers_Application_shoppingBag6_route(params) =>
      call { 
        controllers_Application_shoppingBag6_invoker.call(Application_1.shoppingBag())
      }
  
    // @LINE:23
    case controllers_Application_products7_route(params) =>
      call { 
        controllers_Application_products7_invoker.call(Application_1.products())
      }
  
    // @LINE:24
    case controllers_Application_item8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_item8_invoker.call(Application_1.item(id))
      }
  
    // @LINE:28
    case controllers_Application_backofhouse9_route(params) =>
      call { 
        controllers_Application_backofhouse9_invoker.call(Application_1.backofhouse())
      }
  
    // @LINE:30
    case controllers_Application_createItem10_route(params) =>
      call { 
        controllers_Application_createItem10_invoker.call(Application_1.createItem())
      }
  
    // @LINE:31
    case controllers_Application_addItem11_route(params) =>
      call { 
        controllers_Application_addItem11_invoker.call(Application_1.addItem())
      }
  
    // @LINE:32
    case controllers_Application_deleteItem12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deleteItem12_invoker.call(Application_1.deleteItem(id))
      }
  
    // @LINE:33
    case controllers_Application_allstock13_route(params) =>
      call { 
        controllers_Application_allstock13_invoker.call(Application_1.allstock())
      }
  
    // @LINE:34
    case controllers_Application_save14_route(params) =>
      call { 
        controllers_Application_save14_invoker.call(Application_1.save())
      }
  
    // @LINE:36
    case controllers_Application_viewallorders15_route(params) =>
      call { 
        controllers_Application_viewallorders15_invoker.call(Application_1.viewallorders())
      }
  
    // @LINE:39
    case controllers_Application_getActiveOrders16_route(params) =>
      call { 
        controllers_Application_getActiveOrders16_invoker.call(Application_1.getActiveOrders())
      }
  
    // @LINE:43
    case controllers_Application_checkout17_route(params) =>
      call(params.fromPath[Int]("id", None), params.fromPath[Int]("price", None)) { (id, price) =>
        controllers_Application_checkout17_invoker.call(Application_1.checkout(id, price))
      }
  
    // @LINE:47
    case controllers_Assets_versioned18_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_0.versioned(path, file))
      }
  }
}