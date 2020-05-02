package lookup

object lookup05 {
  def main(args: Array[String]): Unit = {
    var numlist = List(1, 2, 3, 6, 4, 5, 6)
    var a = 0
    var retVal = for{a <- numlist if a != 3;
                     if a < 8 } yield a
    for(a <- retVal){
      println("Value of a="+a)
    }
  }
}
