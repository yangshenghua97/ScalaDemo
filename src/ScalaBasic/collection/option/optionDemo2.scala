package ScalaBasic.collection.option

object optionDemo2 {
  def main(args: Array[String]): Unit = {
    val sites = Map("k1"->"v1","k2"->"v2","k3"->"v3")
    println(show(sites.get("k1")))
    println(show(sites.get("k21")))
  }
  def show(x:Option[String])= x match {
    case Some(s) => s
    case None => "?"
  }
}
