package interfaceChk

class Calc : output {
    override fun sum(x: Int, y: Int) {
        println("Addition: ${x + y}")
    }

    fun addition1(x: Int, y: Int, action: iPrint) = action.printOutput(x + y)

    fun addition(x: Int, y: Int, action: output = this) = action.sum(x, y)

    /*fun add(x: Int, y: Int) {
        addition(x, y, this)
    }*/

    fun sub(x: Int, y: Int, action: subOutput) {
        action.otherCalc(x, y)
    }

    fun mul(x: Int, y: Int, action: mulOutput) {
        action.multiply(x, y)
    }
}


interface output {
    fun sum(x: Int, y: Int)
}

interface subOutput {
    fun otherCalc(x: Int, y: Int)
}

interface mulOutput {
    fun multiply(x: Int, y: Int)
}

interface iPrint {
    fun printOutput(output: Int)
}