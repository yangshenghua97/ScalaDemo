package ScalaBasic.collection.list

object ListDemo6 {
  def main(args: Array[String]): Unit = {
    //List.tabulate()
    val squares = List.tabulate(6)(N => N+N)
    println("一维 ："+squares)
    val mul = List.tabulate(4,5)(_*_)
    println("多维："+mul)
  }
}
