package ScalaBasic.collection.map

object MapDemo1 {
  def main(args: Array[String]): Unit = {
    val colors = Map("red"->"1","sdf"->"sdfds")
    println("Map中的键为:"+colors.keys)
    println("Map中的值为:"+colors.values)
  }
}
