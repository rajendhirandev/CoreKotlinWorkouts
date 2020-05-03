package abstractCode

class MyClass(val class_name: String = "Charlee") : MyAbstract(class_name) {
    override val testString: String ="Tester"

    override fun test(x: String) {
        println("Test My Class $x : $class_name $testStr")
        test()
    }

    override fun tester(){

    }
}