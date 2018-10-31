package datatype

object Demo {

  def main(args: Array[String]): Unit = {
    val x = true
    val x2 = false
    println(x)
    println(x2)
    //
    val hello = "Hello"
    println(hello);

    val bookTitle = "Scala" // creating a String
    // String interpolation
    println(s"Book Title is ${bookTitle}");

    val xz: Byte = 30
    val y: Short = xz
    val z: Double = y


    "This is a\ntest"
    "He said, \"SQL is for database!\""
    "First\tSecond"

    //由双引号的三元组界定的字符串常量称为多行字符串常量。
    //写啥就是啥
    println("""This is a "test""")

    """He said, "SQL is for database!" """

    println(
      """First line\n
  Second line\t

Fourth line""")

    println(hello11("show me the money"))
    println(goodbye("show me the money"))

    val f1: (Int, String) => String = (i, s) => s + i
    val f2: Function2[Int, String, String] = (i, s) => s + i

    println(f1(1, "2"))
    println(f2(1, "2"))


    val t1: (Int, String) = (1, "two")
    val t2: Tuple2[Int, String] = (1, "two")
    println(t1)
    println(t2)

  }

  /**
    *
    * @param name
    * @return
    */
  def hello11(name: String) =
    s"""Welcome!
       Hello, $name!
       * (Star!!)
       |Hi.
       |    whitespace.""".stripMargin

  /**
    * 删除前缀,删除后缀
    *
    * @param name
    * @return
    */
  def goodbye(name: String) =
    s"""xxxGoodbye, ${name}yyy
       xxxCome again!yyy""".stripPrefix("xxx").stripSuffix("yyy")

}
