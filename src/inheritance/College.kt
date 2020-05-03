package inheritance

open class College {

    open var dept: String = ""
    var fees: Double = 0.0

    open fun getDepartment(): String {
        return dept
    }

    internal constructor(dept: String, tuitionFees: Double) {
        this.dept = dept
        this.fees = tuitionFees
    }

    fun getFeesPaid(): Double = fees
}