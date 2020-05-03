package ObjectClass

open class MyObjClass(val xName: String = "Test", val xAge: Int = 12) {
    val userId = 1
    val userDept = "Tester"

    companion object {
        @JvmStatic
        var myName: String = "Raguvaran"
        var myCity: String = "NY"
        @JvmStatic
        val myUserName = "Ragavan_1988"
    }
}

class MyObjStud : MyObjClass() {

    val stuId = 214
    val stuName = "Tester Student"
}