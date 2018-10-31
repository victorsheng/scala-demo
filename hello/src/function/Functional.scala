package function

/**
  * https://www.w3cschool.cn/scala/scala-functional-programming.html
  * 有点晕
  */
object Functional {

  def main(args: Array[String]): Unit = {
    //函数常量以括号括起来的逗号分隔的参数列表开头，后跟箭头和函数体。
    //
    //函数常量也称为匿名函数。
    val add = (x: Int, y: Int) => x + y

    println(add(1, 2))

    //可以将该函数常量分配给一个变量
    val doubler = (i: Int) => {
      i * 2
    }
    //变量doubler是一个函数的实例，称为函数值。
    //函数值是一个对象，它可以存储在一个变量中，它可以使用括号函数调用来调用，如下所示：
    print(doubler(2))
    //----------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------


    val add2 = (x: Int, y: Int) => {
      x + y
    }
    operation(add2)


    operation(add2)
    val subtract = (x: Int, y: Int) => {
      x - y
    }
    val multiply = (x: Int, y: Int) => {
      x * y
    }

    operation(subtract)
    operation(multiply)

    //函数作为返回值
    def greeting() = (name: String) => {
      "hello" + " " + name
    }

    val greet = greeting()
    println(greet("Scala"))
  }

  /**
    * 函数作为参数,因为函数也是一种变量
    *
    * @param functionparam functionparam函数接受两个Int并返回一个 Int
    */
  def operation(functionparam: (Int, Int) => Int) {
    println(functionparam(4, 4))
  }

}
