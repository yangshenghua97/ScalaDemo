package Pragmatic_Scala_Expressive.Part1.chapter3

object stringinsertvalue3 {
  def main(args: Array[String]): Unit = {
    val product = "ticket"
    val price = 20.14
    val discount = 10
    println(f"$product $price%% $discount $$${price * discount/100}%2.2f")
  }
}
