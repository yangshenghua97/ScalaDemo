package ScalaBasic.collection.option

object optionDemo1 {
  def main(args: Array[String]): Unit = {
    val myMap:Map[String,String] = Map("key"->"val")
    val value1:Option[String] = myMap.get("key")
    val value2:Option[String] = myMap.get("key2")
    println(value1)
    println(value2)
  }
}
