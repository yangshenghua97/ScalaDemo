package Pragmatic_Scala_Expressive.ScalaAppDemo

import scala.io.StdIn

object ConsoleInput {
  //获取用户输入
  def main(args: Array[String]): Unit = {
    println("Please a ticker symbol")
    val symbol = StdIn.readLine()
    println(s"Ok,got it you own $symbol")
  }
}
