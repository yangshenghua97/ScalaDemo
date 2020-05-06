package ScalaBasic.collection.tuple

object Tuple1Demo1 {
  def main(args: Array[String]): Unit = {
    val t = (1,3.14,"yang")
    val t1 = new Tuple3(1,3.14,"Fread")
    println(t1.toString())
  }
}
