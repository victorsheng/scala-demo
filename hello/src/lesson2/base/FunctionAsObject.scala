package lesson2.base

object FunctionAsObject {

  def main(args: Array[String]): Unit = {
    //    函数即对象

    //    函数是一些特质的集合。具体来说，具有一个参数的函数是Function1特质的一个实例。这个特质定义了apply()语法糖，让你调用一个对象时就像你在调用一个函数。
    //Function1 是一种trait
    object addOne extends Function1[Int, Int] {
      def apply(m: Int): Int = m + 1
    }

    //apply语法糖有助于统一对象和函数式编程的二重性。你可以传递类，并把它们当做函数使用，而函数本质上是类的实例。
    println(addOne(1))


    //这是否意味着，当你在类中定义一个方法时，得到的实际上是一个Function*的实例？
    // 不是的，在类中定义的方法是方法而不是函数。在repl中独立定义的方法是Function*的实例。

    class AddOne extends Function1[Int, Int] {
      def apply(m: Int): Int = m + 1
    }

    val plusOne = new AddOne()

    println(plusOne(1))


    //更快捷
    class AddOne2 extends (Int => Int) {
      def apply(m: Int): Int = m + 1
    }







    //模式匹配
    val times = 1

    times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "some other number"
    }

    //使用守卫进行匹配???
    times match {
      case i if i == 1 => "one"
      case i if i == 2 => "two"
      case _ => "some other number"
    }

    def bigger(o: Any): Any = {
      o match {
        case i: Int if i < 0 => i - 1
        case i: Int => i + 1
        case d: Double if d < 0.0 => d - 0.1
        case d: Double => d + 0.1
        case text: String => text + "s"
      }
    }

    val hp20b = Calculator("HP", "20b")
    print(hp20b);

    val hp20B = Calculator("HP", "20b")

    println(hp20b == hp20B)


    val hp20b2 = Calculator("HP", "20B")
    val hp30b2 = Calculator("HP", "30B")

    def calcType(calc: Calculator) = calc match {
      case Calculator("HP", "20B") => "financial"
      case Calculator("HP", "48G") => "scientific"
      case Calculator("HP", "30B") => "business"
//      case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
      case Calculator(_, _) => "Calculator of unknown type"
    }






  }

  case class Calculator(str: String, str1: String)

}
