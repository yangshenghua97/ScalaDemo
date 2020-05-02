package lookup

object lookup02 {
  def main(args: Array[String]): Unit = {
    var i = 0
    var a = 0
    //左箭头 <- 用于为变量 x 赋值。
    //i to j包含j
    /*
    for(i <- 0 to 50){
      println("Value of i: " + i)
    }

    /**
      *
      * i until j 不包含j
      * 左箭头用于为i赋值
      */
    for(a <- 0 until 50 ){
      println("Value of a: " + a)
    }
    */
    for(i <- 1 to 3;a<- 1 until 3){
      println("i == "+i);
      println("a == "+a);
    }
  }
}
