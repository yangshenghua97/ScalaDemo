package Pragmatic_Scala_Expressive.Part2.chapter9

object MatchTuples {
  def processCoor(str: Any): Unit ={
    str match{
      case (lat,long) => printf("processCoor (%d,%d)",lat,long)
      case "OK" => println("OK了")
      case _ => println("ON value")
    }
  }
  def main(args: Array[String]): Unit = {
    processCoor((15,4))
  }
}
