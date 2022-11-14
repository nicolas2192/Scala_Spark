class Person(name: String, val age: Int)

/*
 Not all class parameters are attributes.
 You have to add val before the name to convert it into a attribute as well.
 name is just a parameter, age is an atribute as well.
*/

object main extends App {

  val person = new Person("Nico", 29) {
    println(person.age) // is atribute, it will work
    // println(person.name) // this breaks since name is just a parameter.

    def greet(name: String)

  }

}
