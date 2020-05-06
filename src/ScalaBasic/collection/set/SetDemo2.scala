package ScalaBasic.collection.set

object SetDemo2 {
  def main(args: Array[String]): Unit = {
    val site = Set("yang","Sheng","Hua")
    val nums:Set[Int] = Set()
    println(site.head)
    println(site.tail)
    println(site.isEmpty)
    println(nums.isEmpty)
  }
}
