package Pragmatic_Scala_Expressive.Part1.chapter1

object FindMaxFunction {
  def findMax(templist:List[Int])={
    templist.foldLeft(Integer.MIN_VALUE){ Math.max }
  }
  def main(args: Array[String]): Unit = {
    val l = List(1,56,45,44,5,5)
    println(findMax(l))
  }
}
