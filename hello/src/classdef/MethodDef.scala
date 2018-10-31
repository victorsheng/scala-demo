package classdef

import java.io.BufferedReader

object MethodDef {

  def myMethod(): String = "www.w3cschool.cn"

  def myOtherMethod() = "Moof"

  def foo(a: Int): String = a.toString

  def f2(a: Int, b: Boolean): String = if (b) a.toString else "false"

  //取一个参数p和类型参数 T ，并返回一个T 的 List 。
  def list[T](p: T): List[T] = p :: Nil

  def largest(as: Int*): Int = as.reduceLeft((a, b) => a max b)

  def mkString[T](as: T*): String = as.foldLeft("")(_ + _.toString)

  def sum[T <: Number](as: T*): Double = as.foldLeft(0d)(_ + _.doubleValue)


  def main(args: Array[String]): Unit = {
    list(1)
    list("Hello")

    println(largest(1))
    println(largest(2, 3, 99))
    println(largest(3, 22, 33, 22))


  }

  def readLines(br: BufferedReader) = {
    var ret: List[String] = Nil

    def readAll(): Unit = br.readLine match {
      case null =>
      case s => ret ::= s; readAll()
    }

    readAll()
    ret.reverse
  }

}

abstract class Base {
  def thing: String
}

class One extends Base {
  def thing = "Moof"
}

class Two extends One {
  override val thing = (new java.util.Date).toString
}

class Three extends One {
  override lazy val thing = super.thing + (new java.util.Date).toString
}

