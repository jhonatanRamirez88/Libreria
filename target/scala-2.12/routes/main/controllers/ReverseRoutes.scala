// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tonny_jho/Documents/playframework/java-crud/conf/routes
// @DATE:Sun Jul 22 20:45:45 CDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:9
  class ReverseLibroController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "libros/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:10
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "libros/create")
    }
  
    // @LINE:15
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "libros/show/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:11
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "libros/save")
    }
  
    // @LINE:14
    def delete(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "libros/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:13
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "libros/update")
    }
  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "libros/")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
