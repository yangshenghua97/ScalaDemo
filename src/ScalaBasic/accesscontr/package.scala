package object accesscontr {
        class Super{
                /**
                  * def f(): Unit ={
                  * println("f")
                  * }
                  */
             protected def f(): Unit ={
                  println("f")
          }
        }
        class Sub extends Super{
                f()
        }
        class Other{
                (new Super)
        }
}
