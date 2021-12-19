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

    operator fun invoke(func: Customer.() -> Unit): Customer {
        this.func()
        return this
    }

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

    fun urlInfo() {
        println("Prod Url $prodUrl")
        println("Stage Url $stageUrl")
        println("QA Url ${qaUrl}")
    }

    /* operator fun invoke(filing: EnvironmentConfig.() -> Unit): Unit {
         filing()
     }*/
    operator fun invoke(){
        println("This is Environment Config Invoke")
    }

    operator fun invoke(filing: EnvironmentConfig.() -> Unit): EnvironmentConfig {
        this.filing()
        return this
    }
}

fun main() {

    /*val env = EnvironmentConfig()
    env()
    val x = env {
        stage("www.mystage.com\\test")
        prod("www.myprod.com\\tester")
        qa("www.myprod.com\\tester")
    }
    x.urlInfo()*/

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
