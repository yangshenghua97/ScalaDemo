package Pragmatic_Scala_Expressive.Part2.chapter9

object MatchUsingRegex {
  def process(input:String): Unit ={
    val GooStock = """^GOOG:(\d*\.\d+)""".r
    input match {
      case GooStock(price) => println(s"price of Goog is $$$input")
      case _ => println(s"not processing $input")
    }
  }

  def main(args: Array[String]): Unit = {
    process("GOOG:45.15")
    process("GOOG:45")

  }
}
