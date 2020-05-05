package ScalaBasic.scalaClosure

object Demo01 {
  //闭包通常来讲可以简单的认为是可以访问一个函数里面局部变量的另外一个函数。
  def main(args: Array[String]): Unit = {
    println(multi2(5,5))
  }
  val multi1 = (i:Int) => i*10
  val multi2 = (i:Int,a:Int) => i+10+a
}
