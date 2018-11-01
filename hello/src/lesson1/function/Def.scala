package lesson1.function

object Def {

  def hello() = {
    "Hello World!"
  }

  def main(args: Array[String]) {
    def hello() = {"Hello World!"}
    println(hello );
  }


  def hello2():String = {"Hello World!"}

  def hello3 = "Hello World!"

  def square (i:Int) = {i*i}


  def main2(args: Array[String]) {
    def square (i:Int) = {i*i}
    println(square(2) );
  }


  def add(x: Int, y: Int): Int = { x + y }







}
