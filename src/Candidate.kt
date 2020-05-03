data class Candidate(var cName: String="Guru") : Checker() {

    var cno: Int = 0
    var cyob: Long = 0
    init {
        cno = 100
        cyob = 1988
        println("First")
    }

    constructor(cId: Int, cName: String, cYOB: Long) : this(cName) {
        cno = cId
        cyob = cYOB
        println("Second")
    }

    constructor(cId: Int) : this(cId, "Rejina", 1999) {
        println("Third")
    }
}
