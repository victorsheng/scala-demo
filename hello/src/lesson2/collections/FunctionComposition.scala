package lesson2.collections

object FunctionComposition {

  def main(args: Array[String]): Unit = {
    def f(s: String) = "f(" + s + ")"

    def g(s: String) = "g(" + s + ")"

    val fComposeG = f _ compose g _

    println(fComposeG("yay"))

    //andThen 和 compose很像，但是调用顺序是先调用第一个函数，然后调用第二个，即g(f(x))

    val fAndThenG = f _ andThen g _


    println(fAndThenG("yay"))


    //case 语句
    //那么究竟什么是case语句？
    //这是一个名为PartialFunction的函数的子类。
    //
    //多个case语句的集合是什么？
    //他们是共同组合在一起的多个PartialFunction。


    val one: PartialFunction[Int, String] = {
      case 1 => "one"
      //      case _ => "unknown"
    }

    println(one.isDefinedAt(1))
    println(one.isDefinedAt(2))

    println(one(1));
    //    println(one(2));


    val two: PartialFunction[Int, String] = {
      case 2 => "two"
    }

    val three: PartialFunction[Int, String] = {
      case 3 => "three"
    }

    val wildcard: PartialFunction[Int, String] = {
      case _ => "something else"
    }

    val partial = one orElse two orElse three orElse wildcard


    println(partial(5))
    println(partial(3))
    println(partial(2))
    println(partial(1))
    println(partial(0))


    //上周我们看到一些新奇的东西。我们在通常应该使用函数的地方看到了一个case语句。

    case class PhoneExt(name: String, ext: Int)

    val extensions = List(PhoneExt("steve", 100), PhoneExt("robey", 200))

    extensions.filter { case PhoneExt(name, extension) => extension < 200 }

    //PartialFunction是Function的子类型，所以filter也可以使用PartialFunction！


  }

}
