package ScalaBasic.collection.list

object ListDemo4 {
  //列表连接
  def main(args: Array[String]): Unit = {
    val site1:List[String] = List("a","b","c")
    val site2:List[String] = List("1","2","3")
    //使用List:::运算符
    var fruit0 = site1:::site2
    //List(a, b, c, 1, 2, 3)
    println(fruit0)
    var fruit1 = site1.:::(site2)
    //List(1, 2, 3, a, b, c)
    println(fruit1)
    var fruit2 = List.concat(site1,site2)
    //List(a, b, c, 1, 2, 3)
    println(fruit0)
  }
}
