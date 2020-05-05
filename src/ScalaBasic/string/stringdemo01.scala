package ScalaBasic.string

object stringdemo01 {
  var name : String = "yangshegnhua"
  var sbu = new StringBuilder;
  sbu++="yang"
  sbu ++= "a"
  sbu ++= "yang"
  def main(args: Array[String]): Unit = {
    println(name)
    println(sbu)
  }
}
