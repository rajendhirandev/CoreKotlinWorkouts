package inheritance

class Student : College {

    var sId: Long = 1000
    var sName: String = ""
    var course: String = ""
    var graduationType: String = "UG"

    private constructor(
        _id: Long,
        _name: String,
        _course: String,
        _dept: String,
        _gradType: String = "UG",
        _fees: Double
    ) : super(tuitionFees = _fees, dept = _dept) {
        sId = _id
        sName = _name
        course = _course
        graduationType = _gradType
    }

    constructor(id: Long, name: String) :
            this(id, name, "MCA", "IT", "PG", 25525.0)


    //override var dept:String=""

    override fun getDepartment()= "$sId - $sName - $graduationType - $course - ${super.getDepartment()}"

}