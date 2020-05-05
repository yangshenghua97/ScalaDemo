package ScalaBasic.array
object RangArr {
  def main(args: Array[String]): Unit = {
    var mylist1 = Range(10,20,2)
    var mylist2 = Range(10,20)
    for(x <- mylist1){
      print(" "+x)
    }
    println()
    for(x <- mylist2){
      print(" "+x)
    }
  }
}
