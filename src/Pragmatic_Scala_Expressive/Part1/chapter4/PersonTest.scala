package Pragmatic_Scala_Expressive.Part1.chapter4

object PersonTest {
  def main(args: Array[String]): Unit = {
    val john = new Person("yang","sheng","hua")
    println(john)
    val bill = new Person("Bill","Walker")
    println(bill)
  }
}
