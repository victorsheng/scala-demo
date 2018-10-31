package char1

object VariableDeclare {

  def main(args: Array[String]): Unit = {
    var array: Array[String] = new Array[String](5);
    array = new Array[String](2);
    array(0) = "Hello"
    println(array)
  }




}
