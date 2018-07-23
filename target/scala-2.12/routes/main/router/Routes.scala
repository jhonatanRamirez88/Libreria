// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tonny_jho/Documents/playframework/java-crud/conf/routes
// @DATE:Sun Jul 22 20:45:45 CDT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  LibroController_2: controllers.LibroController,
  // @LINE:18
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    LibroController_2: controllers.LibroController,
    // @LINE:18
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LibroController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LibroController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libros/""", """controllers.LibroController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libros/create""", """controllers.LibroController.create"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libros/save""", """controllers.LibroController.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libros/edit/""" + "$" + """id<[^/]+>""", """controllers.LibroController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libros/update""", """controllers.LibroController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libros/delete/""" + "$" + """id<[^/]+>""", """controllers.LibroController.delete(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """libros/show/""" + "$" + """id<[^/]+>""", """controllers.LibroController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LibroController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libros/")))
  )
  private[this] lazy val controllers_LibroController_index1_invoker = createInvoker(
    LibroController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroController",
      "index",
      Nil,
      "GET",
      this.prefix + """libros/""",
      """Rutas del controlador de libros""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LibroController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libros/create")))
  )
  private[this] lazy val controllers_LibroController_create2_invoker = createInvoker(
    LibroController_2.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroController",
      "create",
      Nil,
      "GET",
      this.prefix + """libros/create""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_LibroController_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libros/save")))
  )
  private[this] lazy val controllers_LibroController_save3_invoker = createInvoker(
    LibroController_2.save,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroController",
      "save",
      Nil,
      "POST",
      this.prefix + """libros/save""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_LibroController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libros/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LibroController_edit4_invoker = createInvoker(
    LibroController_2.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """libros/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_LibroController_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libros/update")))
  )
  private[this] lazy val controllers_LibroController_update5_invoker = createInvoker(
    LibroController_2.update,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroController",
      "update",
      Nil,
      "POST",
      this.prefix + """libros/update""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LibroController_delete6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libros/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LibroController_delete6_invoker = createInvoker(
    LibroController_2.delete(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroController",
      "delete",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """libros/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LibroController_show7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("libros/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LibroController_show7_invoker = createInvoker(
    LibroController_2.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LibroController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """libros/show/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_LibroController_index1_route(params@_) =>
      call { 
        controllers_LibroController_index1_invoker.call(LibroController_2.index)
      }
  
    // @LINE:10
    case controllers_LibroController_create2_route(params@_) =>
      call { 
        controllers_LibroController_create2_invoker.call(LibroController_2.create)
      }
  
    // @LINE:11
    case controllers_LibroController_save3_route(params@_) =>
      call { 
        controllers_LibroController_save3_invoker.call(LibroController_2.save)
      }
  
    // @LINE:12
    case controllers_LibroController_edit4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_LibroController_edit4_invoker.call(LibroController_2.edit(id))
      }
  
    // @LINE:13
    case controllers_LibroController_update5_route(params@_) =>
      call { 
        controllers_LibroController_update5_invoker.call(LibroController_2.update)
      }
  
    // @LINE:14
    case controllers_LibroController_delete6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_LibroController_delete6_invoker.call(LibroController_2.delete(id))
      }
  
    // @LINE:15
    case controllers_LibroController_show7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_LibroController_show7_invoker.call(LibroController_2.show(id))
      }
  
    // @LINE:18
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
