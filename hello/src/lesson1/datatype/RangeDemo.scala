package lesson1.datatype

object RangeDemo {


  def main(args: Array[String]) {
    println(1 to 5)
    println(1 until 5)
    println(1 to 20 by 4  )


    var v = 1 to 10        // Int range inclusive, interval of 1, (1 to  10)
    println(v)

//    v = 1 until 10        // Int range exclusive, interval of 1, (1 to 9)
//    println(v)

    val v1 = 1 to 10 by 3           // Int range inclusive, every third.
    println(v1)

    val v2 = 10 to 1 by -3          // Int range inclusive, every third, counting down.
    println(v2)

    val v3 = 1L to 10L by 3         // Long
    println(v3)


    val v4 = 1.1f to 10.3f by 3.1f  // Float with an interval != 1
    println(v4)

    val v5 = 1.1f to 10.3f by 0.5f  // Float with an interval < 1
    println(v5)

    val v6 = 1.1 to 10.3 by 3.1     // Double
    println(v6)

    val v7 = 'a' to 'g' by 3         // Char
    println(v7)

    val v8 = BigInt(1) to BigInt(10) by 3
    println(v8)

    val v9 = BigDecimal(1.1) to BigDecimal(10.3) by 3.1
    println(v9)
  }
}
