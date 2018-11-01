package lesson1.classdef

class Shape {
  def area: Double = 0.0


}

class Rectangle(val width: Double, val height: Double) extends Shape {
  override def area: Double = width * height
}

class Circle(val radius: Double) extends Shape {
  override def area: Double = math.Pi * radius * radius
}


class SomeClass(val i: Int) extends AnyVal {
  def twice() = i*2

}

object main{
  def main(args: Array[String]): Unit = {
    val v = new SomeClass(9)
    print(v.twice())
  }
}
