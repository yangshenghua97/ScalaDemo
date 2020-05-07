package ScalaBasic.matchs

object matchDemo {
  def main(args: Array[String]): Unit = {
    println(matchTest("yang"))
  }
  def matchTest(x:Any):String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}
