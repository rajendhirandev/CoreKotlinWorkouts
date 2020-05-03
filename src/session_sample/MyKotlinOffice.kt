package session_sample

/**
 *
 * @author Rajendhiran Easu
 * @date 11, October-2019
 */

fun main() {
    val employees = listOf(
        Employee(100, "Ragavan", eSal = null),
        Employee(101, "Aradhana", 32, 50000.0),
        Employee(eName = "Ravindar", eId = 102, eAge = 21, eSal = null),
        Employee(103, "Kalpana", 23)
    )

    //employees.sortedBy { e->e.eAge }.filter { e -> e.eAge <= 25 }.forEach { e-> println(e.toString()) }

    //println(KtUtils.generatePasswordResetCode())
    //println(KtUtils.maskEmailAddress("rajendhiran.easu@gmail.com"))

    //val output: (Int) -> Unit = { number -> println(number*2)};
    val output = { number: Int -> println(number * 2) }
    output(9)
}


data class Employee(val eId: Int, val eName: String, val eAge: Int = 25, val eSal: Double? = 12500.0) {
    override fun toString(): String {
        return "\n\n Id: $eId / Name: $eName / Age: $eAge / Sal: ${eSal ?: "-"}"
    }
}

class Off {

    fun TesterOff() {
        println("Tester Off")
    }
}