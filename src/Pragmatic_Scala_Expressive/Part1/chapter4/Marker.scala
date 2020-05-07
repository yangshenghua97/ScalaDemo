package Pragmatic_Scala_Expressive.Part1.chapter4

import scala.collection._

class Marker(val color:String) {
  println(s"Creating ${this}")

  override def toString: String = s"marker color $color"
}
object MarkerFactory {
  private val marker = mutable.Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow"->new Marker("yellow")
  )
  def getMarker(color:String):Marker = marker.getOrElseUpdate(color,new Marker(color))

  def main(args: Array[String]): Unit = {
    println(MarkerFactory getMarker "blue")
    println(MarkerFactory getMarker "red")
    println(MarkerFactory getMarker "yellow")
  }

}
