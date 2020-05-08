package Pragmatic_Scala_Expressive.Part2.chapter8

object SetDemo1 {
  def main(args: Array[String]): Unit = {
    val feed1 = Set("blog.x11.com","pragdave.me","blog.x222.com")
    val feed2 = Set("blog.x11.com","pragdave.me","ahjdk")
    val feedFeeds = feed1 filter(_ contains "blog")
    println(s"blog feeds:${feedFeeds.mkString(", ")}")
    val newFeed = feed1++feed2
    println(newFeed)
    //在feed1前面加 https:// 字符串
    val urls = feed1 map ("https://"+_)
    println(urls)
    feed1.foreach(feed => println(s"Re $feed"))
  }
}
