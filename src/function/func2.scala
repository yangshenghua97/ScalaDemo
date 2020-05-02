package function

object func2 {
  def printMe(str:String):String = {
    return str
  }
  def main(args: Array[String]): Unit = {
    var str:String = printMe("yangshenghua")
    println(str)
  }
}
