class Employee(eDesign: String) {
    var eId: Long = 0
    lateinit var eName: String
    lateinit var eDesignation: String

    init {
        eId = 0
        eName = "Guest-User"
        eDesignation = eDesign
    }

    constructor(id: Long, name: String, design: String) : this(design) {
        eId = id
        eName = name
        eDesignation = design
    }

    constructor(id: Long, name: String) : this(id, name, "Visitor") {
        eId = id
        eName = name
    }
}
