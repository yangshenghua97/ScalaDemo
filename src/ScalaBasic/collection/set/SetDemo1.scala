package ScalaBasic.collection.set

object SetDemo1 {
  def main(args: Array[String]): Unit = {
    val set = Set(1,3,2)
    println(set.getClass.getName)
    println(set.exists(_% 2 == 0))
    println(set.drop(1))
  }
}
