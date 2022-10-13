val name = "nico"

if(name.endsWith("s")){
  printf("The name %s ends with S", name)
}else if(1 == 1){
  println("The value does not end with S")
}else{
  println("Blah")
}

// AND
println((1 == 2) && (2 == 2))

// OR
println((1 == 2) || (2 == 2))

// NOT
println(!(2 == 2))

// For loop
for (x <- Range(1,6)){
  println(x)
}

// Printing even and odd numbers
for (num <- Range(0, 11)){
  if(num == 0){
    println(f"$num Zero is not even nor odd.")
  }else if(num % 2 == 0){
    println(f"$num is even.")
  }else{
    println(f"$num is odd.")
  }
}

// While loop
var x = 0
while (x < 5){
  println(f"the value of x is $x")
  x = x + 1
}

// For the break command (stop the loop if some condition is met)
import util.control.Breaks._

var y = 0
while (y < 10){
  println(f"y value is: $y")
  y = y + 1
  if (y == 5) break
}
