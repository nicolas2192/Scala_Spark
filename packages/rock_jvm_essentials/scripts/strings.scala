object main extends App {

  // Common Java string functions
  val str = "I'm 29 years old"

  println(str.charAt(5))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Im"))
  println(str.replace("I'm", "I am"))
  println(str.toLowerCase())
  println(str.length)

  // Scala only methods
  val strInt = "21"

  val aNumber = strInt.toInt // converts a number like string into number
  // Appending is done with +: and :+, strings to be appended
  // should be on single quotes, otherwise it returns a Vector.
  println('a' +: strInt :+ 'z') // Appending
  println("a" +: strInt :+ "z") // Returns a Vector
  println(str.reverse)
  println(str.take(2))

  // f interpolators are usually used in the println function,
  // while s interpolators are used with strings mainly
  // raw interpolators do not skip any characters
  println(f"printing the number: $strInt")
  println(raw"this is raw and \n wont be skipped")
  // however it is skipped when passed as a variable
  var escaped = "this is raw and backslash n will be skipped"
  println(raw"$escaped")



}
