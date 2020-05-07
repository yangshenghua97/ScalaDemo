package Pragmatic_Scala_Expressive.Part1.chapter2

object DefaultValues {
  def info(fristname:String = "yang",lastName:String = " sheng hua"): Unit ={
    println(s"$fristname$lastName")
  }

  def main(args: Array[String]): Unit = {
    info(lastName = "ayang")
    info()
  }
}
