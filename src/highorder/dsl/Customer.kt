package highorder.dsl

class GST(var gstNo: Long = 0, var ownerName: String = "") {
    operator fun invoke(func: GST.() -> Unit) {
        func()
    }

    fun printMe() {
        println("GST Print Me")
    }
}

data class Customer(var Id: String = "0", var Name: String = "", var gstInfo: GST = GST()) {
    init {
        println("Test Customer Init $Id")
    }

    operator fun invoke(func: Customer.() -> Unit) = func() /*: Customer {
       this.func()
        return this
    }*/

    operator fun invoke(str: String) {
        Name = str
    }

    fun printData() {
        println("Name: $Name || Id: $Id || ${gstInfo.gstNo}")
    }
}

class EnvironmentConfig {
    private var stageUrl: String = ""
    private var prodUrl: String = ""
    private var qaUrl: String = ""

    fun stage(url: String) {
        this.stageUrl = url
    }

    fun prod(url: String) {
        this.prodUrl = url
    }

    fun qa(url: String) {
        this.qaUrl = url
    }

    fun printUrlInfo() {
        println("Prod Url $prodUrl")
        println("Stage Url $stageUrl")
        println("QA Url ${qaUrl}")
    }

    // This will return the Object -  Use Case - 1
    operator fun invoke(filing: EnvironmentConfig.() -> Unit): EnvironmentConfig {
        this.filing()
        return this
    }
    /* or */

    // This will not return the object - Use Case - 2
    /*operator fun invoke(filing: EnvironmentConfig.() -> Unit): Unit {
        filing()
    }*/
}


/*class EnvConfig {
    var stageUrl: String = ""
    var prodUrl: String = ""
    var qaUrl: String = ""

    fun printUrlInfo() {
        println("Prod Url $prodUrl")
        println("Stage Url $stageUrl")
        println("QA Url ${qaUrl}")
    }

    *//* Choose Either: Use Case 1 OR Use Case 2 *//*

    // This will return the Object -  Use Case - 1
    operator fun invoke(eConfig: EnvConfig.() -> Unit): EnvConfig {
       eConfig()
        return this
    }

    // This will not return the Object -  Use Case - 2
    *//*operator fun invoke(eConfig: EnvConfig.() -> Unit){
        eConfig
    }*//*
}*/


/*class Device() {
    var id: Int = 0
    var name: String = ""
    var make: String = ""

    fun printDeviceInfo() {
        println("ID:  $id | Name: $name | Make: $make")
    }

    operator fun invoke(device: Device.() -> Unit): Device {
        device()
        return this
    }
}*/

class Device(device: Device.() -> Unit) {
    var id: Int = 0
    var name: String = ""
    var make: String = ""

    fun printDeviceInfo() {
        println("ID:  $id | Name: $name | Make: $make")
    }

    init {
        device()
    }
}

data class Info(var infoId: String = "0", var infoDes: String = "")

fun MyInfo(info: Info.() -> Unit) = Info().apply(info)

class Group() {
    var gId = 0
    var gName = ""

    constructor(grp: Group.(x: String) -> Unit) : this() {
        this.grp("Test")
    }
}

class Fly(onFly: Fly.() -> Unit) {
    var fId = 0
    var fDestination = "Chennai"

    init {
        onFly()
    }
}

fun main() {

    /*  // Traditional Way
      val env = EnvConfig()
      env.stageUrl = "www.tradistage.com\\test"
      env.prodUrl = "www.tradiprod.com\\test"
      env.qaUrl = "www.tradiqa.com\\test"
      env.printUrlInfo()

      // Invoke Way Use Case - 1 -- It will return the object
      val en = EnvConfig()
      val obj = en {
          stageUrl = "www.tradistage1.com\\test"
          prodUrl = "www.tradiprod1.com\\test"
          qaUrl = "www.tradiqa1.com\\test"
      }
      obj.printUrlInfo()
      en.printUrlInfo()*/

    /* // Traditional Way
     val env = Device()
     env.id = 102
     env.name = "5.4 GHz Wifi"
     env.make = "Amazon-Cable"
     env.printDeviceInfo()

     // Invoke Way
     val en = Device()
     val obj = en {
         id = 102
         name = "5.4 GHz Wifi"
         make = "Amazon-Cable"
     }
     obj.printDeviceInfo()
     en.printDeviceInfo()*/

    val device = Device {
        id = 102
        name = "5.4 GHz Wifi"
        make = "Amazon-Cable"
    }
    device.printDeviceInfo()

     /* val device = Device {
          id = 23
          name = "2.4Ghz - Extender"
          make = "BSNL-2009"
      }
      device.printDeviceInfo()*/


    /*  val fy = Fly {
          fId = 100
          fDestination = "Bengaluru"
      }
      println(fy.fDestination)

     // Traditional Way
     val env = EnvironmentConfig()
     env.stage("www.tradistage.com\\test")
     env.prod("www.tradiprod.com\\test")
     env.qa("www.tradiqa.com\\test")
     env.printUrlInfo()*/

    // DSL Way
    /* val env = EnvironmentConfig()
     env()
     env {
         stage("www.mystage.com\\test")
         prod("www.myprod.com\\tester")
         qa("www.myprod.com\\tester")
     }
     env.printUrlInfo()

     val output = env {
         stage("www.mystage.com\\test")
         prod("www.myprod.com\\tester")
         qa("www.myprod.com\\tester")
     }
     env.printUrlInfo()*/


    /* val info = Info("ABC123", "MY Information")

   val inf = MyInfo {
       infoId = "ACC132"
       infoDes = "InfoDes"
   }*/

    /*val gr = Group()
    val grp = Group {
        gId = 1234
        gName = "Guru"
    }
     println(grp.gName)
    */

    /* val gst = GST()
     gst {
         gstNo = 5662
         ownerName = "GST-OWNER"
         printMe()
     }*/

    /*var cust = Customer("1353AST", "Ragavan", GST(123673, "Ragav"))

    with(cust) {
        Id = "1453TEST"
        Name = "Ragavan"
        with(gstInfo) {
            gstNo = 14532
            ownerName = "Ragav"
        }
    }*/

    /* val cust = Customer("242")
     println("Customer Info : ")
     cust {
         Id = "1453TEST"
         Name = "Ragavan"
         gstInfo {
             gstNo = 14532
             ownerName = "Ragav"
         }
         printData()
     }

     // Rename the customer  and print the updated data using instance which triggers the invoke
     cust("Test")
     cust.printData()*/


    // Sample Inputs
    /*val customer = Customer()
    customer {
        Id = "23432432"
        Name = "Rajeevan"
        gstInfo {
            gstNo = 4323
            ownerName = "Rajini"
        }
    }*/

    /*customer.apply {
        Id="63GSDSA"
        Name="Aaradhana"
        gstInfo.apply {
            gstNo=142
            ownerName="Aarad"
        }
    }*/
}
