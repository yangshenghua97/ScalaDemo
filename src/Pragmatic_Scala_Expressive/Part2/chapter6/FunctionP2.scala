package Pragmatic_Scala_Expressive.Part2.chapter6

object FunctionP2 {
  def printValue(geneator:()=>Int): Unit ={
    println(s"Generator value is ${geneator()}")
  }

  def main(args: Array[String]): Unit = {
    printValue(()=>24)
  }
}
