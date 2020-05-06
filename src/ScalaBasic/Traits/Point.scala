package ScalaBasic.Traits

class Point extends Equal {
  override def isEqual(x: Any): Boolean = {
    return false
  }

  def main(args: Array[String]): Unit = {
    var d = new Point()
    println(d.isEqual(1))
  }
}
