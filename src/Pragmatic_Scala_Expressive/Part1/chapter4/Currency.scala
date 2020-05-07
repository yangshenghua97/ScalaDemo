package Pragmatic_Scala_Expressive.Part1.chapter4

import java.util.Currency
object Currency extends Enumeration {
  type Currency = Value
  val CNY,GBP,JPY,NOK = Value
}
class Money(val amout:Int,val currency:Currency){
  override def toString: String = s"$amout $currency"
}
object UserCurrency extends App{
    Currency.values.foreach{currency => println(currency)}
}

