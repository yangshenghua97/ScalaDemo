package ScalaBasic.oper

object bitoper {
  //位运算
  def main(args: Array[String]): Unit = {
    var bit1 : Int = 60
    var bit2 : Int = 13

    println(bit1&bit2)
    println(bit1|bit2)
    println(bit1 ^ bit2)
  }
}
