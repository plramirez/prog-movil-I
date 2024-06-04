import java.util.Random

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    //println("${if (args[1].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")

    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eats $food")
}

fun randomDay() : String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}