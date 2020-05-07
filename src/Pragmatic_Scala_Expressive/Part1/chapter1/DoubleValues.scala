package Pragmatic_Scala_Expressive.Part1.chapter1

object DoubleValues {
  def main(args: Array[String]): Unit = {
    /*
    val values = List(1,3,4,5,4,5,4,4,4)
    val doubleValues = values.map(_*2)
    println(doubleValues)*/
    val values:List[String] = List("s1","s2","s3","s4")
    val doubleValues =values.map(_+" ")
    println(doubleValues)
  }
}
