import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


//@file:JvmName("Gurunath")

fun main(ar: Array<String>) {


    // Inline Comment

    /* Mult
    * line comment*/


    /*
     // Basic Checks with data types and var & val
     println("God Knows All, Trust in God")
    println(5f / 2)
    var xTxt = "Rajeevan"
    var yTxt = "Aaradhana"
    var xValue: Float
    var yValue: Double
    yValue=12.0
    val gTxt = "Tester"
    xValue=12f
    xValue = 12.3f
    xTxt = "Bujibabu";
    println("Names : " + xTxt + " " + yTxt)
    println("xValue : "+ ++xValue) */

    // Classes and Object Access
    /*
    var userObj = Guru("Ragavan", 2001)
    userObj = userObj.getUserObject() //as Guru

    println("Username: ${userObj.CURRENT_YEAR}")
    println(userObj.userAge)
    println(userObj.userDetails)

    */

    // Ranges
    /* var xRange = 5.downTo(1) step 3

     for (x in xRange) {
         println(x)
     }*/

    // When Statement
    //val x = "tez"

    /* when(x){
         "tez" -> println("Value tez")
         "Sez" -> println("Value Sez")
         else -> println("Unknown")
        *//* 1,2 -> println("One & Two")
        in 9..20 -> println("between 9 to 20")
        !in 9..10 -> println("not between 9 to 10")*//*
    }*/


    /* val x = "tez"
    val xVal = when (x) {
         "tez" -> {
             println("Status: Value tez")
             1
         }
         "Sez" -> {
             println("Status: Value Sez")
             2
         }
         else -> {
             println("Status: Value Unknown")
             0
         }
     }
     println(xVal)*/

    /*// Looping
    //var xArray = Array<String>(5) { "Ragavan";"Aaradhana";"Illamaran";"Amudhan";"Tester" }
    val yArray = arrayOf("Ragavan", "Aaradhana", "Amudhan", "Illamaran", "Kayal")
    for (y in yArray) {
        if (y.equals("Ragavan")) println("Hero")
    }

    myLoop@ for (x in 1.rangeTo(3)) {
        for (y in 1..3) {
            if (x == 2 && y == 2)
            //break@myLoop
            //continue//@myLoop
                return

            println(" X : $x Y: $y")
        }
    } */

    /*  var interObj = Interoperability()
      interObj.Tester(interObj.goGuru())
      interObj.setUserObject()
      var userObj = interObj.getUserObject()
      println("Name: ${userObj.name}")
      println("Id: ${userObj.userId}")*/

    /*val xTxt :String = """|Ragavn
        |Ravi |Rajeevan        """.trimMargin()
    print(xTxt)
    xTxt.trimEnd()*/

    /*   val yTxt: String = ""
       try {
           print(yTxt.length)
       } catch (e: NullPointerException) {
           println("yTxt is null")
       }*/

    /*val xValue:String="20"
    val yValue=20

    if(yValue in 19..23){
        print("yValue exists")
    }*/

    /*
    //Runtime Input
    val xList = mutableListOf<String>("Te", "Re", "Ve")
    println("\nOld")
    for (xObj in xList) {
        println(xObj)
    }

    for (j in 0..xList.size - 1) {
        print("Enter the String: ")
        xList[j] = readLine()!!
    }

    println("\nNew")
    for (xObj in xList) {
        println(xObj)
    }*/

    /* val xC = "2"
     val xVal = xC.toInt()
     print(xVal)*/

    /*
    //Runtime Typed Input
    val reader = Scanner(System.`in`)

     println("Enter the floating value: ")
     val fVal = reader.next()
     println("Given value to int ${fVal.toInt()}")*/

    /*val gX = "2"
    when (gX) {
        "Tester" -> println("given text is Tester")
        2.toString() -> {
            val cValue = gX.toInt()
            println("Value is ${cValue * 2}")
        }
        else -> println("Others")
    }*/


    /*val xList = arrayOf("Te", "Re", "Ve")
    val yArray = arrayOf(1,2,3)
    println("\nOld")
    for (xObj in yArray.indices) {
        println(yArray[xObj])
        //println(xList[xObj])
    }*/

    //var kTxt = "Rajendhiran E"
    //printer(1,2,3)
    //for(i in kTxt){
    /*for(i in kTxt.indices){
        println(kTxt[i])
    }*/
    /* var inter = Interoperability()
     inter.Input(1, 32, 5.5, 2)*/

    /* var chkObj = Checker()
     println(chkObj isOdd 5)*/
    //exposeOutput(y = 20, x = "Tester")
    //print(2.valueType())
    //println(222 isGreaterThan 10)
    //println("Ragavan" toConcat " S")

    /* val cand = Candidate("Rajeevan")
     println("Candidate: Name: ${cand.cName} | YOB: ${cand.cyob}\n")

     val candidate = Candidate(cName = "Ragavan", cYOB = 2000, cId = 23142)
     println("Candidate: Name: ${candidate.cName} | YOB: ${candidate.cyob}\n")

     val can = Candidate(3432)
     println("Candidate: Name: ${can.cName} | YOB: ${can.cyob}\n")

     val ca = Candidate()
     println("Candidate: Name: ${ca.cName} | YOB: ${ca.cyob}\n")*/

    //var emp = Employee()

    //val stud = Student(1432,"Ravi varman")
    //println(stud.getDepartment())

    /*val myClass = MyClass("Karl Marx")
    myClass.test("Tester")

    val myDataClass1 = MyData(xAge = 27, xyName = "Ragavan")
    val myDataClass2 = MyData(xAge = 27, xyName = "Ragavan")
    println("Equals: ${myDataClass1.equals(myDataClass2)}")*/

    /* println("${DataObject.xvName} ${DataObject.xvYOB}")
     DataObject.xvName = "Kum"
     println("${DataObject.xvName} ${DataObject.xvYOB}")

     println("${MyObjClass.myName} ${MyObjClass.myCity}")*/
    /*var userName: String? = "Ragavan"
    println("username: ${userName?.length}")
    userName = null

    println("username: ${userName?.length ?: -1}")
    // println("username: ${userName!!.length}")*/
    /*var len: Int
    userName="Aaradhana"
    len=userName?.let {
        it.length
    }
    if (len > 0) {
        println("Len: $len")
    }*/

    /*var xValue: Int?
    var xString: String? = "Ragavan"
    xValue = xString?.length
    println("xValue: $xValue || xString: $xString")*/
    //println(DataObject.json)

    //var x = MyObjClass("x", 23)
    //MyObjClass.myName

    /*val emp = Employee(1, "Ragavan", "CTO")
    val emp1 = Employee(2, "Aaradhana", "Director")
    val emp2 = Employee(3, "Athiban")
    val emp3 = Employee("YYYY")
    println("Id: ${emp.eId}  | Name: ${emp.eName}  | Designation : ${emp.eDesignation}")
    println("Id: ${emp1.eId} | Name: ${emp1.eName} | Designation : ${emp1.eDesignation}")
    println("Id: ${emp2.eId} | Name: ${emp2.eName} | Designation : ${emp2.eDesignation}")
    println("Id: ${emp3.eId} | Name: ${emp3.eName} | Designation : ${emp3.eDesignation}")*/

    //val arrVal = intArrayOf(62, 62, 142, 124)
    //println(printValues(20, 30, *arrVal, 15, 120))

    /*val ghObj=Gh()
    ghObj.printStr("Testere")
    Gh.printstr("Testing")*/

    /*var myObj =  MyObjClass
    println(MyObjClass.myUserName);

    val myObjStud = MyObjStud()

    val myMainObj = myObjStud as MyObjClass
    println(myMainObj.userDept)*/


    /*val (fn, ln, mn) = "Ganesh Muthu swamy kumar".split(" ", limit = 3)
    println("$fn\n$ln\n$mn")

    val (x, y, z) = listOf<Any>("Ragavan", 2, 2.4f)
    println("$x\n$y\n$z")*/

    //val(r,s)=Pair("test","value")
    //print("$r, $s")

    /* var intVal = 100
     var lngVal: Long = intVal.toLong()
     var flVal: Float = intVal.toFloat()
     //println("int:$intVal | float: $flVal")

     println("${printValues(2, 41, 51, 5)}")
     println("${printValue(68)}")*/
    //val reader = Scanner(System.`in`)
    //println("Smallest Number is ${printValues(reader.nextInt(), reader.nextInt(), reader.nextInt())}")

    //println("Tester".ConCat("Tester"))

    /*val r = Tester()
    println(r.Multiply())
    println(r.Division())*/

    /*
    //nullChecker()?.let { println("$it is not null") }
    //println(nullChecker()!!)
    //println(nullChecker()?.plus(" Tester"))
    //println(nullChecker() ?: "Value is Null")
    */

    /*val checkData: String? = "Ragavan"
    val length = checkData.let { "${it?.length}" }
    println(length)*/

    /*Tester().let {
        println("Addition: ${it.add()} - Subtraction: ${it.sub()}")
    }*/

    /*val test = null //Tester()
    println(test?.Division()?:"ERR")
    //println(test!!.let { println(it.Multiply()) })  // Error when test = null
    //println(test?.let { println(it.Multiply()) } ?: "Error")*/

    /*println("Please enter two values : ")
    val x: Int? = readLine()?.toInt()
    val y: Int? = readLine()?.toInt()
    println(Tester(x!!, y!!).let {
        val add = it.add()
        val sub = it.sub()
        val mul = it.Multiply()
        val div = it.Division()
        "X Value: ${it.x}\nY Value: ${it.y}\nResult Add: $add - Sub: $sub - Mul: $mul - Div: $div"
    })*/

    /*var xName="Ragavan"
    var yName="Aaradhana"
    var result = xName.let { outer -> outer.let {inner ->
        xName=xName.plus(yName)
        println("Inner $xName")
        "Tester"
    }
        //xName = "Outer ".plus(outer)
        //xName
    }
    println(result)*/

    /*val gName:String?=null
    println(gName?.length)*/

    /*val user:String by lazy {
        println("user initialize")
        "Testing"
    }

    println("Testing lazy")
    println(user)*/

    /* var xList = ArrayList<TestDataClass>()
    // xList.add(TestDataClass("32","Tester"))
     //xList.add(TestDataClass("352","Testing"))
     val xBool = !xList.isNullOrEmpty()
     println("Data Available: $xBool")
     val xFirst = xList.firstOrNull()
     println(xFirst?.name)*/

    //println(nonReturnFunExp("Tester"))

    /*val xname = null
    println(message = "Message: ${xname?.let { it } ?: ""}")
    println(message = "Message: ${xname ?: ""}")*/

    /*val xList = ArrayList<TestDataClass>()
    xList.add(TestDataClass("4", "Tester", arrayOf("US", "US"), isDone = false, pro = 100))
    xList.add(TestDataClass("6", "Testin", arrayOf("WI", "AU"), isDone = true, pro = 100))
    xList.add(TestDataClass("3", "Test", arrayOf("UK", "PO"), isDone = false, pro = 50))
    xList.add(TestDataClass("100", "Tez", arrayOf("DUB", "PO"), isDone = true, pro = 100))
    xList.add(TestDataClass("2", "Testi", arrayOf("UK", "AU"), isDone = false, pro = 30))*/

    // 6, 100, 4, 3, 2

    /*xList.sortWith(compareByDescending<TestDataClass> { it.isDone }.thenBy { it.pro == 100 })
    //xList.sortWith(compareByDescending<TestDataClass> { it.pro == 100 }.thenBy{ it.isDone })
    xList.forEach { println(it) }*/


/*    xList.sortWith(ComparatorOne().thenBy { it.id.equals("100") })
    xList.forEach {
        println(it)
    }*/

    /*val xVa= xList.sortedBy { it.pos || it.id.equals("100") }
    xVa.forEach {
        println(it)
    }*/
    /*val xVa1= xList.sortedBy { it.pos==false}
    xVa1.forEach {
        println(it)
    }
    val xVa2= xVa1.sortedBy { it.id.equals("100")}
    xVa2.forEach {
        println(it)
    }*/

    /* val isBool:Boolean = xList.filter { attempt ->
         attempt.id.equals("33") && attempt.name.equals(
             "Tester") && attempt.state.equals(
             "TN")
     }.toList().isNotEmpty()

     val isBool1:Boolean = xList.filter { attempt ->
         attempt.id.equals("332") && attempt.name.equals(
             "Tester") && attempt.state.equals(
             "TN")
     }.toList().isNotEmpty()

     println(isBool)
     println(isBool1)*/

    /*val isUserIdCheck=xList.filter { it.id.equals("339") }.any()
    println(isUserIdCheck)*/
    //val ce = 4.55
    //println(Math.round(ce))
    //println(Math.ceil(ce))


    /*val x = xList.flatMap { it.city.subList(0,it.city.size) }
    x.forEach { println(it) }*/

    //val x = xList.flatMap { it.city.asList().subList(0, it.city.size) }.distinctBy { it }
    //x.forEach { println(it) }
    //val setsDetails = mutableSetOf<TestDataClass>()

    /*val alist = xList.toSet().toList()
    println(alist)*/

    /*val gDist=xList.distinctBy { it.id }
    println(gDist)*/


    /* val grades = mutableSetOf<TestDataClass>()
     xList.forEach { if(it.id.equals("32")){
         grades.add(it)
     } }
     println("Grade Data :${grades}")*/
    /*val listing = listOf("334","38","37")
    //val gradeData = xList.filter { it.id =="32" }.count()
    val gradeData = xList.filter { listing.contains(it.id) }.count()
    println("Grade Date : $gradeData")*/

    /*var x = 20
    run runblock@{
        listOf(1, 2, 3, 5).forEach {
            if (it == 3) {
                x = it
                return@runblock
            }
            println(it)
        }
    }
    println(x)*/

    /*val item = listOf("6","3","2")
    val items = item.sortedBy { it }
    println(items)*/

    /* val items = xList.sortedBy { it.id }
     items.forEach {
         println(it.id)
     }*/

    /*val g = ((.5553 /100) * 100)
    val percent:Int = Math.ceil(0.555 * 10.0f / 100).toInt()
    val percent1:Int = Math.ceil(0.4400010 * 100).toInt()
    println(percent1)*/

    /*val x:String?=null
    x?.run{
        println("Yes i'm not null ${this.length}")
    }*/

    /* val x: (Int, Int) -> (String) = { val1: Int, val2: Int ->
         val y = val1.plus(val2)
         "$y size is : ${y.toString().length}"
     }

     val z: (Int, Int) -> String = { val1, val2 ->
         "Nothing :-)"
     }

     testXLambda(10, x)
     testXLambda(10, z)
     testXLambda(10, ::zFun)*/

    /*val d = Date(116887)
    val formatter = SimpleDateFormat("mm:ss")
    formatter.timeZone = TimeZone.getTimeZone("UTC")
    val formatted = formatter.format(d)
    println(formatted)*/

    val xList = ArrayList<TestDataClass>()
    xList.add(TestDataClass("3", "Test", arrayOf("UK", "PO"), isDone = false, pro = 50))
    xList.add(TestDataClass("100", "Tez", arrayOf("DUB", "PO"), isDone = true, pro = 100))
    xList.add(TestDataClass("4", "Tester", arrayOf("US", "US"), isDone = false, pro = 100))
    xList.add(TestDataClass("6", "Testin", arrayOf("WI", "AU"), isDone = true, pro = 100))
    xList.add(TestDataClass("2", "Testi", arrayOf("UK", "AU"), isDone = false, pro = 30))

    // 100, 6, 4, 3, 2

    /*val qList = ArrayList<TestDataClass>()

    xList.groupBy { it.isDone }.apply {
        this[true]?.sortedByDescending { it.pro }?.let { qList.addAll(it) }
        this[false]?.sortedByDescending { it.pro }?.let { qList.addAll(it) }
    }

    qList.forEach { println(it) }*/


    /*val gList = ArrayList<TestDataClass>()
    zList.forEach { t, u ->
        gList.addAll(u.sortedByDescending { it.pro })
    }
    gList.forEach { println(it) }*/

    /*val jList = ArrayList<TestDataClass>()
    zList[true]?.sortedByDescending { it.pro }?.let { jList.addAll(it) }
    zList[false]?.sortedByDescending { it.pro }?.let { jList.addAll(it) }

    jList.forEach { println(it) }*/
    //xList.sortBy { !it.isDone }
    //xList.sortWith(ComparatorOne())
    //xList.forEach { println(it) }

    /* val x=71
     val eventVal = when (x) {
         in 71..100 -> "GamificationEvents.CHECK_EVENT_SCORED_LEVEL_ABOVE_71"
         in 31..70 -> "GamificationEvents.CHECK_EVENT_SCORED_LEVEL_ABOVE_31"
         else -> ""
     }
     println(eventVal)*/

    /* val xListing = ArrayList<String>()
     xListing.add("Tester")
     xListing.add("Testing")

     xListing.forEach {
         println(xListing.size)
         xListing.remove("Testing")
         println(xListing.size)
     }
     println(xListing.size)*/

    /*val js:String by lazy { "" }*/

    //println(getTransactionEvent(10))

    /* val hash = HashMap<String,String>()
     hash.put("Tag-124","Value1")
     hash.put("Tag-123","Value1")
     hash.put("Tagit-121","Value1")
     hash.put("Tagsit-121","Value1")
     hash.put("Test-Tag","Value1")
     hash.put("Te","Value1")
 val hased:HashMap<String,String> = hash.clone() as HashMap<String, String>
     println(hased.toString())
     val removeTxt="Tag"
     hash.forEach {
         if(it.key == "Te"){
             println("TE Available")
         }
         if(it.key.contains(removeTxt)){
             hased.remove(it.key)
         }
     }
     println(hased.toString())

     val lst= listOf<String>("Test","Tester")*/

    /*val tesClass = TestDataClass1()
    tesClass.apply {
    tesClass.name="Tester"
    tesClass.id="20"
    }

    tesClass.apply {
        tesClass.isDone=false
        tesClass.state="PY"
    }

    println(tesClass.name)
    println(tesClass.id)
    println(tesClass.isDone)
    println(tesClass.state)*/

    /* println(InternetHelper.getIPAddressV4())
     println(InternetHelper.getIPAddressV6())*/

    /*val x=2
    when(x){
        1,2->{
            println("@1")
        }
        2->{
            println("@2")
        }
    }*/
    /*println(getCurrentTimeStamp())
    println("UTC: ${getCurrentDateUTC(format = ISO_DATE_TIME_FORMAT_1)}")
    println("CET: ${getCurrentDateUTC("CET", format = ISO_DATE_TIME_FORMAT_2)}")*/

    /* val id ="4f827bebfa051bc7"
     val uuid:String = UUID.nameUUIDFromBytes(id.toByteArray()).toString()
     println(uuid)
     val uuid1:String = UUID.nameUUIDFromBytes(id.toByteArray()).toString()
     println(uuid1)
     val uuid2:String = UUID.nameUUIDFromBytes(id.toByteArray()).toString()
     println(uuid2)*/

    /* lateinit var inputCode: List<String>
     val outputCode: String by lazy {
         println("lazy initialized")
         getCurrentTimeStamp()
     }*/


    /*inputCode = "Tester"
    println(outputCode)
    println("Text $inputCode")*/

    /*  val x=listOf(1, 2, 3).fold(10) { sum, element -> sum + element }
      println(x)*/
    /*var arrStr= listOf<String>("Teste","Tester")
    var (x,y) = arrStr
    println("arrStr is $x & $y")*/
    /*println("IP Address V4 - ${IPHelper.IPV4Address}")
    println("IP Address V6 - ${IPHelper.IPV6Address}")*/


    /*var data = listOf<String>("Dev", "Prd", "Test", "Sbx", "demo")
    run envBlock@{
        data.forEach {
            if (it.equals("Prd")) {
                println("I'm Selected $it")
                return@envBlock
            }
            println("I'm in the list $it")
        }
    }
    println("Done")*/

    /* var username: String? = null
     val status: String? = username?.let {
         println("Username is $it")
         if (it.length > 10) "Valid Input" else "Invalid length"
     }.run {
         "Need Input"
     }
     println(status)*/
    /*println("Username Length is : ${username?.length}")   // We won't get crash, it just print the value as null
    username = "manakular"
    println("Username Length is : ${username?.length}")
*/
    /* var username: String? =null
     val length: Int = username!!.length ?: 0
     println("Length is $length")*/

    /*   val property = Singleton.property1
       val info = Singleton.info
       println("$property - $info")*/


  /*  val diaLab = listOf(
        Diagnosis("H1", "SH1"), Diagnosis("H1", "SH2"), Diagnosis("H2", "SH1"), Diagnosis("H2", "SH2")
    )
    val dataGroup = groupByParentName(diaLab)
    dataGroup.forEach {
        println("Parent: ${it.key}")
        println("Items: \n${it.value listToStrWithSeparator "\n"}")
    }
    test(diaLab, ::output, groupByParentName)*/
}

inline fun test(
    data: List<Diagnosis>,
    output: (Map<String, List<String>>) -> Unit,
    gByName: (List<Diagnosis>) -> Map<String, List<String>>
) = output(gByName(data))

data class Diagnosis(val heading: String, val subHeading: String)

val groupByParentName by lazy { { digLab: List<Diagnosis> -> digLab.groupBy({ it.heading }, { it.subHeading }) } }

fun groupByParent(digLab: List<Diagnosis>) = digLab.groupBy({ it.heading }, { it.subHeading })

infix fun List<String>.listToStrWithSeparator(separator: String) = this.joinToString(separator)

fun output(out: Map<String, List<String>>) {
    out.forEach {
        println("${it.key} || ${it.value.listToStrWithSeparator("-")}")
    }
}


/*var data = listOf<String>("Dev", "Prd", "Test", "Sbx")
//run envBlock@{
data.forEach {
    if (it.equals("Prd")) {
        println("I'm Selected $it")
        return@forEach
    }
    println("I'm in the list $it")
}
// }
println("Done")*/

fun getCurrentTimeStamp() =
    SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(Calendar.getInstance().time)

const val ISO_DATE_TIME_FORMAT_1 = "yyyy-MM-dd'T'HH:mm:ss'Z'"
const val ISO_DATE_TIME_FORMAT_2 = "YYYY-MM-DD'T'hh:mm:ss'TZD'"

fun getCurrentDateUTC(
    timeZoneValue: String = "UTC",
    format: String = ISO_DATE_TIME_FORMAT_1,
    locale: Locale = Locale.US
): String? {
    var result: String? = null
    try {
        val mISODateTimeFormatted: DateFormat =
            SimpleDateFormat(format, locale)
        mISODateTimeFormatted.timeZone = TimeZone.getTimeZone(timeZoneValue)
        result = mISODateTimeFormatted.format(Date())
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return result
}

/*const val CHALLENGES_QUESTION_CORRECT_0_5_EVENT_TYPE = "challenge_question_correct_0_5"
const val CHALLENGES_QUESTION_CORRECT_5_10_EVENT_TYPE = "challenge_question_correct_5_10"
const val CHALLENGES_QUESTION_CORRECT_10_15_EVENT_TYPE = "challenge_question_correct_10_15"

private fun getTransactionEvent(progressTime: Int): String = when (progressTime) {
    in 0..5 -> CHALLENGES_QUESTION_CORRECT_0_5_EVENT_TYPE
    in 5..10 -> CHALLENGES_QUESTION_CORRECT_5_10_EVENT_TYPE
    else -> CHALLENGES_QUESTION_CORRECT_10_15_EVENT_TYPE
}*/

class ComparatorOne : Comparator<TestDataClass> {
    override fun compare(o1: TestDataClass?, o2: TestDataClass?): Int {
        if (o1 == null || o2 == null) {
            return 0
        }
        //val l=o2.isDone>o1.isDone
        var l = o2.pro.compareTo(o1.pro)
        /*if(l==-1){
           if(o2.pro==100) {
               l=1
           }
        }*/
        /*val x = o2.isDone.compareTo(o1.isDone)
        val g: Int =
            if (x == 0) {
                x
            } else if (x == -1) {
                if (o2.pro == 100) {
                    1
                } else {
                    -1
                }
            } else {
                1
            }*/

        return l //o2.isDone.compareTo(o1.isDone)
    }
}

fun zFun(h: Int, u: Int) = "Nothing :-("

fun testXLambda(y: Int, paramLam: (Int, Int) -> String) {
    println(paramLam(y, y))
}

fun testXLambda1(y: Int, paramLam: (Int, Int) -> String) = paramLam(y, y)


data class TestDataClass(
    val id: String,
    val name: String,
    val city: Array<String>,
    val state: String = "TN",
    val isDone: Boolean = false,
    val pro: Int = 100
) {

}

class TestDataClass1() {
    var id: String = ""
    var name: String = ""
    var state: String = "TN"
    var isDone: Boolean = false
    var pro: Int = 100
}

fun nonReturnFunExp(x: String) = nullChecker()


fun nullChecker(): String? = "Test" // null


fun Tester.Division() = x.div(y)

fun printValue(x: Int) =
    if (x % 2 == 0)
        1
    else
        0

fun printValues(vararg a: Int) = a.reduce { x, e -> if (x < e) x else e }

fun print1(txt: String) {
    println("Given Txt: $txt")
}

fun printer(vararg x: Any) {
    var g: Any = x.get(2)
    when (g) {
        is Int -> print(" ${x.get(2)} is Int")
        is Double -> print("${x.get(2)} is double")
        else -> print("Others")
    }
}

@JvmOverloads
fun exposeOutput(x: String, y: Int, z: Double = 1.0) {
    println("{x=$x ||y=$y ||z=$z}")
}

fun Int.valueType() = if (this > 0) "Positive" else if (this < 0) "Negative" else "Zero"

infix fun Int.isGreaterThan(x: Int) = this > x

infix fun String.toConcat(x: String): String {
    return "$this $x"
}

class Gh {
    fun printStr(x: String) {
        println(x)
    }

    companion object GhDep {
        fun printstr(x: String) {
            println(x)
        }
    }
}

