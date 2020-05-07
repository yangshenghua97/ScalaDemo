package ScalaBasic.Regexs

import scala.util.matching.Regex

object RegexDemo2 {
  def main(args: Array[String]): Unit = {
    val pattern = new Regex("(S|s)cala")
    val str = "Scala is scalable and cool"
    println((pattern findAllIn str).mkString("-"))
  }
}
