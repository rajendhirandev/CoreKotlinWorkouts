package abstractCode

abstract class MyAbstract(val xName: String) {

    val testStr="Tester"
    abstract val testString:String

    abstract fun test(x: String)
    protected fun test() {
        println("Test My Abstract Parent : $xName")
    }

    open fun tester() {

    }
}