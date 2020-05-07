package Pragmatic_Scala_Expressive.Part1.chapter4

class UserCar(val year:Int) {
  private var milesDriven:Int = 0
  def miles:Int = milesDriven
  def drive(distance:Int): Unit ={
    milesDriven+=Math.abs(distance)
  }
}
