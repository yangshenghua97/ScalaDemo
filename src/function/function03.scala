package function

import java.util.Date

/**
  * 偏应用函数
  * Scala 偏应用函数是一种表达式，
  * 你不需要提供函数需要的所有参数，
  * 只需要提供部分，或不提供所需参数。
 */

object function03 {
  def main(args: Array[String]): Unit = {
    val date = new Date()
    val logwith = log(date,_:String);
    Thread.sleep(1000)
    logwith("msg1")
    Thread.sleep(1000)
    logwith("msg2")
  }
  def log(data: Date,massge:String): Unit ={
    println(data+"-----"+massge)
  }
}
