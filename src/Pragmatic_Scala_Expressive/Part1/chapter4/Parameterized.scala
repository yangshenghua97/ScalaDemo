package Pragmatic_Scala_Expressive.Part1.chapter4

object Parameterized {
  def echo[T](input1:T,input2:T): Unit ={
    println(s"$input1 type is (${input1.getClass}) $input2 type is (${input1.getClass})")
  }
  def main(args: Array[String]): Unit = {
    echo("str",5)
    echo[Int](4,5)
  }
}
