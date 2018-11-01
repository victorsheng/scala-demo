package lesson2.collections

object FunctionCombinators {

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4)
    //map 函数
    numbers.map((i: Int) => i * 2)

    def timesTwo(i: Int): Int = i * 2
    //map 方法
    numbers.map(timesTwo)

    // foreach
    numbers.foreach((i: Int) => i * 2)

    val doubled = numbers.foreach((i: Int) => i * 2)

    //filter 函数
    numbers.filter((i: Int) => i % 2 == 0)

    //filter 方法
    def isEven(i: Int): Boolean = i % 2 == 0

    numbers.filter(isEven)



    //zip将两个列表的内容聚合到一个对偶列表中。

    val zip = List(1, 2, 3).zip(List("a", "b", "c"))
    //res0: List[(Int, String)] = List((1,a), (2,b), (3,c))
    println(zip.length)
    println(zip(0))


    //partition将使用给定的谓词函数分割列表。
    val numbersP = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    numbersP.partition(_ % 2 == 0)
    //res0: (List[Int], List[Int]) = (List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))


    //find返回集合中第一个匹配谓词函数的元素。
    numbers.find((i: Int) => i > 5)
    //Option[Int] = Some(6)


    //drop 将删除前i个元素


    numbers.drop(5)

    //dropWhile 将删除匹配谓词函数的第一个元素。
    numbers.dropWhile(_ % 2 != 0)
    //res0: List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9, 10)  只删除了1


    numbers.foldLeft(0)((m: Int, n: Int) => m + n)

    //    可视化观察运行过程：
    // scala> numbers.foldLeft(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }
    //m: 0 n: 1
    //m: 1 n: 2
    //m: 3 n: 3
    //m: 6 n: 4
    //m: 10 n: 5
    //m: 15 n: 6
    //m: 21 n: 7
    //m: 28 n: 8
    //m: 36 n: 9
    //m: 45 n: 10
    //res0: Int = 55


    //flatten将嵌套结构扁平化一个层级。
    val merge = List(List(1, 2), List(3, 4)).flatten
    println(merge.length)


    //flatMap是一种常用的组合子，结合映射[mapping]和扁平化[flattening]。 flatMap需要一个处理嵌套列表的函数，然后将结果串连起来。

    val nestedNumbers = List(List(1, 2), List(3, 4))

    nestedNumbers.flatMap(x => x.map(_ * 2))

    //可以把它看做是“先映射后扁平化”的快捷操作：

    //nestedNumbers.map((x: List[Int]) => x.map(_ * 2)).flatten


    //扩展函数组合子

    def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
      numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
        fn(x) :: xs
      }
    }


    //所有展示的函数组合子都可以在Map上使用。Map可以被看作是一个二元组的列表，所以你写的函数要处理一个键和值的二元组。
    val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)
    extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)


    extensions.filter({ case (name, extension) => extension < 200 })



  }

}
