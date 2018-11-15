package `implicit`

object ImplicitMethod {

  def main(args: Array[String]): Unit = {
    implicit def double2Int(d: Double) = d.toInt

    val num: Int = 3.5 // 3， 这段代码会被编译成 val num: Int = double2Int(3.5)
    println(num)
  }

}
