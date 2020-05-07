package ScalaBasic.IOs

import java.io._

object IODemo {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("Test.txt"))
    writer.write("yangshenghua")
    writer.close()
  }
}
