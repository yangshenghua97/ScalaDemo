package Pragmatic_Scala_Expressive.Part1.chapter2

object GreeExclusiveUpper {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 3){
      print(s"$i,")
    }
    println("OK")
  }
}
