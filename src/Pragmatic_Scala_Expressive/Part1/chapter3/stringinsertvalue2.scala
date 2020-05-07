package Pragmatic_Scala_Expressive.Part1.chapter3

object stringinsertvalue2 {
  def main(args: Array[String]): Unit = {
    var price = 9;
    val totalPrice = s"the amount of discount is $$${price*200/100}"
    println(totalPrice)
  }
}
