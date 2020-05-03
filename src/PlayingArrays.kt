import java.util.*

/**
 *
 * @author Rajendhiran Easu
 * @date 28, October-2019
 */

fun main() {
    /*var unameArray: Array<Any> = Array(5) { i -> 0 }*/

    val justArray: List<Int> = listOf(1, 2, 3, 410, 90, 200, 2)
    println(justArray.filter { i -> i > 10 }.map { i -> i }.sum())

    val multiArray = Array(2) { if (it == 0) Array(3) { if (it == 0 || it == 2) "Dev" else "Test" } else "DevOps" }

    //val dataArray = Array(3) { Array<Any>(3) { if (it % 2 == 0) it * 2 else "Odd Value" } }
    val dataArray = Array(3) { Array(3) { it * 2 } }

    println("Type 3")
    dataArray.forEach { e ->
        run {
            println()
            e.forEach { print("$it \t") }
        }
    }

    println("\nType 2")
    for (value in dataArray) {
        for (kValue in value) {
            print("$kValue\t")
        }
        println()
    }

    println("\nType 1")
    for (i in 0..dataArray.size - 1) {
        for (j in 0..dataArray[i].size - 1) {
            print("${dataArray[i][j]} \t")
        }
        println()
    }

    println("\n")
    println(Arrays.deepToString(dataArray))

    /* val g = mutableListOf<String>()
     g += "Tester"
     g += "Tester1"
     g += "Ts"
     g -= "Ts"
     g.forEach { e -> println(e) }*/

    /*var data = arrayOf(1,2,3)
    data.forEach { println(it) }*/


/*    println(Arrays.deepToString(multiArray))*/

    /*for (x in multiArray) {
        if (x is String) {
            println(x)
            break
        }
        for (g in x as Array<*>) {
            print("$g   ")
        }
        println()
    }*/

    /* println("\n")
     multiArray.forEach { e ->
         run {
             if (e is String) println(e)
             if (e is Array<*>) e.forEach { print("$it \t") }
             println()
         }
     }*/


    /*for (i in 1..3) {
        println("i: $i")
        if (i % 2 == 0)
            continue //break
        for (j in 1..3) {
            print("j")
        }
        println()
    }*/

    //var x = Array(5, { "Tester" })
    /*  for (y in 0..multiArray.size-1) {

      }*/

    /*println("X Array Size: ${x.size}")
    var m = x.plus("Testererere")
    println("X Array Size: ${x.size}")
    println("M Array Size: ${m.size}")
    println(x.first())*/

    /*for (i in multiArray){
        println(i)
    }*/


    /*var gArray = Array<Int>(10) { 0 }
    gArray.forEach { println(it) }*/

    /*var unameArrayRay = Array<Any>(5, { i -> 0 })
    unameArrayRay.set(0, arrayOf("Tester", "Test", 'A'))*/

    /*var uId: Array<Int>? = Array(10, { it * 0 })
    uId?.set(0, 242)
    uId?.set(1, 22)
    uId?.set(2, 21)
    uId?.forEach { println(it) }*/

    /*var x = arrayOfNulls<Any>(10)
    x.set(9,"Tester")
    x.set(7,12.4234)
    x.set(1,'A')
    x.forEach { println(it) }*/

    //var g = unameArrayRay.get(0)
    //println(g.toString())


    /*for (i in unameArray.indices) {
        val tempVal = 'x'
        when (i) {
            0, 2 -> unameArray.set(i, 'A')
            1 -> unameArray.set(i, "Str")
            3 -> unameArray.set(i, 12.63)
            else -> unameArray.set(i, tempVal)
        }
    }*/
    //unameArray.set(0, 'A')
    /*unameArray.filter { e -> e.equals('A') }
        .map { e -> "Tester" }
        .forEach { e -> println("Char is $e") }*/

    /*for (s in unameArray) {
        println(s)
    }*/

    /*unameArray.set(0, 'A')
    for (i in 1..unameArray.size - 1) {
        unameArray.set(i, 'C')
    }*/

    //unameArray.forEach { println(it) }
    val players = FormerPlayers(1332)
    println(FormerPlayers.TEAM_NAME)
    println(players.playerId)

    println(FormerPlayers.count())
    val playerClass = FormerPlayers
    println(playerClass.count())
    println(playerClass.TEAM_COUNT)

    var z: Int? = null //2 //null
    println("${z?.plus(24)}")  // Safe Call
    //z?.let { println(it.plus(24))}  // Safe call with let
    //println(z!!.plus(24)) // Null assertion
    //println(z?.plus(24) ?: "No Data") // Elvis Operator

}


class FormerPlayers(val playerId: Int) {
    val playerName = getMyName()
    private fun getMyName() = TEAM_NAME

    var x: String = ""

    fun tester(g: Int, ji: String) {
        var x = g
    }

    companion object Test {
        fun count() = 11
        const val TEAM_NAME = "Test"
        val TEAM_COUNT = this.count()
    }
}
