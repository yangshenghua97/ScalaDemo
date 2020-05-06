package ScalaBasic.collection.option

object optionDemo3 {
  def main(args: Array[String]): Unit = {
    val a:Option[Int] = Some(5)
    val b:Option[Int] = None
    println(a.getOrElse(0))
    println(a.getOrElse(10))
  }
}
