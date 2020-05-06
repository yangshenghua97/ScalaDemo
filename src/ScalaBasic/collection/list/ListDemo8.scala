package ScalaBasic.collection.list

object ListDemo8{
  //列表预添加元素
  def main(args: Array[String]): Unit = {
    val x = List(1)
    val y = 2+:x
    print(y)
  }
}
