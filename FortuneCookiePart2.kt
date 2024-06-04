
fun main(args : Array<String>){
    println("Your fortune is: ${getFortuneCookie(getBirthday())}")
}

fun getFortuneCookie(birthday : Int) : String{
    val fortunes = listOf("You will have a great day!"
    , "Things will go well for you today."
    , "Enjoy a wonderful day of success."
    , "Be humble and all will turn out well."
    , "Today is a good day for exercising restraint."
    , "Take it easy and enjoy life!")


    return when (birthday){
        in 1..5 -> fortunes[0]
        in 6..10 -> fortunes[1]
        in 11..15 -> fortunes[2]
        in 16..20 -> fortunes[3]
        in 21..25 -> fortunes[4]
        in 26..30 -> fortunes[5]
        else -> fortunes[(birthday.div(fortunes.size))]
    }
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    val birthday : Int? = readlnOrNull()?.toIntOrNull() ?: 1

    return birthday!!
}