package ScalaBasic.collection.set

object SetDemo5 {
  def main(args: Array[String]): Unit = {
    val num1 = Set(5,6,4,7,5,4)
    val num2 = Set(2,3,4,5)
    //交集
    println(num1.intersect(num2))
    println(num1.union(num2))
  }
}
