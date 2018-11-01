package lesson1.classdef

object MethodCall {

  def main(args: Array[String]): Unit = {
    var i=new Instance();
    i.hello()
    i hello;
    i.helloTo("aa")
    i helloTo "aaaaa"

  }

}

class Instance {

  def hello() = println("123")

  def helloTo(string: String)= println(string)
}
