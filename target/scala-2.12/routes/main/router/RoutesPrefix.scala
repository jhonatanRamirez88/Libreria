// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tonny_jho/Documents/playframework/java-crud/conf/routes
// @DATE:Sun Jul 22 20:45:45 CDT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
