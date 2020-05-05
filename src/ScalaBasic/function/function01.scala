package ScalaBasic.function
/**
  * 方法定义语法
  * def functionName ([参数列表]) : [return type] = {
  * function body
  * return [expr]
  * }
  */
object function01 {
  def m(x:Int) = x + 3
  val f = (x : Int)=>x + 3


  def main(args: Array[String]): Unit = {
    var x =  m(20)
    println(x)
    //有点意思
//    var fv = f.apply(60)
    var fv = f.apply(10)
    println(fv)
  }


}
