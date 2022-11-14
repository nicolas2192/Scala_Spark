object main extends App {
  // You can have default values for functions

  def fact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else fact(n-1, n*acc)
  }

  val fact5 = fact(5) // Omit last paramater as it has a default.
  println(fact5)
}
