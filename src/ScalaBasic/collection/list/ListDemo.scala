package ScalaBasic.collection.list

object ListDemo {
  def main(args: Array[String]): Unit = {
    //字符串列表
    val site:List[String] = List("v1","v2","v3")
    //整型列表
    val nums:List[Integer] = List(32,21,56)
    //空列表
    val empty:List[Nothing] = List()
    //二维列表
    val dim:List[List[Integer]] = List(
        List(1,0,0),
        List(0,1,0),
        List(0,0,1)
    )
    print(dim)
  }
}
