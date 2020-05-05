package ScalaBasic.collection.list

object ListDemo3 {
  def main(args: Array[String]): Unit = {
    //列表基本操作
    val site = "L1"::"Google"::"Baidu"::Nil
    //返回列表的第一个元素
    println(site.head)
    println(site.tail)
    println(site.isEmpty)
  }
}
