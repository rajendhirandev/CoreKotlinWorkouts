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
