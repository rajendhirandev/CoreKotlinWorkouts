package  highorder.closures

import toConcat

fun main() {
    /*val list = ArrayList<Int>()
    for (number in 1..10) {
        list.add(number)
    }

    val listTest = listOf("Test","Testing","Tezter","BeconTest")

    val resultList = list.filterOnCondition { isMultipleOf(it, 3) }
    val resultEvenList = list.filterOnCondition { isEven(it) }
    val resultTextContains = listTest.filterOnCondition { isContains(it) }
    println(resultList)
    println(resultEvenList)
    println(resultTextContains)*/
    println(listOf("T", "U", "V", "Z", "W").joinToString(limit = 3, truncated = ""))

    println(myEmployee("Ragavan") { salutationWithName() })
    println(myEmployee("Rajeevan") { salutationWithName() })
    println(myEmployee("Mugilan") { salutationWithName(1) })
}

data class Office(val eName: String)

fun Office.salutationWithName() = "Mr./Ms./Mrs." toConcat this.eName
fun Office.salutationWithName(eid: Int) = this.salutationWithName() toConcat eid.toString()
inline fun myEmployee(eName: String, salute: Office.() -> String) = Office(eName).salute()

fun isContains(str: String) = str.contains("Test")

fun isEven(number: Int) = number % 2 == 0

fun isMultipleOf(number: Int, multipleOf: Int): Boolean {
    return number % multipleOf == 0
}

inline infix fun <T> List<T>.filterOnCondition(condition: (T) -> Boolean): ArrayList<T> {
    val result = arrayListOf<T>()
    for (item in this) {
        if (condition(item)) {
            result.add(item)
        }
    }
    return result
}
