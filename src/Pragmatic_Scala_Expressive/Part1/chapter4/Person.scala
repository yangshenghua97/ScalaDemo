package Pragmatic_Scala_Expressive.Part1.chapter4

class Person(val firstName:String,val lastName:String) {
  var position:String = _
  println(s"Creating $toString")
  def this(firstName:String,lastName:String,positionHeld:String){
    this(firstName,lastName)
    position = positionHeld
  }
  override def toString: String = {
    s"$firstName $lastName holds $position"
  }
}
