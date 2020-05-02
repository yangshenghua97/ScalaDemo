package function.function2


//方法调用
object function01021 {
  //语法
  def main(args: Array[String]): Unit = {
    println("Rereturn Value:"+addInt(4,4))
    println("Rereturn Value:"+
      new function0201().addInt(4,1))
  }
  def addInt(a:Int,b:Int):Int={
    var sum:Int = 0
    sum = a + b
    return sum
  }
}
