package lesson2.concurrent

object ConcurrentDemo {

  def main(args: Array[String]): Unit = {
    val hello = new Thread(new Runnable {
      def run() {
        println("hello world")
      }
    })
    hello.start();




  }

}
