package ScalaBasic.lookup

object lookup05 {
  def main(args: Array[String]): Unit = {
    var numlist = List(1, 2, 3, 6, 4, 5, 6)
    var a = 0

    /**
      * 循环中的yield会把当前变量的元素记下来。保存到集合中
      * 循环结束后会将返回该集合
      */
    var rete = for{a <- numlist if a != 3;if a < 8}yield a
    for(a <- rete){
      println(a)
    }
  }
}
