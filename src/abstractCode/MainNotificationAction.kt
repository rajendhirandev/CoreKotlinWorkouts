package abstractCode

/**
 *
 * @author Rajendhiran Easu
 * @date 26, October-2019
 */

fun main() {
    val notiMgr = NotificationManager()
    notiMgr.welcomeBoard("Ragavan", "Rajeevan", action = object : INotifications {
        override fun messages(a: String) {
            println(a)
        }
    })
}

class NotificationManager {

    fun welcomeBoard(vararg people: String, action: INotifications) {
        people.forEach { p ->
            action.messages(p)
        }
    }

}

interface INotifications {
    fun messages(a: String)
}