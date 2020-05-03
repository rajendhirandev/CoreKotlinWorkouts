package highorder.closures

import java.util.*

val chkVote: (Long) -> Unit = { x: Long ->
    age = Calendar.getInstance().get(Calendar.YEAR) - x
    if (age > 18)
        isRightToVote = "Yes"
}

var isRightToVote = "No"
val yob: Long = 1990
var age: Long = 1
fun main() {


    isRightToVote(yob.toLong(), chkVote)
    println("YOB is $yob, Eligibility Status to cast vote: $isRightToVote")

    /*isRightToVote(yob.toLong()) { x: Long ->
        age = Calendar.getInstance().get(Calendar.YEAR) - x
        if (age > 18)
            isRightToVote = "Yes"
    }
    println("YOB is $yob, Eligibility Status to cast vote: $isRightToVote")*/

    /*isRightToVote(yob.toLong()) {
        age = Calendar.getInstance().get(Calendar.YEAR) - it
        if (age >=18)
            isRightToVote = "Yes"
    }
    println("YOB is $yob, Eligibility Status to cast vote: $isRightToVote")*/

    yob isVoteEligibility {
        age = Calendar.getInstance().get(Calendar.YEAR) - it
        if (age >= 18)
            isRightToVote = "Yes"
    }

    //println("YOB is $yob, Eligibility Status to cast vote: $isRightToVote")
    val yobValue: Long = 1988
    //println("Voting Rights for the person born on $yobValue: ${isVotingRights(yobValue, ::eligibleOrNot)}")
    println("Voting Rights for the person born on $yobValue: ${yobValue seeMyVotingRights ::eligibleOrNot}")
}

fun isRightToVote(yob: Long, check: (Long) -> Unit) {
    check(yob)
}

fun isVotingRights(yob: Long, check4Vote: (Long) -> String): String {
    return check4Vote(Calendar.getInstance().get(Calendar.YEAR) - yob)
}

infix fun Long.seeMyVotingRights(check4Vote: (Long) -> String): String {
    return check4Vote(Calendar.getInstance().get(Calendar.YEAR) - this)
}

fun eligibleOrNot(age: Long) = if (age >= 18) "Eligible" else "Not eligible"

infix fun Long.iamEligibleOrNot(age: Long) = if (age >= 18) "Eligible" else "Not eligible"

infix fun Long.isVoteEligibility(check: (Long) -> Unit) {
    check(this)
}