// Functions

def simple(): Unit = {
  println("Hello from inside the function")
}

def adder(num1: Int, num2: Int): Int = {
  return num1 + num2
}

def lister(lst: List[Int]): List[Int] = {
  return lst.tail
}

simple()
adder(2,3)
lister(List(1,2,3,4,5))

// Assessment test

// 1. Check weather the number is even or odd.

def isEven(num: Int) = if (num % 2 == 0) true else false

isEven(21)
isEven(6)


// 2. Check for evens in a list.

var evenlist = List(1,2,3,4,5)
var oddlist = List(1,3,5)

def isThereEven(lst: List[Int]): Boolean = {
  for (x <- lst){
    if (x%2 == 0){
      return true
    }
  }
  return false
}

isThereEven(evenlist)
isThereEven(oddlist)


// 3. Lucky number seven. Add up all values in a list and add 7 twice.

def luckySeven(lst: List[Int]): Int = {
  var res = 0
  for (num <- lst){
    if (num == 7){
      res = res + 14
    }else{
      res = res + num
    }
  }
  return res
}

var testseven1 = List(1,2,7)
var testseven2 = List(1,2,3)

luckySeven(testseven1)
luckySeven(testseven2)


// 4. Return true if the values of the list can be added in two equal groups

def balance_check(lst: List[Int]): Boolean = {
  var left = 0
  var right = lst.sum

  for (x <- Range(0, lst.length)){
    left = left + lst(x)
    right = right - lst(x)

    if (left == right){
      return true
    }
  }
  return false
}

var testbalance1 = List(3,4,7,2,2) // returns false when it should be true
var testbalance2 = List(1,2,3,4,5)
var testbalance3 = List(2,3,3,2)
var testbalance4 = List(1,2,3,4,10)

balance_check(testbalance1)
balance_check(testbalance2)
balance_check(testbalance3)
balance_check(testbalance4)


// 5. Check for palindrome. One liner

def isPalindrome(st: String) = (st == st.reverse)

var stest1 = "123321"
var stest2 = "abracadabra"

isPalindrome(stest1)
isPalindrome(stest2)
