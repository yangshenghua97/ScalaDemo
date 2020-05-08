package Pragmatic_Scala_Expressive.Part2.chapter6

class Equipment(val reourt:Int=>Int) {
  def sim(input: Int): Int = {
    println(s"运行sim方法$input")
    reourt(input)
  }
}
object Test{
  def main(args: Array[String]): Unit = {
    val calcu = {input:Int=>println(s"calc with $input");input}
    val equipment1 = new Equipment(calcu)
    val equipment2 = new Equipment(calcu)
    equipment1.sim(45)
    equipment2.sim(5)
  }
}

