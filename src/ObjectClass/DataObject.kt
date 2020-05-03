@file:JvmName("DemoUtils")

package ObjectClass

object DataObject : MyObjClass("a", 2) {
    var xvName: String = ""
    var xvAge: Int = 2
    val xvYOB: Long = 1988

    init {
        xvName = "Ragavan"
        xvAge = 23
    }

    //@JvmStatic
    var json = "{\"Test\" : \"A\"}"

}

fun String.ConCat(x: String) = "$this $x"
