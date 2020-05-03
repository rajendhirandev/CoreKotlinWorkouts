package highorder.people

class PersonData {
    fun printData() {
        println("Name: $pName || Id: $pId")
    }

    fun printData(x: ArrayList<PersonData>) {
        for (personDataElement in x) {
            println("${personDataElement.pId} || ${personDataElement.pName} ")
        }
    }

    var pId: Int = 0
    var pName: String = ""
}