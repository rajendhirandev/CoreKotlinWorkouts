import kotlin.math.PI

fun main() {
    val radius = 2.0
    println(calculateAOC(radius, { PI * it * it }, ::formatted2decimalPos))
}

fun formatted2decimalPos(inputValue: Double): String {
    return "%.2f".format(inputValue)
}

fun calculateAOC(radiusValue: Double, aoc: (Double) -> Double, format: (Double) -> String): String {
    return "Area of Circle: ${format(aoc(radiusValue))}"
}
