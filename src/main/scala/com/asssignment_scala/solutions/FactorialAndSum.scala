package com.asssignment_scala.solutions

object FactorialAndSum extends App {


  def returnFactorial(n: Int): Int = if (n == 1) 1 else n * returnFactorial(n - 1)

  def returnSumOfDigts(input: Int): Int = {
    if (input == 0){
     0
    }
    else {
      val mod = input % 10
      mod + returnSumOfDigts(input / 10)
    }
  }

  def printFactorialAndSumofDigits(): Unit = {
    val input: Int = 5
    val result: Int = returnFactorial(input)
    print(result + "\n")
    print(returnSumOfDigts(result))
  }
  printFactorialAndSumofDigits()
}
