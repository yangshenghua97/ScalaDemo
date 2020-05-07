package ScalaBasic.Exceptions

import java.io.{FileNotFoundException, FileReader}

object ExceptionDemo1 {
  def main(args: Array[String]): Unit = {
    try{
    val f = new FileReader("index.txt")
    }catch {
      case ex:FileNotFoundException=>{
        println("File is not Found")
      }
    }finally{
      println("Exiting finally")
    }
  }
}
