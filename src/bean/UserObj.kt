package bean

import java.time.Year

class Guru @JvmOverloads constructor(@JvmField var username: String, var userYOB: Int=2000) {

    val CURRENT_YEAR = Year.now().value
    var userAge: Int = getMyAge()
    var userDetails: String = getUserInfo()

    private fun getMyAge(): Int =
        if (userYOB > 0 && userYOB < CURRENT_YEAR) {
            //println("Valid ! Input")
            CURRENT_YEAR - userYOB
        } else {
            //println("Err: Values need to be lesser than current year & not be ZERO")
            0
        }

    fun getUserObject() = this

    private fun getUserInfo() = "Name: ${username} || YOB: ${userYOB} || Age: ${userAge}"
}
