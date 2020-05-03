package abstractCode

/**
 *
 * @author Rajendhiran Easu
 * @date 26, October-2019
 */


interface INotify {
    fun notifier()
}

abstract class BaseNotification : INotify {
    abstract fun myBaseNotification()
    override fun notifier() {
        println("Notifier Calls")
        myBaseNotification()
    }
}

class Notifications : BaseNotification() {
    override fun myBaseNotification() {
        println("MY Notification")
    }
}

fun setNotifier(notify: INotify) {
    println("Set Notifier")
    notify.notifier()
}

fun main() {
    setNotifier(Notifications())
}
