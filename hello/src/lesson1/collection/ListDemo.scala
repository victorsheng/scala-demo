package lesson1.collection

object ListDemo {

  def main(args: Array[String]): Unit = {
//    val books: List[String] = List("Scala", "Groovy", "Java")


    //Nil也表示空列表。
    val books = "Scala" :: ("Groovy" :: ("Java" :: Nil))
    println(books.head )
    println(books.tail )
  }

}
