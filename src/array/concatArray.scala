package array
import Array._
object concatArray {
  def main(args: Array[String]): Unit = {
    var mylist1 = Array(4,64,15,6,8,7,6,51,4)
    var mylist2 = Array(12,5,67,9,8,64,1,6,87,6,84)
    var concatarr = concat(mylist1,mylist2)
    for(x <- concatarr){
      print(x+" ")
    }
  }
}
