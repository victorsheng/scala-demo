package statement

object Parten {

  def main(args: Array[String]): Unit = {
    printNum(0)
    printNum(1)
    printNum(2)


    val anyList = List(1, "A", 2, 2.5, 'a')
    //匹配任何类型
    for (m <- anyList) {
      m match {
        case i: Int => println("Integer: " + i)
        case s: String => println("String: " + s)
        case f: Double => println("Double: " + f)
        case other => println("other: " + other)
      }
    }

    44 match {
      case 44 => true // if we match 44,the result is true
      case _ => false // otherwise the result isfalse
    }


    "CSS" match {
      case "CSS" => 45 // the result is 45 if we match "CSS"
      case "Elwood" => 77
      case _ => 0
    }


  }

  def printNum(int: Int) {
    int match {
      case 0 => println("Zero")
      case 1 => println("One")
      //带下划线_的最后一种情况是通配符。它匹配任何未定义在上面的情况下。
      case _ => println("more than one")
    }
  }


  def fibonacci(in: Int): Int = in match {
    case 0 => 0
    case 1 => 1
    case n => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fib2(in: Int): Int = in match {
    case n if n <= 0 => 0
    case 1 => 1
    case n => fib2(n - 1) + fib2(n - 2)
  }


}
