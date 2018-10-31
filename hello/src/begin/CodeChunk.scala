package begin

object CodeChunk {

  def meth() = "Hello World"

  def meth1(): String = {
    "hi"
  }

  def meth2(): String = {
    val d = new java.util.Date()
    d.toString()
  }

  def main(args: Array[String]) {
    println(meth)
    println(meth1)
    println(meth2)

    val x3: String = {
      val d = new java.util.Date()
      d.toString()
    }

    println(x3)
  }

}
