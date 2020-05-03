package highorder.business

fun main() {
    val account = Accounts()
    val businessStatus = account.getBusinessStatus(168990.0, 168990.0) { exp, income ->
        income - exp
    }

    //Also, pass it as a normal function and implementation
   /* println("My PF Val: ${account.getPFValue(1000.90, fun(x): Double {
        return x * 10 / 100
    })}")*/

    //println("Business Status: ${businessStatus(businessStatus)}")
    //println("Infix Business Status isBEP: ${100.00 isBreakEvenPoint 100.0}")

    /* val salarPF = { n: Double -> n * 10 / 100 }

     val salaryPF: (Double) -> (Double) = { it ->
         if (it > 8500)
             it * 12.5 / 100
         else
             it * 14.5 / 100
     }*/

    /*val pfValue1 = account.getPFValue(22000.00, salaryPF)
    println("PF Value: $pfValue1")*/
/*
    val pfValue = 10000.00 getPFValue salaryPF
    println("PF Value: $pfValue")*/

    /* // Infix function with lambda expression
     val pfValue = 12500.00 getPFValue {
         var pfValue: Double
         if (it > 8500)
             pfValue = it * 12.5 / 100
         else
             pfValue = it * 14.5 / 100
         pfValue
     }

     println("PFValue: $pfValue")*/

    /*val pfValue = account.getPFValue(22000.00) {
        val pfValue: Double
        if (it > 8500)
            pfValue = it * 12.5 / 100
        else
            pfValue = it * 14.5 / 100
        pfValue
    }
    println("PF Value: $pfValue")*/

}

fun businessStatus(businessVal: Double): String {
    val bVal = String.format("%.2f", businessVal).toDouble()
    return if (businessVal > 0) "Profit : $bVal"
    else if (businessVal < 0) "Loss: $bVal"
    else
        "Break Even Point"
}

infix fun Double.isBreakEvenPoint(expenses: Double): Boolean = this - expenses == 0.0

infix fun Double.getPFValue(pfAmt: (Double) -> Double): Double {
    return pfAmt(this)
}