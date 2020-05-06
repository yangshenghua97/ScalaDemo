package ScalaBasic.collection.map

object MapDemo2 {
  def main(args: Array[String]): Unit = {
    val sites = Map(
      "run"->"45465",
      "baidu"->"152345",
      "alibaba"->"2153415"
    )
    sites.keys.foreach{i=>
      println("Key "+i)
      println("Value "+sites(i))}
  }
}
