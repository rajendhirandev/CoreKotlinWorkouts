package interfaceChk

/**
 *
 * @author Rajendhiran Easu
 * @date 04, October-2019
 */

interface IConstable {
    fun duty() {
        println("Constable Duty")
    }
}

interface ICoastGuard {
    fun duty() {
        println("Coast Guard Duty")
    }
}

class Police : IConstable, ICoastGuard {

    override fun duty() {
        println("My Police Duty")
        super<IConstable>.duty()
    }
}

fun main() {
    val localPolice = Police()
    localPolice.duty()
}