package lesson1.classdef

/**
  * case类提供与普通类相同的功能，但编译器生成toString，hashCode和equals方法，您可以覆盖。
  */
object CaseDef {

  def main(args: Array[String]): Unit = {
    val vals = Stuff("David", 45)
    var s: Stuff = Stuff("David", 45)


  }


}


case class Stuff(name: String, age: Int)
