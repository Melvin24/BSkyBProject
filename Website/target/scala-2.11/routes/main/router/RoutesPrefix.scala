
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rsp04/Websites/skyblueteam copy/conf/routes
// @DATE:Wed Sep 23 13:17:16 BST 2015


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
