package lesson2.collections

object BaseDemo {


  def main(args: Array[String]): Unit = {
    //数组是有序的，可以包含重复项，并且可变。
    val numbers = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    numbers(3) = 10

    //列表是有序的，可以包含重复项，不可变。

    val numbers2 = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)


    //集合无序且不可包含重复项。

    val numbers3 = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

    //元组 Tuple
    //元组在不使用类的情况下，将元素组合起来形成简单的逻辑集合。


    val hostPort = ("localhost", 80)
    println(hostPort._1)
    println(hostPort._2)

    hostPort match {
      case ("localhost", port) => "a"
      case (host, port) => "b"
    }

    //在创建两个元素的元组时，可以使用特殊语法：->

    1 -> 2


    //映射 Map

    Map(1 -> 2)
    Map("foo" -> "bar")

    Map(1 -> Map("foo" -> "bar"))

    def timesTwo(value: Any) = ???

    Map("timesTwo" -> {
      timesTwo(_)
    })




    //Option

    val numbersz = Map("one" -> 1, "two" -> 2)
    println(numbersz.get("two"))

    println(numbersz.get("three"))


  }

}
