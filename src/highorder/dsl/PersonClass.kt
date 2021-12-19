package highorder.dsl

fun main() {

    var personData = PersonData()

    with(personData) {
        pId = 1
        pName = "Ragavan"
    }

    personData.printData()
    personData.apply {
        pId = 2
        pName = "Ramar"
    }.printData()
    personData.printData()

    val x = arrayListOf<PersonData>();
    x.add(PersonData().apply {
        pId = 10
        pName = "Dennis"
    })
    x.add(PersonData().apply {
        pId = 20
        pName = "De Silva"
    })

    personData.printData(x)

}