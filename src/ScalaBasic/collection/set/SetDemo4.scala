package ScalaBasic.collection.set

object SetDemo4 {
  def main(args: Array[String]): Unit = {
    val num = Set(4,5,6,4,5,4,4,6)
    println(num)
    println(num.max)
    println(num.min)
  }
}
