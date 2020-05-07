package ScalaBasic.Regexs

object RegexDemo1 {
  def main(args: Array[String]): Unit = {
    val pattern = "Scala".r
    val str = "Scala is Scalable"
    println(pattern findFirstIn str)
  }
}
