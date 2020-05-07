package Pragmatic_Scala_Expressive.Part1.chapter2

object GreeForEach {
  def main(args: Array[String]): Unit = {
    (1 to 10).foreach(i => print(s"$i\t"))
    println("OK")
  }
}
