package ScalaBasic.flowcontrl

object flowcontrl1 {
  //流程控制语句
  def main(args: Array[String]): Unit = {
    var x = 100
    if(x < 20){
      println("x < " + x)
    }else if (x == 100){
      println("x = "+x)
    }else{
      println("x > "+x)
    }
  }
}
