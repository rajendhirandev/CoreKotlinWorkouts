/**
 *
 * @author Rajendhiran Easu
 * @date 02, November-2019
 */

fun main() {
    /*println("I'm From main")
    MySingle.TestPrint()*/

    /*val sobject = SingleObject()
    SingleObject.SSingle.SOSSingleFun()
    SingleObject.SSingle.x=23
    println("${SingleObject.SSingle.x}")*/

    /*val aaa = AAA()
    AAAInheritSingle.print()*/
    val tester = Tester()
    println(tester.Multiply())

    val mySingle = MySingle
    mySingle.TestPrint()
}

class Tester(var x: Int=10, var y:Int =20) {
    var z = "Tester"

    companion object{
        fun tester(){
            println("")
        }
    }

    fun add() = x.plus(y)
    fun sub() = x.minus(y)
}


fun Tester.Multiply() = x * y

object MySingle {
    init {
        println("Single Initiated....")
    }

    fun TestPrint() {
        println("MySingle Test Print")
    }
}

class SingleObject {

    var x: Int = 20

    init {
        println("I'm Single Object")
    }

    object SSingle {
        var x = 10

        init {
            println("Single Object SSSingle....")
            x = 20;
        }

        fun SOSSingleFun() {
            println("SOSSingle Func")
            println("$x")
        }
    }
}

open class AAA {
    var x = 1
    open fun print() {
        println("Tester")
    }

    init {
        println("AAA Initiated ${x++}")
    }
}

object AAAInheritSingle : AAA() {

    init {
        println("AAAInheritSingle Initiated")
    }

    override fun print() {
        super.print()
        println("Override Print")
    }
}
