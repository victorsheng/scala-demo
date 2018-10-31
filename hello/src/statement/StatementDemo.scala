package statement

object StatementDemo {

  def main(args: Array[String]): Unit = {

    //if
    var exp = true
    if (exp) println("yes")
    if (exp) {
      println("Line one")
      println("Line two")
    }

    val i1: Int = if (exp) 1 else 3

    val i2: Int = if (exp)
      1
    else {
      val j = System.currentTimeMillis
      (j % 100L).toInt
    }


    //for each
    val dogBreeds = List("A", "B", "C", "D", "E", "F")

    for (breed <- dogBreeds)
      println(breed)


    for (i <- 1 to 10) println(i)

    println("-------------")

    for (breed <- dogBreeds
         if breed.contains("D")
    ) println(breed)

    for (breed <- dogBreeds
         if breed.contains("D")
         if !breed.startsWith("Y")
    ) println(breed)

    for (breed <- dogBreeds
         if breed.contains("D") && !breed.startsWith("Y")
    ) println(breed)


    val books = List("Scala", "Groovy", "Java", "SQL", "CSS")
    for {
      book <- books
      bookVal = book.toUpperCase()
    } println(bookVal)

    //生成新的集合
    val filteredBreeds = for {
      breed <- dogBreeds
      if breed.contains("T") && !breed.startsWith("Y")
    } yield breed

    println(filteredBreeds)


    for {
      breed <- dogBreeds
      upcasedBreed = breed.toUpperCase()
    } println(upcasedBreed)


  }

}
