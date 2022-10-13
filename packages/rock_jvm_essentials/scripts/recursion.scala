object main extends App {

  // Understanding recursions

  // Typical way, prone to Stack Overflow errors.
  def factorial(x : Int): Int = {
    if (x == 1) 1
    else {
      println("Computing fact of " + x + ", I need fact of " + (x-1))
      val result = x * factorial(x - 1)
      println("Computed fact of " + x)

      result
    }
  }
  println(factorial(5)) // 120

  // Tail Recursion - Avoid Stack Overflow
  // Use recursive call as the LAST expression.

  def clever_factorial(n: Int): BigInt = {
    @tailrec // this is a check, raises an error if the function is not tail recursive
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // Tail Recursion.
    }
    factHelper(n, 1)
  }

  //println(clever_factorial(5000))

  //Exercises
  // 1. Concatenate a string n times using tail recursion
  def concatenate_it(aString: String, n: Int): String = {
    def helper(x: Int): String = {
      if (x == 1) aString
      else
    }
  }

  // 2. Is Prime function that is tail recursive.


  // 3. Fibonacci function that is tail recursive.

}
