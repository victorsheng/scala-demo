package `implicit`

/**
  * 隐式参数
  * implicit parameters
  *
  */
object ImplicitParam {

  def main(args: Array[String]): Unit = {

    abstract class Logger {
      def log(s: String)
    }
    class FileLogger extends Logger {
      def log(s: String) {
        println("Log in file: " + s)
      }
    }
    class StdoutLogger extends Logger {
      def log(s: String) {
        println("Stdout: " + s)
      }
    }
    def Add(a: Int, b: Int)(implicit logger: Logger) {
      val sum = a + b
      logger.log("%d + %d = %d".format(a, b, sum))
    }

    implicit val log = new FileLogger
    //如果上述代码没有implicit val log = new FileLogger这一句，在代码范围内也没有其他的Logger类型的implicit值，编译器会报错.
    //反之，如果能找到Logger类型的隐式值，编译器会将该隐式值作为参数传递过去。
    Add(1, 2)

    //该句 始终会成功
    //TODO 为什么能有2个括号
    Add(2, 3)(new StdoutLogger) //you may do it explicitly


    //------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------


    def implicitParamFunc(name: String)(implicit tiger: Tiger, lion: Lion): Unit = {
      println(name + " have a tiget and a lion, their names are: " + tiger.name + ", " + lion.name)
    }

    object Zoo {
      implicit val tiger = Tiger("tiger1")
      implicit val lion = Lion("lion1")
    }

    implicitParamFunc("format")
  }

}

case class Tiger(val name: String)

case class Lion(val name: String)
