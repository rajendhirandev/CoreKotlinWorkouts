enum class MyAppTheme {
    DARK {
        override fun getPrimaryColor() = "#000ff0"
        override fun getBackgroundImage() = 3
        override fun getTextColor() = "#ff0000"
        override fun getStatusColor(status: String) = when (status) {
            "Success" -> "#ff0000"
            "Failure" -> "#00ff00"
            else -> "#0000ff"
        }
    },
    SEMI_DARK {
        override fun getPrimaryColor() = "#cd00323"
        override fun getBackgroundImage() = 2
        override fun getTextColor() = "#fff0f0"
        override fun getStatusColor(status: String) = when (status) {
            "Success" -> "#cd0679"
            "Failure" -> "#00u897"
            else -> "#0hj782"
        }
    },
    LIGHT {
        override fun getPrimaryColor() = "#de535s"
        override fun getBackgroundImage() = 1
        override fun getTextColor() = "#e3r3d3"
        override fun getStatusColor(status: String) = when (status) {
            "Success" -> "#f6y010"
            "Failure" -> "#067s00"
            else -> "#hg00ff"
        }
    };

    abstract fun getPrimaryColor(): String
    abstract fun getBackgroundImage(): Int
    abstract fun getTextColor(): String
    abstract fun getStatusColor(status: String): String
}

fun main() {
    val theme = MyAppTheme.LIGHT
    println("BG Image: ${theme.getBackgroundImage()}  -  Prim.Color: ${theme.getPrimaryColor()}")
    println("BG Image: ${theme.getStatusColor("Success")}  -  Prim.Color: ${theme.getPrimaryColor()}")
}
