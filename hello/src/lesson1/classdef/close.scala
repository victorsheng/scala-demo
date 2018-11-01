package lesson1.classdef

/**
  * 闭包是一个函数，它的返回值取决于在该函数之外声明的一个或多个变量的值。
  */
object close extends App {
  var y = 3
  val multiplier = (x: Int) => x * y
  println(multiplier(3))

}