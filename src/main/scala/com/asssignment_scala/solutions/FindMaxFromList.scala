package com.asssignment_scala.solutions

object FindMaxFromList extends App {
  val number1: Int = 23
  val number2: Int = 45
  val number3: Int = 76
  val number4: Int = 10
  val number5: Int = 12
  val list  : List[Int] = List(number1, number2, number3, number4, number5)

  def findMax(inputList: List[Int]): Int = {
    var max = inputList(0)
    for(iteratorValue <- inputList if(iteratorValue > max ) ) yield max = iteratorValue
    max
  }

  print(findMax(list))

}
