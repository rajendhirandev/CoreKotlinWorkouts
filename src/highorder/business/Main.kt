package highorder.business

fun main() {
    println("java_comp.Main: "+ testTextLower("HELLO WORLD", ::convert2Lower))
}

fun convert2Lower(text: String) = text.toLowerCase()

fun testTextLower(text: String, grp: (String) -> String): String {
    println("Text: $text")
    return grp(text)
}