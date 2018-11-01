package lesson2.base

/**
  * 函数
  * 匿名函数
  *
  * 在Scala中方法不是值，而函数是。所以一个方法不能赋值给一个val变量，而函数可以。
  */
object FunctionRef {

  def main(args: Array[String]): Unit = {
    def three() = 1 + 2

    println(three())

    //当定义一个函数的时候，需要使用=>
    //    https://www.jianshu.com/p/98aeb220f3b2
    val fun2 = (x: Int) => x + 1
    println(fun2(3))


    //部分应用（Partial application）
    def adder(m: Int, n: Int) = m + n

    val add2 = adder(2, _: Int)
    println(add2(3))


    //柯里化函数
    def multiply(m: Int)(n: Int): Int = m * n

    println(multiply(2)(3));


    val timesTwo = multiply(2) _

    println(timesTwo(3))

    //你可以对任何多参数函数执行柯里化。例如之前的adder函数
    (adder _).curried


    //可变长度参数
    def capitalizeAll(args: String*) = {
      args.map { arg =>
        //首字母大写
        arg.capitalize
      }
    }

    println(capitalizeAll("rarity", "applejack"))


  }
}


