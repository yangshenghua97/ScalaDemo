package Pragmatic_Scala_Expressive.Part1.chapter4

object MessageDemo{
  def main(args: Array[String]): Unit = {
    val message1:Message[String] = new Message[String]("yang")
    val message2 = new Message(52)
    println(message1)
    println(message1.is("yang"))
    println(message1.is("yangshenghua"))
    println(message2.is(22))
  }
}
