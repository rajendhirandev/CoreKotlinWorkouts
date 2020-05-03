package highorder.Order

class Pizza {
    var billAmt: Double = 0.0
    var gstPer: Double = 0.0

    fun MyBills(
        totalAmount: Double,
        gstPercent: Double,
        perCalc: (Double, Double) -> Double
    ): Double {
        gstPer = gstPercent
        billAmt = totalAmount
        return perCalc(totalAmount, gstPercent)
    }

}