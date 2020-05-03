package highorder.business

class Accounts {

    fun getBusinessStatus(expenses: Double, incomes: Double, stat: (Double, Double) -> Double): Double {
        return stat(expenses, incomes)
    }

    fun getPFValue(salary: Double, pfAmt: (Double) -> (Double)): Double {
        return pfAmt(salary)
    }

}