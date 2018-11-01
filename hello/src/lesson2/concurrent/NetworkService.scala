package lesson2.concurrent


import java.net.{ServerSocket, Socket}


object NetworkService {

  def main(args: Array[String]): Unit = {
    class NetworkService(port: Int, poolSize: Int) extends Runnable {
      val serverSocket = new ServerSocket(port)

      def run() {
        while (true) {
          // This will block until a connection comes in.
          val socket = serverSocket.accept()
          //          (new Handler(socket)).run()
          (new Thread(new Handler(socket))).start()

        }
      }
    }

    class Handler(socket: Socket) extends Runnable {
      def message = (Thread.currentThread.getName() + "\n").getBytes

      def run() {
        socket.getOutputStream.write(message)
        socket.getOutputStream.close()
      }
    }

    (new NetworkService(2020, 2)).run

  }

}
