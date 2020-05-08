package Pragmatic_Scala_Expressive.Part2.chapter9

object StockService {
  def process(input:String): Unit ={
    input match {
      case symbol()=> println(s"Look up symbol $input")
      case _ => println(s"Invalid input $input")
    }
  }
  object symbol {
    def unapply(symbol: String): Boolean = {
      symbol == "GooG" || symbol == "IBM"
    }
  }

  def main(args: Array[String]): Unit = {
    StockService process "GooG"
    StockService process "IBM"
    StockService process "EEE"
  }
}
