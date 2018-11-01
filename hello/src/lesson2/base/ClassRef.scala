package lesson2.base

object ClassRef {

  def main(args: Array[String]): Unit = {
    class Calculator {
      val brand: String = "heheda"

      def add(m: Int, n: Int): Int = m + n
    }
    val calc = new Calculator

    println(calc.add(1, 2))

    println(calc.brand)


    class Calculator2(brand: String) {
      /**
        * A constructor.
        */
      val color: String = if (brand == "TI") {
        "blue"
      } else if (brand == "HP") {
        "black"
      } else {
        "white"
      }

      // An instance method.
      def add(m: Int, n: Int): Int = m + n
    }

    val calc2 = new Calculator2("HP")

    println(calc2.color)


    //表达式
    //上文的Calculator例子说明了Scala是如何面向表达式的。颜色的值就是绑定在一个if/else表达式上的。Scala是高度面向表达式的：大多数东西都是表达式而非指令。


    class C {
      var acc = 0

      def minc = {
        acc += 1
      }

      val finc = { () => acc += 1 }
    }


    val c = new C
    //方法可以省略
    println(c.minc) // calls c.minc()
    //函数不能省略
    println(c.finc) // returns the function as a value:


    class ScientificCalculator(brand: String) extends Calculator2(brand) {
      def log(m: Double, base: Double) = math.log(m) / math.log(base)
    }


    class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand) {
      def log(m: Int): Double = log(m, math.exp(1))
    }

    abstract class Shape {
      def getArea(): Int // subclass should define this
    }


    class Circle(r: Int) extends Shape {
      def getArea(): Int = {
        r * r * 3
      }
    }

    val s = new Circle(2)
    println(s.getArea())


    //特质

    trait Car {
      val brand: String
    }

    trait Shiny {
      val shineRefraction: Int
    }

    //优先使用特质。一个类扩展多个特质是很方便的，但却只能扩展一个抽象类。
    //如果你需要构造函数参数，使用抽象类。因为抽象类可以定义带参数的构造函数，而特质不行。例如，你不能说trait t(i: Int) {}，参数i是非法的。
    class BMW extends Car with Shiny {
      val brand = "BMW"
      val shineRefraction = 12
    }


    //泛型
    trait Cache[K, V] {
      def get(key: K): V

      def put(key: K, value: V)

      def delete(key: K)
    }

    //http://twitter.github.io/scala_school/zh_cn/basics.html
  }

}
