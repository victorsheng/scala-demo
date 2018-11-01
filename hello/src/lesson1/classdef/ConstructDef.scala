package lesson1.classdef

object ConstructDef {


  def main(args: Array[String]) {
    class Book(val title: String)
    val book = new Book("Scala")

    println(book);
    //    book.title = "new title"
    println(book.title)
    //book.title = "new title"  //Error


    class Book2(var title: String)
    val book2 = new Book2("Beginning Scala")
    book2.title = "new title"
    println(book2.title)

  }


}

object a2 {

  //private关键字,外界无法访问,只能通过def 方法进行访问
  class Book(private var title: String) {
    def printTitle {
      println(title)
    }
  }

  val book = new Book("Beginning Scala")
  println(book.printTitle)
}

object a3 {

  //当在构造函数参数上未指定val和var时，Scala不生成getter或setter。 66666
  class Book(title: String)

  val book = new Book("Beginning Scala")
  //  book.title //Error
}


object a4 {

  //def this method

  class Book(var title: String, var ISBN: Int) {
    def this(title: String) {
      this(title, 2222)
    }

    def this() {
      this("CSS")
      this.ISBN = 1111
    }

    override def toString = s"$title ISBN- $ISBN"
  }

}