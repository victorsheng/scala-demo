package lesson1.begin

object Print2LevelIterate {

  def main(args: Array[String]): Unit = {
    for {
      i <- 1 to 10
      j <- 1 to 10
    }
      println(i + ":" + j)
  }

}
