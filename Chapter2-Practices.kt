
// CHAPTER 2 : KOTLIN BASICS  -  PEDRO RAMIREZ

fun main() {

    //Practice Time: Basic Operations
    val startFish : Int = 2
    val firstOffspring : Int = 71
    val secondOffspring : Int = 233
    val fishSwallowed : Int = 13

    println(startFish.plus(firstOffspring).plus(secondOffspring).minus(fishSwallowed).div(30))

    //Practice Time: Variables
    var rainbowColor : String = "blue"
    rainbowColor = "red"

    val blackColor : String = "black"
    blackColor = "gray"

    //Practice Time: Nullability
    rainbowColor = null
    var greenColor : String? = null
    var blueColor = null


    //Practice Time: Nullability/Lists
    listOf(null,null)
    [null, null]
    var list: List, = listOf(null, null)
    var list2:List,? = null

    //Practice Time: Null Checks
    val nullTest : Int? = null
    println(nullTest?.inc() ?:0)


    //Practice Time: Strings 1
    val trout : String = "Trout"
    val haddock : String = "Haddock"
    val snapper : String = "Snapper"

    println("I don't like any type of $trout, $haddock or $snapper fishes.")

    //Practice Time: Strings 2
    val fishName : String = "Roberto"
    when(fishName.length){
        0 -> println("Put a name to your fish.")
        in 3..12 -> println("Good Fish Name.")
        else -> println("OK Fish Name.")
    }

    //Practice Time: Arrays and Loops
    val numbers = intArrayOf(11, 12, 13, 14,15)
    val myList = mutableListOf("")

    for (i in numbers) println("${i.toString()},")
}