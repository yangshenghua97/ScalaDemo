package Pragmatic_Scala_Expressive.Part2.chapter9

object MatchList {
  def processItems(items:List[String]): Unit ={
    items match{
      case List("1","2","3","4") => println("一二三四")
      case List("2","3","4") => println("二三四")
      case List("3","2",_*) => println("三二。。。")
    }
  }
  def process(input:Any): Unit ={
    input match{
      case (_: Int,_: Int) => print(s"Processing (int,int) $input")
      case (_: Double,_: Double) => print("Processing (Double,Double)")
      case msg:Int if msg > 1000 => println("Processing int > 1000")
      case _: Int =>print("Processing int...")
      case _:String => println("Processing String")
      case _ => printf(s"Can`t handle $input")
    }
  }
  def main(args: Array[String]): Unit = {
//    processItems(List("3","2","5"))
//    processItems(List("1","2","3"))
    process(45)
  }

}
