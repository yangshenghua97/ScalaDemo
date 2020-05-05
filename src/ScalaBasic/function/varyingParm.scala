package ScalaBasic.function

object varyingParm {
  def main(args: Array[String]): Unit = {
    printfunc("dfg","h","d")
  }
//  Scala 通过在参数的类型之后放一个星号（*）来设置可变参数(可重复的参数)。例如：
  def printfunc(agrs:String*)= {
    var i:Int = 0
    for(age <- agrs){
      println("Arg value["+i+"]="+age)
      i+=1
    }
  }
}
