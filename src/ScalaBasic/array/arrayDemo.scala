package ScalaBasic.array

object arrayDemo {
  /*
  var arr:Array[String] = new Array[String](5)
  arr(0) = "yang"
  arr(1) = "Baidu"
  */
//  var z = Array("JD","AliBaba","HuaWei")
  var z:Array[String] = Array("JD","HuaWei","Alibaba")

  def main(args: Array[String]): Unit = {
    for(x <- z){
      println(x)
    }
    /*
    var total = 0.0
    for(i <- 0 to (z.length-1)){
    }
    println("综合为："+total)
    */

  }
}


