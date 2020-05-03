import java.math.RoundingMode

fun main(ar:Array<String>){
    var aTxt = "Tester"
    val bTxt = "QA"

    println("A Txt: $aTxt || B Txt: $bTxt")
    println("A Txt Length: ${aTxt.length}")

    var xValue=12.51
    var yValue=11.47

    println("xValue + yValue = ${String.format("%.5f",xValue+yValue)}")
    println("xValue + yValue = ${Math.round((xValue+yValue) * 100.0)  / 100.0}")
}