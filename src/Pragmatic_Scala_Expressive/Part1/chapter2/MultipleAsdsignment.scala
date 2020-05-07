package Pragmatic_Scala_Expressive.Part1.chapter2

object MultipleAsdsignment {
  def getPersonInfo(primariKey:Int):(String,String,String) ={
    ("Yang","sheng","hua")
  }

  def main(args: Array[String]): Unit = {
    val info = getPersonInfo(1)
    println(info._1)
    println(info._2)
    println(info._3)
  }

}
