package com.asssignment_scala.solutions

object StringInterpolation extends App {
  val number1: Int = 23
  val number2: Int = 45
  val number3: Int = 76
  val number4: Int = 10
  val number5: Int = 12
  val list  : List[Int] = List(number1, number2, number3, number4, number5)
    list.foreach(s => {
      val index: Int = list.indexOf(s)
      val valueAtIndex: Int = s
      print(s"$index = $valueAtIndex" + "\n")
    })
}
