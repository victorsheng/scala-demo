package lesson1.begin

object TupleDemo {


  def main(args: Array[String]): Unit = {
    //不变的
    val t = ("Hello", 1, 2.3)
    println("Print the whole tuple: " + t)
    println("Print the first item:  " + t._1)
    println("Print the second item: " + t._2)
    println("Print the third item:  " + t._3)
    //    println("Print the third item:  " + t._4)


    val (t1, t2, t3) = ("World", "!", 0x22)
    println(t1 + ", " + t2 + ", " + t3)

    val (t4, t5, t6) = Tuple3("World", "!", 0x22)
    println(t4 + ", " + t5 + ", " + t6)

    //三种声明形式
    (1, "one")
    1 -> "one"
    Tuple2(1, "one")


  }


}
