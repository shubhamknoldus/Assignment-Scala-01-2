package com.asssignment_scala.solutions

object Fibonacci extends App {

  def printFibonacci(n: Int): Int = {
    if (n <= 1) {
      n
    }
    else {
      printFibonacci(n - 1) + printFibonacci(n - 2)
    }
  }

  val input: Int = 9
  print(printFibonacci(input))
}
