package lookup

object lookup04 {
  def main(args: Array[String]): Unit = {
    var a = 0
    var numlist = List(1, 2, 3, 6, 4, 5, 6)
    //循环遍历集合
    for (a <- numlist) {
      println("Value of a:" + a)
    }
  }
}
