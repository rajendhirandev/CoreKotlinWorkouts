package values

fun getAuthToken(uname: Username, pwd: Password): String {
    // Logic goes here... For now returning the values
    return "${uname.username} | ${pwd.password}"
}


class Username(val username: String)

@JvmInline
value class Password(val password: String) {

}

fun main() {
    val authInfo = getAuthToken(
        Username("Ravi"), Password("PassW0rd20!")
    )
    println(authInfo)
}


class Test(val x:String="Tes"){

    constructor(c:String, b:String):this(){

    }
}
