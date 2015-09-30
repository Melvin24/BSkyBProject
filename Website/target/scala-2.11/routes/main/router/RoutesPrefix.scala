
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mpe12/BSkyBProject/Website/conf/routes
// @DATE:Wed Sep 30 08:58:01 BST 2015


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
