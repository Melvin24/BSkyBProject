
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rsp04/Websites/BSkyBProject/Website/conf/routes
// @DATE:Thu Oct 01 21:53:54 BST 2015


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
