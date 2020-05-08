package Pragmatic_Scala_Expressive.Part2.chapter9

object RegularExpr {
  def main(args: Array[String]): Unit = {
    val parttern = "(S|s)cala".r
    val str = "Scala is scalable and cool"
    println((parttern findAllIn str).mkString(", "))
  }
}
