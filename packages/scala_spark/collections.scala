// Collections
// Lists
// List are immutable
printf("The list: List(2,4,6,8,10)")

var evens = List(2,4,6,8,10)

// Indexing  values, lists index starts at 0
evens(0)
evens(4)

evens.head // first element
evens.tail // everything but the first item

// Notice that it shows you what type of elements there are.
List(List(1,2,3), List("a"))
List(List(1,2,3), List(4,5,6))
List((4,5,6), ("a"))

var lst = List(1,6,3,9,5)
lst.sorted // returns sorted list
lst.size // returns number of elements
lst.max // maximum value
lst.min // minimum value
lst.sum // add up all elements
lst.product // multiply all values

// slice list using the slice function. This returns the sliced element
var x = List(1,2,3,4,5,6,7,8,9)
x slice (0,3) // (1,2,3)
x slice (4,6) // (5,6)


// Arrays
// List and Arrays are different objects, most of the time you will be using lists.
var arr = Array(1,2,3,4,5)

// arrays will be using along with the range function to create a sequence of numbers.
var numbs = Array.range(0,10) // array of numbers going from 0 to 9 (size 10)

// Range is the same thing, it is just that it is being called from another part.
Range(1,10)


// Sets
// Sets could be mutable and immutable

var s = Set(1,2,3,4,5)
var r = Set(1,2,3,1,2,3)

r.toList // into a list, drops duplicates


// Maps
// Maps are key value pair objects, like dictionaries
var mapy = Map(("a", 1), ("b", 2), ("c", 3))
mapy get "b"
mapy("b")

mapy += ("new" -> 999)
mapy
mapy.keys
mapy.values


// Assessment
// List contains something
var a = List(1,2,3,4,5)
a.contains(3)

// Sum all elements
a.sum

// array with odd numbers up to 15
Range(1, 15, 2)
Array.range(1, 15, 2)

// Unique elements
var b = List(1,2,3,3,4,5,6,6,3,2,1)
b.toSet
