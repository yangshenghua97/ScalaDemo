package Pragmatic_Scala_Expressive.Part1.chapter4
class Message[T](val content:T) {
  override def toString: String = s"message content is $content"
  def is(value:T):Boolean = value == content
}
