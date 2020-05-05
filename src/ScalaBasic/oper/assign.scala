package ScalaBasic.oper
//赋值运算
object assign {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 20
    var c = 0
    c = a+b
    c -= a
    c += b
    println(c)
  }
}
