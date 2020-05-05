package ScalaBasic.collection.list

object ListDemo5 {
  def main(args: Array[String]): Unit = {
    //List.fill()重复创建列表元素
    val site = List.fill(3)("yang")
    println(site)
    val nums = List.fill(10)(3)
    println(nums)
  }
}
