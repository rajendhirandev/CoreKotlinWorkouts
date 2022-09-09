package delegation

/* val b = BaseImpl(10)
    BaseImplLegacy(20).print()
    Derived(BaseImpl(10)).print()
    Derived(BaseImplLegacy(30)).print()*/

fun main() {
    val url = "http://yourapp.photos.now/photo/0"

    ImageLoad(GlideImpl(url, "")).apply {
        transition()
        onLoad()
        println("ImageLoad: $loaderName")
    }

    ImageLoad(CoilImpl(url, "")).apply {
        transition()
        onLoad()
        println("ImageLoad: $loaderName")
    }

    ImagesTest().tester()

  /*  println(PaymentProcess(CashPayment()).process())
    PaymentProcess.isUPIDown = true
    println(PaymentProcess(UPIPayment("Tez")).process())
    PaymentProcess.isUPIDown = false
    println(PaymentProcess(UPIPayment("Paytm")).process())
    PaymentProcess.isCardDown = true
    println(PaymentProcess(CardPayment("HDFC", "CC")).process())
    PaymentProcess.isCardDown = false
    println(PaymentProcess(CardPayment("Citi")).process())*/
}

interface ImgDecode {
    fun parse(bitmap: Any)
}

class GIFDecoder : ImgDecode {
    override fun parse(bitmap: Any) {
        println("Decoder GIF Image")
    }
}

class PNGDecoder : ImgDecode {
    override fun parse(bitmap: Any) {
        println("Decoder PNG Image")
    }
}

interface ImgSrcLoader {
    val loaderName: String
    fun onLoad()
    fun transition()
}

class GlideImpl(private val url: String, private val view: Any) : ImgSrcLoader {
    override val loaderName: String
        get() = "Glide"

    override fun onLoad() {
        println("Implementation with $loaderName : $url")
    }

    override fun transition() {
        println("Implementation with $loaderName transition Here")
    }
}

class CoilImpl(private val url: String, private val view: Any) : ImgSrcLoader {
    override val loaderName: String
        get() = "COIL"

    override fun onLoad() {
        println("Implementation with $loaderName : $url")
    }

    override fun transition() {
        println("Implementation with $loaderName transition Here")
    }
}

class ImagesTest : ImgSrcLoader by CoilImpl("", ""), ImgDecode by PNGDecoder() {

    fun tester() {
        onLoad()
        transition()
        parse("")
    }

}

class ImageLoad(private val iLoader: ImgSrcLoader) : ImgSrcLoader by iLoader {
    /* This property change will not reflect/accessed on
     the super class implementations.*/
    override val loaderName: String
        get() = "NA"

    override fun transition() {
        if (iLoader is CoilImpl) {
            iLoader.transition()
            return
        }
        println("Transition with ${iLoader.loaderName} is restricted")
    }
}

/*interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        println(x)
    }
}

class BaseImplLegacy(val x: Int) : Base {
    override fun print() {
        println("I'm from Legacy $x")
    }
}

class Derived(b: Base) : Base by b*/

/*interface IPayment {
    fun paymentMode(): String
}

class CashPayment : IPayment {
    override fun paymentMode(): String {
        return "Cash"
    }
}

class UPIPayment(val upiName: String) : IPayment {
    override fun paymentMode(): String {
        return "UPI - $upiName"
    }
}

class CardPayment(val providerName: String, val cardType: String = "DC") : IPayment {
    override fun paymentMode(): String {
        return "Card-$providerName-$cardType"
    }
}

const val PROCESSING_ERROR_MSG = "Sorry we can't process it for now with "
const val PROCESSING_MSG = "Process Initiated for "

class PaymentProcess(val iPayment: IPayment) : IPayment by iPayment {
    companion object {
        var isCardDown: Boolean = false
        var isUPIDown: Boolean = false
    }

    *//*fun processPayment(): String {
        val paymentMode = iPayment.paymentMode()
        return if (iPayment !is CashPayment && (isUPIDown || isCardDown)) {
            "$PROCESSING_ERROR_MSG $paymentMode"
        } else {
            "$PROCESSING_MSG $paymentMode"
        }
    }*//*
}

fun PaymentProcess.process(): String {
    val paymentMode = this.paymentMode()
    return if (this.iPayment !is CashPayment && (PaymentProcess.isUPIDown || PaymentProcess.isCardDown)) {
        "$PROCESSING_ERROR_MSG $paymentMode"
    } else {
        "$PROCESSING_MSG $paymentMode"
    }
}*/
