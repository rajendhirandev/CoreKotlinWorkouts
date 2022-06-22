package highorder.dsl

data class User(val obj: User.() -> Unit) {
    var id: String = "NA"
    var age: Long = 0

    init {
        obj()
    }
}

fun main() {
    val userObj = User {}
    printUser(userObj)
    val usersList = listOf(userObj, User {
        id = "ABC567"
        age = 28
    }, User {
        id = "BCG678"
        age = 24
    }, User {
    })

    usersList[0].id = "BGH905"
    usersList.forEach(::printUser)
}

fun printUser(user: User) {
    println("Id: ${user.id}|| Age: ${user.age.takeIf { it > 0 } ?: "NA"}")
}



