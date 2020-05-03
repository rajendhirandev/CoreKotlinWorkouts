package session_sample

import kotlin.random.Random

object KtUtils {

    const val EMAIL_MASK_REGULAR_EXPRESSION = "(?<=.{1}).(?=.{1}.*@)"
    const val EMAIL_MASK_REPLACEMENT_CHARACTER = "x"
    val PASSWORD_MIN_BOUND_VALUE = 1000
    val PASSWORD_MAX_BOUND_VALUE = 9999

    @JvmStatic
    fun maskEmailAddress(email: String) = email.replace(Regex(EMAIL_MASK_REGULAR_EXPRESSION), EMAIL_MASK_REPLACEMENT_CHARACTER)

    @JvmStatic
    fun generatePasswordResetCode() = Random.nextInt(PASSWORD_MIN_BOUND_VALUE, PASSWORD_MAX_BOUND_VALUE).toString()
}