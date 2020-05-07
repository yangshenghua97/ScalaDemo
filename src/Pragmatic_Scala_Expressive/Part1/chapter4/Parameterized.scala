package Pragmatic_Scala_Expressive.Part1.chapter4

object Parameterized {
  def echo[T](input1:T,input2:T): Unit ={
    println(s"got $input1 is (${input1.getClass}) $input2 is (${input2.getClass})")
  }
  def main(args: Array[String]): Unit = {
    echo("type",5)
    echo(4,5)
  }
}
