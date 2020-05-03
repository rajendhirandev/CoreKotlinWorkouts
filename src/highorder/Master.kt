package highorder

import java.util.*

val CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR)

fun main() {
    println(getUserYOB(1988, ::yob2Age, ::printDetails))
}

fun getUserYOB(yob: Long, convertAge: (Long) -> Long, details: (String) -> Unit) {
    details("Your Age is :${convertAge(yob)}")
}

fun yob2Age(yob: Long) = CURRENT_YEAR - yob

fun printDetails(details: String) = println(details)
