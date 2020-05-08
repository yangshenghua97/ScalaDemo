package Pragmatic_Scala_Expressive.Part2.chapter8

object ListDemo1 {
  def main(args: Array[String]): Unit = {
    val list = List(15,674,8,51)
    println(list.head)
    println(list.tail)
    val list2 = list:::List(44,4,54)
    val list3 = list::List(25)
    println(list2)
    println(list3)
  }
}
