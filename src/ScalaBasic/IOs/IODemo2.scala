package ScalaBasic.IOs

import scala.io.Source

object IODemo2 {
  def main(args: Array[String]): Unit = {
    Source.fromFile("Test.txt").foreach{
      print
    }
  }
}
