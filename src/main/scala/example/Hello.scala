package example

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
  val foo = 0 // scalafix:ok
  val bar = 0 // scalafix:ok
}
