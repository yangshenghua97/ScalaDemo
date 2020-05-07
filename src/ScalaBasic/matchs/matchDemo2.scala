package ScalaBasic.matchs

object matchDemo2 {
  def main(args: Array[String]): Unit = {
    println(matchTest(1))
  }
  def matchTest(x:Any):Any = x match {
    case 1 => "one"
    case "two"=>2
    case y:Int => "scala.int"
    case _ => "many"
  }
}
