package lesson2.base

object OtherRef {

  def main(args: Array[String]): Unit = {
    class Foo {}

    object FooMaker {
      def apply() = new Foo
    }

    val newFoo = FooMaker()

    //apply 方法
    class Bar {
      def apply() = 0
    }

    val bar = new Bar
    //在这里，我们实例化对象看起来像是在调用一个方法。
    bar()


    //单例对象
    object Timer {
      var count = 0

      def currentCount(): Long = {
        count += 1
        count
      }
    }

    //单例对象可以和类具有相同的名称，此时该对象也被称为“伴生对象”。我们通常将伴生对象作为工厂使用。

    println(Timer.currentCount())

    class Bar2(foo: String)

    object Bar2 {
      def apply(foo: String) = new Bar2(foo)
    }


  }

}
