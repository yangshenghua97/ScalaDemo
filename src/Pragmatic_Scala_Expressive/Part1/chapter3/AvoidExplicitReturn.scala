package Pragmatic_Scala_Expressive.Part1.chapter3

object AvoidExplicitReturn {
  //避免显示使用return
  def check1 = true
  //如果显示使用return之必须声明类型
  def check2:Boolean = return true
  def check3 = false
  def main(args: Array[String]): Unit = {
    println(check1)
    println(check2)
  }
}
