package ScalaBasic.string

object stringdemo02 {
  def main(args: Array[String]): Unit = {
    var url = "www.baidu.com"
    //字符串长度
    val len = url.length
    println(len)
    //字符串拼接
    var constr = url.concat("/666")
    println(constr)
    //创建格式化字符串
    var floatVar = 6.666
    var intvar = 2000
    var stringvar = "yansmkdf"
    var fs = printf("floatvar= "+" %f,\nInteVar = %d"+"\nStr = %s",
      floatVar,intvar,stringvar)
    print(fs)
  }
}
