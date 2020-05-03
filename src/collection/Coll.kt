package collection

fun main() {
    var datax = mapOf<Int, String>(10 to "Ragavan", 89 to "Aaradhana", 12 to "Chandra");

    var x=datax.get(10)
    println("X Value: $x")
    for (element in datax) {
        println("Data ${element.value}")
    }
}