fun main() {
    /*val items = listOf<Machine>(
        Electronics("TV"),
        Electronics("Mixe"),
        Electrical("Tube light"),
        Electrical("3M Wire")
    )*/

    // Out -- Subtype can be assigned to the super type
    /*val sonyTv: InfoProducerClass<Machine> = InfoProducerClass(Electronics("TV"))
    val gmWire: InfoProducerClass<Machine> = InfoProducerClass(Electrical("3M Wire"))
    val kineticGen: InfoProducerClass<Machine> = InfoProducerClass(Machine("Kinetic Generator"))*/

    /*val sonyTv: InfoProducerClass<Electronics> = InfoProducerClass(Machine("TV")) // Error-Out Only subtype class could be assigned to supertype
    val gmWire: InfoProducerClass<Electrical> = InfoProducerClass(Machine("3M Wire")) // Error-Out Only subtype class could be assigned to supertype
    val kineticGen: InfoProducerClass<Machine> = InfoProducerClass(Machine("Kinetic Generator"))*/

    /*sonyTv.getInfo().print()
    gmWire.getInfo().print()
    kineticGen.getInfo().print()*/

    // In -- Supertype can be assigned to the subtype
    val sonyTv:InfoConsumerClass<Electronics> = InfoConsumerClass(Machine("TV"))
    val gmWire:InfoConsumerClass<Electrical> = InfoConsumerClass(Machine("3M Wire"))
    val kineticGen:InfoConsumerClass<Machine> = InfoConsumerClass(Machine("Kinetic Generator"))

   /* val sonyTv:InfoConsumerClass<Electrical> = InfoConsumerClass(Machine("TV"))
    val gmWire:InfoConsumerClass<Electronics> = InfoConsumerClass(Machine("3M Wire"))
    val kineticGen:InfoConsumerClass<Machine> = InfoConsumerClass(Machine("Kinetic Generator"))*/

}

/*interface Group<out T> {
    fun getItem(): T
    fun setItems(itm: T)
}

interface Section<in T> {
    fun setItems(itm: T)
    fun getItems():T
}*/

class InfoProducerClass<out T>(private var item: T) {
    fun getInfo() = item
    /*fun setInfo(itm: T) {
        item = itm
        println("setInfo Call''d")
    }*/
}

class InfoConsumerClass<in T>(private var ite: T) {
    private var item: T? = null
    //fun getInfo() = item
    fun setInfo(itm: T) {
        item = itm
        println("setInfo Call''d")
       /* println(when(item){
            is Machine -> "Machinery"
            is Electrical ->"Electrical"
            is Electronics ->"Electronics"
            else -> "Unknown"
        })*/
    }
}

open class Machine(val name: String) {

    open fun print() {
        println("I'm $name")
    }
}

class Electronics(name: String) : Machine(name)
class Electrical(name: String) : Machine(name)
class Solar(val name: String)