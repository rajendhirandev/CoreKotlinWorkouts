package highorder

import java.util.*

val CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR)

class Operators {
    fun add(a: Int, b: Int) = a + b
    fun inc(a: Int) = a + 1
}
fun calculate(a: Int, b: Int, opr: (Int, Int) -> Int) = opr(a, b)
fun calculate(a: Int, opr: (Int) -> Int) = opr(a)

val addition = { a: Int, b: Int -> Operators().add(a, b) }
fun addition(a: Int, b: Int) = Operators().add(a, b)

val increment = { a: Int -> Operators().inc(a) }
fun increment(a: Int) = Operators().inc(a)
fun main() {
    // println(getUserYOB(1988, ::yob2Age, ::printDetails))
    println("Output: " + calculate(1, 2) { a, b -> Operators().add(a, b) }) // Lambda as param
    println("Output: " + calculate(1, 2, Operators()::add)) // Function as param - reference through its object
    println("Output: " + calculate(1, 2, addition)) // Lambda Expression as param
    println("Output: " + calculate(1, 2, ::addition)) // Function as param
    println("")
    println("Output: " + calculate(1) { a -> Operators().inc(a) }) // Lambda as param
    println("Output: " + calculate(1) { Operators().inc(it) })  //Lambda as param Since it is the only param so, `it` referenced here
    println("Output: " + calculate(1, Operators()::inc)) // Function as param - reference through its object
    println("Output: " + calculate(1, increment)) // Lambda Expression as param
    println("Output: " + calculate(1, ::increment)) // Function as param
}

fun getUserYOB(yob: Long, convertAge: (Long) -> Long, details: (String) -> Unit) {
    details("Your Age is :${convertAge(yob)}")
}

fun yob2Age(yob: Long) = CURRENT_YEAR - yob

fun printDetails(details: String) = println(details)
