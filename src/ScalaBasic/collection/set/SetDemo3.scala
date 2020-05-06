package ScalaBasic.collection.set

object SetDemo3 {
  def main(args: Array[String]): Unit = {
    val site1 = Set(2, 1, 6, 5, 41)
    val site2 = Set("a", "b", "c")
    //++连接两个字符
    var site = site1 ++ site2
    println(site)
    site = site1.++(site2)
    println(site)
  }
}
