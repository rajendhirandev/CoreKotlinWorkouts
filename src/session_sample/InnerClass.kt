package session_sample

/**
 *
 * @author Rajendhiran Easu
 * @date 07, November-2019
 */

fun main() {
    var grp = Group()
    grp.ChildTata().Tester()
    grp.Relatives().RTester()
    Group.Nephew().Testing()  // Non-Inner class call only from the class name i.e. static type
    Group().Relatives().RTester()  // Inner class call made only by object
}

class Group {
    var x = "Tester"
    var y = "Testing"

    fun show() {
        println(x)
        /*  val child = ChildTata()
          child.Tester()
          val nep = Nephew()
          nep.Testing()*/
    }

    inner class ChildTata {
        fun Tester() {
            show()
            println("$x $y")
            var newp = Nephew()
        }
    }

    inner class Relatives {
        // Able to access the outer class variables & methods
        var x = "Rel-Tester"   // Same variable overrides
        var chT = ChildTata()
        var nep = Nephew()

        fun RTester() {
            println("$x $y")
        }
    }

    class Nephew {
        // Can't access the outer class variables & methods
        var x ="Guru"
        fun Testing() {
            println("Testing from Nephew")
        }
    }
}
