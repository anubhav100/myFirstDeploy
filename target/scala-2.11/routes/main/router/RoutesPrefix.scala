
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/GIT/InternApp/bootstrapform/conf/routes
// @DATE:Sun Mar 13 22:33:42 IST 2016


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
