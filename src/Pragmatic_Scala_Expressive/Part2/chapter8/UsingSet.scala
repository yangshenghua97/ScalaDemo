package Pragmatic_Scala_Expressive.Part2.chapter8

object UsingSet {
  def main(args: Array[String]): Unit = {
    val color = Set("Blue","Green","Red")
    println(s"colors $color")
    val colors = color+"Black"
    println(colors)
    println(color)
  }
}
