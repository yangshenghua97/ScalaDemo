package Pragmatic_Scala_Expressive.Part2.chapter8

object MapTest {
  def main(args: Array[String]): Unit = {
    val feeds = Map("Andy"->"blog.2xxx.com","Dave"-> "p.1000.com","HFJS"->"nodfgdshrsf")
    val filterName = feeds filterKeys(_ startsWith "A")
    println(filterName)
    val filterNames = feeds filter{ ele=>
      val (key,value) = ele
      (key startsWith("D"))&&(value contains("p.1000.com"))
    }
    println(filterNames)
    println(feeds.apply("Andy"))
  }
}
