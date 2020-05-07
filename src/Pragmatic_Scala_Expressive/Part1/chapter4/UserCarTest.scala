package Pragmatic_Scala_Expressive.Part1.chapter4

object UserCarTest {
  def main(args: Array[String]): Unit = {
    val usercar = new UserCar(2015)
    println(usercar.year)
    usercar.drive(25)
    println(usercar.miles)
  }
}
