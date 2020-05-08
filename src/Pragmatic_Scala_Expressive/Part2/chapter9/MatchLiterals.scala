package Pragmatic_Scala_Expressive.Part2.chapter9

object MatchLiterals {

  def activity(day:String): Unit ={
    day match {
      case "7" => print("Eat sleep ,repeat...")
      case "1" => print("周一")
      case "2" => print("周二")
      case "3" => print("周三")
      case "4" => print("周四")
      case "5" => print("周五")
    }
  }

  def main(args: Array[String]): Unit = {
    List("1","4","5","3").foreach{activity}
  }
}
