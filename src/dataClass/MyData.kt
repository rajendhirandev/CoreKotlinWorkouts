package dataClass

import abstractCode.MyAbstract

data class MyData(val xyName: String, val xAge: Int, override val testString: String) : MyAbstract(xyName) {
    override fun test(x: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}