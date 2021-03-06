package http
package request

sealed trait Method {
  val asString: String
}

case object HEAD extends Method {
  val asString = "HEAD"
}

case object GET extends Method {
  val asString = "GET"
}
