package Pragmatic_Scala_Expressive.Part2.chapter6

object FunctionP3 {
  def inject(arr:Array[Int],initial:Int,operation:(Int,Int) =>Int): Unit ={
    var carrayOver = initial
    arr.foreach(ele => carrayOver = operation(carrayOver,ele))
    carrayOver
  }

  def main(args: Array[String]): Unit = {
    val array = Array(2,1,4,5,4)
    val sum = inject(array,5,(caray, ele) => caray+ele)
    println(s"sum of Elements in Array is $sum")
  }
}
