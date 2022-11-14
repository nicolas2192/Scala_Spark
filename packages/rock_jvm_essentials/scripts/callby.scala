object main extends App {
  // Call By Name
  def callByValue(x: Long): Unit = {
    println("by Value: " + x)
    println("by Value: " + x)
  }

  // Call By Value
  def callByName(x: => Long): Unit = {
    println("by Name: " + x)
    println("by Name: " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  //by Value: 485589880412167 same value because time was computed before passing
  //by Value: 485589880412167
  //by Name: 485589951975292 time was computed when scala got to print function.
  //by Name: 485589953047250

}
