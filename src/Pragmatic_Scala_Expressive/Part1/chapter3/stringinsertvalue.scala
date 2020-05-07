package Pragmatic_Scala_Expressive.Part1.chapter3

object stringinsertvalue{
  def main(args: Array[String]): Unit = {
    val name = "yangshenghua"
    msg(name)
  }
  def msg(name:String): Unit ={
    val msg = s"你好$name"
    println(msg)
  }
}
