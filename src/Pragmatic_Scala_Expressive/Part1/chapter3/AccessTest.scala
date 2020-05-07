package Pragmatic_Scala_Expressive.Part1.chapter3

object AccessTest {
  def main(args: Array[String]): Unit = {
    val microwave = new Microwave
    microwave.start//编译正确
    //microwave.trunTable编译错误，被定义为私有
  }
}
