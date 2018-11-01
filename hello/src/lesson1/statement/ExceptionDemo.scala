package lesson1.statement

object ExceptionDemo {

  def main(args: Array[String]): Unit = {
    try {
      throw new Exception("some exception...")
    } finally {
      println("This will always be printed")
    }



  }

}
