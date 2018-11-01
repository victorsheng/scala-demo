package lesson1.classdef


/**
  * 伴生对象对实现辅助方法和工厂很有用。
  *
  * 要实现一个创建不同类型的形状的工厂，我们可以在Scala中创建一个形状工厂。
  *
  */
object WithClass {

  def main(args: Array[String]): Unit = {
    val circle = Shape(2)
    println(circle.area)
    val rectangle = Shape(2, 3)
    println(rectangle.area)
  }

}


trait Shape {
  def area: Double
}

object Shape {

  private class Circle(radius: Double) extends Shape {
    override val area = 3.14 * radius * radius
  }

  private class Rectangle(height: Double, length: Double) extends Shape {
    override val area = height * length
  }

  def apply(height: Double, length: Double): Shape = new Rectangle(height, length)

  def apply(radius: Double): Shape = new Circle(radius)

}
