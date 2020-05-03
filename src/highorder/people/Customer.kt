package highorder.people

class GST(var gstNo: Long = 0, var ownerName: String = "") {
    operator fun invoke(func: GST.() -> Unit) {
    }
}

class Customer(var Id: String = "0", var Name: String = "", var gstInfo: GST = GST()) {
    operator fun invoke(func: Customer.() -> Unit) {

    }
}

fun main() {

    //var cust = Customer("1353AST", "Ragavan", GST(123673, "Ragav"))

    /*with(cust) {
        Id = "1453TEST"
        Name = "Ragavan"
        with(gstInfo) {
            gstNo = 14532
            ownerName = "Ragav"
        }
    }*/

    val cust = Customer()
    cust {
        Id = "1453TEST"
        Name = "Ragavan"
        gstInfo {
            gstNo = 14532
            ownerName = "Ragav"
        }
    }
    println("Customer Info : ")

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
