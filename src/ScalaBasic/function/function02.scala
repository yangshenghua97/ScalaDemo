package ScalaBasic.function

object function02 {
  /*
  def func(x:Int):Int={
    var expr:Int = x + 1
    return expr
  }
  */
  //retunr 可以返回任何值
  def func1(a:Int,b:Int):Int={
    var sum : Int = a+b
    return sum
  }
  //如果没有值需要返回就返回Unit
  def main(args: Array[String]): Unit = {
    var sum : Int = func1(5,6)
    println(sum)
  }
}
