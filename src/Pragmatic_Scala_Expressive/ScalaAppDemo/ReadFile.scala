package Pragmatic_Scala_Expressive.ScalaAppDemo

import scala.io.Source

object ReadFile extends App {
  println("*** The Content of the file you read is:")
  Source.fromFile("./ReadFile.scala").foreach(print)
}
