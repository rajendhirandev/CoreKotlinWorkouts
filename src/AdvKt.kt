fun main() {
    // Infix function
    /*val countries = mapOf("IND" to "India", "UK" to "United Kingdom")
    countries.forEach { println(it.value) }*/
    println(`its works like as it is`())


    val myPlaces = listOf<String>("Chennai", "Puducherry")
    val myPlayers = listOf<Demo>(Demo("123EAX", "Ragavan"), Demo("989XEA", "Rajeevan"))
    val myNumbers = listOf<Int>(1, 2, 3, 4, 5)

    /*val updatedPlayers: List<Demo> = myPlayers.updateObjWith(listOf(Demo("325EUV", "Manirathnam")))
    updatedPlayers.forEach { println(it) }

    val updatedPlaces: List<String> = myPlaces.updateObjWith(listOf("Madurai"))
    updatedPlaces.forEach { println(it) }

    val updatedNumbers = myNumbers.updateObjWith(listOf(10, 9, 8, 7, 6))
    updatedNumbers.forEach { println(it) }*/

    val updatedPlayers = myPlayers updateWith listOf(Demo("325EUV", "Manirathnam"))
    updatedPlayers.forEach { println(it) }

    val updatedPlaces = myPlaces updateWith listOf("Madurai")
    updatedPlaces.forEach { println(it) }

    val updatedNumbers = myNumbers updateWith listOf(10, 9, 8, 7, 6)
    updatedNumbers.forEach { println(it) }
}

data class Demo(val id: String, val name: String)

fun <T> List<T>.updateObjWith(other: List<T>) = this + other

infix fun <T> List<T>.updateWith(other: List<T>) = this + other


fun `its works like as it is`() = "Test Msg"

class AdvGuru {
    fun Minus(x: Int, y: Int) = x Subract y
    infix fun Int.Subract(x: Int) = this - x
}

/*Points Need 2 Learn
* 0. Maps usage with infix Eg. to
* 1. <T> custom function with eg. list<T> & make that as infix & simple operator
* 2. Custom lambda like our with references lambda with receiver
* 3. DSL -- Domain Specifc Language
* 4. 
* */


//Todo
/*
* 0. Operators and Conventions --- ???? <Need to read> ###
* 1. Inline functions
* 2. typealias
* 3.
* */
