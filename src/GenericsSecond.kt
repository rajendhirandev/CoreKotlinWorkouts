fun main() {
    /*val items = listOf<Machine>(
        Electronics("TV"),
        Electronics("Mixe"),
        Electrical("Tube light"),
        Electrical("3M Wire")
    )*/

    /*//out -- Assigning the subtype to the super type, others should be compiler error
    val item1: IProducer<GMachine> = Generator()
    val item2: IProducer<GMachine> = Wires()
    val item3: IProducer<GMachine> = TV()

    val item4:IProducer<GElectronics> = Generator() //Error
    val item5:IProducer<GElectrical> = Generator() // Error
    val item6:IProducer<GMachine> = Generator()*/

    //in -- Assigning the supertype to the subtype, other should be compiler error
   /* val item1:IConsumer<GMachine> = CGenerator()
    val item2:IConsumer<GElectrical> = CWires()
    val item3:IConsumer<GElectronics> = CTV()
    item1.setInfo(GMachine("Kinetic Generator"))
    item2.setInfo(GElectrical("GM 3M Wires"))
    item3.setInfo(GElectronics("Sony TV"))*/

   /* val item1:IConsumer<GMachine> = CGenerator()
    val item2:IConsumer<GMachine> = CWires() // Error
    val item3:IConsumer<GMachine> = CTV() // Error*/

  /*  val item1:IConsumer<GMachine> = CGenerator()
    val item2:IConsumer<GElectrical> = CGenerator()
    val item3:IConsumer<GElectronics> = CGenerator()
    item1.setInfo(GMachine("Kinetic Generator"))
    item2.setInfo(GElectrical("GM 3M Wires"))
    item3.setInfo(GElectronics("Sony TV"))*/

}

//Consumer
class CGenerator : IConsumer<GMachine> {
    override fun setInfo(itm: GMachine) {
        println("I'm CGenConsumer")
        itm.print()
    }
}

class CWires : IConsumer<GElectrical> {
    override fun setInfo(itm: GElectrical) {
        println("I'm CWireConsumer")
        itm.print()
    }
}

class CTV : IConsumer<GElectronics> {
    override fun setInfo(itm: GElectronics) {
        println("I'm CTVConsumer")
        itm.print()
    }
}

//Producer
class Generator : IProducer<GMachine> {
    override fun getInfo(): GMachine {
        println("Machinery")
        return GMachine("All Machines")
    }
}

class Wires : IProducer<GElectrical> {
    override fun getInfo(): GElectrical {
        println("Electrical")
        return GElectrical("GM Wires")
    }
}

class TV : IProducer<GElectronics> {
    override fun getInfo(): GElectronics {
        println("Electronics")
        return GElectronics("Sony TV")
    }
}


interface IProducer<out T> {
    fun getInfo(): T
    //fun setInfo(itm:T)
}

interface IConsumer<in T> {
    //fun getInfo():T
    fun setInfo(itm: T)
}

open class GMachine(val name: String) {
    open fun print() {
        println("I'm $name")
    }
}

class GElectronics(name: String) : GMachine(name)
class GElectrical(name: String) : GMachine(name)
class GSolar(val name: String)