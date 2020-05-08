package Pragmatic_Scala_Expressive.Part2.chapter10

object Tax {
  def taxFor(): Unit ={
    try{
      val a = 0
      val b = 1
      val r = b/a
    }catch{
      case ex:IllegalArgumentException => println(ex.getMessage)
      case ex:RuntimeException => println(s"Dont bother")
    }
  }

  def main(args: Array[String]): Unit = {
    println(taxFor())
  }
}
