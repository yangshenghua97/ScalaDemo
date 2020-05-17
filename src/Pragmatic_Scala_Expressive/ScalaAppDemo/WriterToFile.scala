package Pragmatic_Scala_Expressive.ScalaAppDemo

import java.io._

object WriterToFile extends App {
  //读写文件
  val writer = new PrintWriter(new File("Test.txt"))
  writer write "AAPL"
  writer.close()
  //scale的Source类及其伴生类读取文件数据
  println(scala.io.Source.fromFile("Test.txt").mkString)
}
