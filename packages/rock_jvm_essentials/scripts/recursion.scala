object main extends App {

  import annotation.tailrec

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
  def concat_it(aString: String, times: Int): String = {

    def loop(accumulator: String, t: Int): String = {
      if (t <= 1) accumulator
      else loop(aString + accumulator, t - 1)
    }
    loop(aString, times)
  }

  println(concat_it("Nico", 3))

  def concat_it_v2(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concat_it_v2(aString, n-1, aString + accumulator)
  }

  println(concat_it_v2("Nico", 3))

  // 2. Is Prime function that is tail recursive.
  def isPrime(n: Int): Boolean = {
    def loop(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else loop(t-1, n % t != 0 && isStillPrime)
    }
    loop(n/2, true) // here we are setting initial values.
  }

  println(isPrime(2003))
  println(isPrime(629))

  // 3. Fibonacci function that is tail recursive.

  def fibo(n: Int): Int = {
    def loop(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else loop(i + 1, last + nextToLast, last)
    }
    if (n <= 2) 1
    else loop(2, 1, 1) // initial values.
  }

  println(fibo(8))

}
