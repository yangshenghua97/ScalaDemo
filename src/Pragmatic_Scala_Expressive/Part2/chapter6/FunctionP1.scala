package Pragmatic_Scala_Expressive.Part2.chapter6

object FunctionP1 {
  def sum(nums:Int): Unit ={
    var result = 0
    for(i <- 1 to nums){
      result+=1
    }
    result
  }
  def totalResultOverRange(number:Int,codeBlock:Int => Int): Unit ={
    var result = 0
    for(i <- 1 to number){
      result+=codeBlock(i)
    }
    result
  }

  def main(args: Array[String]): Unit = {
    println(totalResultOverRange(5,i=>i))
  }
}
