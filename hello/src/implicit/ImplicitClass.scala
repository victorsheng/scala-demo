package `implicit`

object ImplicitClass {

  def main(args: Array[String]): Unit = {

    implicit class RichInt(n: Int) extends Ordered[Int] {
      def min(m: Int): Int = if (n <= m) n else m

      override def compare(that: Int): Int = ???
    }

    class RichInt2(n: Int) extends Ordered[Int] {
      def min(m: Int): Int = if (n <= m) n else m

      override def compare(that: Int): Int = ???
    }


    //    implicit final def RichInt(n: Int): RichInt = new RichInt(n)


  }

}
