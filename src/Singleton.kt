object Singleton {
    var property1: String? = null
    val info: String
        get() = "SingleInfo"
}

/*
class Singleton private constructor() {
    var property1: String? = null
    val info: String
        get() = "SingleInfo"

    companion object {
        val instance = Singleton()
    }
}*/
