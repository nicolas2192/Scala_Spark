object main extends App {
  val x = 1 + 2
  println(x)

  // Since ifelse is an expression, this part of the code if(aCond)
  // computes and return a value
  val aCond = true
  val resCond = if(aCond) 5 else 3
  println(resCond)

  // In Scala EVERYTHING is an expression.
  // Loops should be avoided.

  // Loops return Unit. This is a special data type for Scala
  // similar to void in another languages. it is ()
  // When something returns Unit, it means it returns
  // something that is not meaninful
  // side effects: println(), whiles and reassignning return Unit
  // they are called side effect because they are expressions
  // that return Unit and as a side effect do something else like
  // printing into the console.

  var aVar = 0
  val aVal = (aVar = 3)
  println(aVal) // returns () -> Unit

  // Code Blocks
  var code_block = {
    var c1 = 2
    var c2 = 5

    if(c1 <= c2) 10 else 100
  }

  println(code_block)

  // Exercises:
  // 1. Whats the difference between "nico" and println("nico")
  // "nico" is a string while the println is an expression that returns Unit

  // 2. Whats the value of:
  val someVal = {
    2 < 3
  }
  // boolean: true

  // 3. Whats the value of:
  val someOtherVal = {
    if(someVal) 239 else 986
    42
  }
  // int: 42


}
