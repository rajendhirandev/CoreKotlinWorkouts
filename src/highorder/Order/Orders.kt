package highorder.Order

fun main() {
    val pizza = Pizza()
    //val perCalc: (Double, Double) -> Double = { amt, gstPer -> (amt * gstPer / 100.00f) }
    //val gstAmount: Double = pizza.MyBills(20000.70, 18.5, perCalc)

    //val gstAmount: Double = pizza.MyBills(20000.70, 18.5, { amt, gstPer -> (amt * gstPer / 100.00f) })

    //val gstAmount: Double = pizza.MyBills(20000.70, 18.5) { amt, gstPer -> (amt * gstPer / 100.00f) }
    //println("GST Amount: ${String.format("%.2f", gstAmount)}")

    // Multi-line HO Fun with Lambda Expression
    val totalBill: Double = pizza.MyBills(13342.62, 4.0) { amt, gstPer ->
        val gTax: Double = amt * gstPer / 100.00
        gTax + amt
    }
    println("Bill Amount: ${String.format("%.2f", pizza.billAmt)}")
    println("GST: ${String.format("%.2f", totalBill-pizza.billAmt)}")
    println("Total Bill Amount (Include GST): ${String.format("%.2f", totalBill)}")

}