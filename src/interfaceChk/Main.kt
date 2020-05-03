package interfaceChk

fun main() {
    val calc = Calc()
    //calc.add(10,20)
    calc.addition(10, 20)
    calc.sub(10, 3, object : subOutput {
        override fun otherCalc(x: Int, y: Int) {
            println("Subraction: ${x - y}")
        }
    })

    calc.mul(10, 20, object : mulOutput {
        override fun multiply(x: Int, y: Int) {
            println("Multiplication: ${x * y}")
        }
    })
    println("0-----0")
    val gu = guru()
    gu.Test()
}

class guru {/*}: iPrint {
    override fun printOutput(output: Int) {
        println("Output Value: $output")
    }*/

    fun Test(){
        val cal = Calc()
        cal.addition1(1,2,object :iPrint{
            override fun printOutput(output: Int) {
                println(output)
            }
        })
    }
}


