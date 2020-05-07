package Pragmatic_Scala_Expressive.Part1.chapter3

object MultiLine {
  def main(args: Array[String]): Unit = {
    val str =
      """
        |yangsheghssdfckjosdkfl;d
        |jkdlsc
        |   asjclisjvcild
        |azskplsokcs
        |zkmdslcsjiovdiofkklsdc
        |skdjiofujesdjrs
        |amsljhcuifhv
        |ajisdocjdsfvi
      """.stripMargin
    //stripMargin将|前面的空白或者控制符去掉
    println(str)
  }
}
