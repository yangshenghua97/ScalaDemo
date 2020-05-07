package Pragmatic_Scala_Expressive.Part1.chapter2

object Parameters {
  def main(args: Array[String]): Unit = {
//    println(max)
    val nums:Array[Int] = Array[Int](0,5,4,5,4,5,8,4,8)
    println(max(nums:_*))
  }
  def max(values:Int*) = values.foldLeft(values(0)){Math.max}
}
