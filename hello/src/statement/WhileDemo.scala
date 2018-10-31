package statement

import java.util.Calendar

object WhileDemo {

  def main(args: Array[String]): Unit = {
    def isFridayThirteen(cal: Calendar): Boolean = {
      val dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)
      val dayOfMonth = cal.get(Calendar.DAY_OF_MONTH)
      (dayOfWeek == Calendar.FRIDAY) && (dayOfMonth == 13)
    }

    while (!isFridayThirteen(Calendar.getInstance())) {
      println("Today isn't Friday the 13th. Lame.")
      Thread.sleep(86400000)
    }

    var count = 0

    do {
      count += 1
      println(count)
    } while (count < 10)



  }

}
