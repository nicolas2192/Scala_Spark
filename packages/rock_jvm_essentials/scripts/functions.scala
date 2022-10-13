object main extends App {

  // Funcitons
  // Curly braces are optional after the equals sign
  def cc(a: String, b: String): String =
    a + " " + b

  val fname = "nicolas"
  val lname = "cortinas"

  println(cc(fname, lname))

  // In Scala 3 all functions should be called with ()
  def noParam(): Int = 21

  println(noParam())

  // Use recursion instead of loops. ALWAYS

  def recFunc(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + recFunc(aString, n - 1)
  }

  println(recFunc("Nicolas", 3))

  // Exercises

  // 1. Greetings
  def greet(name: String, age: Int): String = {
    return f"Hi, my name is $name and I'm $age years old."
  }
  println(greet("nicolas", 29))


  // 2. Factorial fun!
  def factorial(x : Int): Int = {
    if (x == 1)
      return x
    else
      return x * factorial(x - 1)
  }
  println(factorial(5)) // 120


  // 3. Fibonacci of n
  def fibo(n: Int): Int = {
    if (n <= 2) 1
    else fibo(n-1) + fibo(n-2)
  }
  println(fibo(10))
  println(fibo(21))


  // 4. Prime number check
  def is_prime(n: Int): Boolean = {
    val half: Int = n / 2

    def prime_check(prev: Int): Boolean = {
      if (prev == 1) true
      else (n % prev != 0) && prime_check(prev - 1)
    }
    prime_check(half)
  }

  println(is_prime(7))
  println(is_prime(9))

}
