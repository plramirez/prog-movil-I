fun main() {
    println(whatShouldIDoToday("happy", "sunny"))
}

fun whatShouldIDoToday(mood : String, weather : String, temperature : Int = 24) : String{
    var shouldDo : String = ""
    when{
        mood == "happy" && weather == "sunny" -> shouldDo = "Go for a walk"
        mood == "energetic" && weather == "sunny" -> shouldDo = "Go to gym"
        mood == "sick" && weather == "rainy" -> shouldDo = "Stay home and rest"
        else -> shouldDo = "Stay home and read."
    }
    return shouldDo
}