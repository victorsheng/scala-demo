package lesson2.classref

/**
  * http://twitter.github.io/scala_school/zh_cn/type-basics.html
  * 所有的类型信息会在编译时被删去，因为它已不再需要。这就是所谓的擦除。
  *
  *
  *
  * Scala强大的类型系统拥有非常丰富的表现力。其主要特性有：
  *
  * 1.参数化多态性 粗略地说，就是泛型编程
  * 2.（局部）类型推断 粗略地说，就是为什么你不需要这样写代码val i: Int = 12: Int
  * 3.存在量化 粗略地说，为一些没有名称的类型进行定义
  * 4.视窗 我们将下周学习这些；粗略地说，就是将一种类型的值“强制转换”为另一种类型
  */
object TypeDemo {

  def main(args: Array[String]): Unit = {
    val foos = 2 :: 1 :: "bar" :: "foo" :: Nil
    //现在我们无法恢复其中成员的任何类型信息。


    def drop1[A](l: List[A]) = l.tail


    println(drop1(List(1, 2, 3)))

    def toList[A](a: A) = List(a)

    //    def foo[A, B](f: A => List[A], b: B) = f(b)

    //    def foo[A](f: A => List[A], i: Int) = f(i)


    //类型推断
    //在Scala中所有类型推断是 局部的 。Scala一次分析一个表达式。例如：


    def id[T](x: T) = x

    val x1 = id(322)

    val x2 = id("hey")

    val x3 = id(Array(1, 2, 3, 4))

    //类型信息都保存完好，Scala编译器为我们进行了类型推断。请注意我们并不需要明确指定返回类型。

    //变性 Variance

    //协变covariant	C[T’]是 C[T] 的子类	[+T]
    class Covariant[+A]


    val cv: Covariant[AnyRef] = new Covariant[String]

    //错误
    //    val cv: Covariant[String] = new Covariant[AnyRef]

    class Contravariant[-A]

    val cv2: Contravariant[String] = new Contravariant[AnyRef]


    //    val fail: Contravariant[AnyRef] = new Contravariant[String]

    trait Function1[-T1, +R] extends AnyRef

    class Animal {
      val sound = "rustle"
    }

    class Bird extends Animal {
      override val sound = "call"
    }

    class Chicken extends Bird {
      override val sound = "cluck"
    }



    val getTweet: (Bird => String) = ((a: Animal) => a.sound)

    val hatch: (() => Bird) = (() => new Chicken)


    //边界
    //    def cacophony[T](things: Seq[T]) = things map (_.sound)
    def biophony[T <: Animal](things: Seq[T]) = things map (_.sound)

    biophony(Seq(new Chicken, new Bird))


    def count[A](l: List[A]) = l.size

    def count2(l: List[_]) = l.size

    def count3(l: List[T forSome {type T}]) = l.size

    def drop0(l: List[_]) = l.tail

    def drop2(l: List[T forSome {type T}]) = l.tail


  }


}
