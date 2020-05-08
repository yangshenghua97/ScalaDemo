package Pragmatic_Scala_Expressive.Part2.chapter8

object ForExper {
  def main(args: Array[String]): Unit = {
    val result = for (i <- 1 to 10)
      yield i * 2
    println(result)
    val result2 = (1 to 20).map(_ * 2)
    println(result2)
    val doubleEven = for(i <- 1 to 30;if i%2 == 0)
      yield i*2
    println(doubleEven)
    val doubleEven2 = for{
      i <- 1 to 30
      if i % 2 == 0
    }yield i*2
    println(doubleEven2)
  }
}
