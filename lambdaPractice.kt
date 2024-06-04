import java.util.*

fun main(){
    //Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
    var rollDice = { Random().nextInt(12) + 1}

    //Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
    var rollDices = { sides: Int ->
        Random().nextInt(sides) + 1
    }

    //If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
    val rollDice0 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    //Create a new variable, rollDice2, for this same lambda using the function type notation.
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }


    //Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time gamePlay() is called.
    gamePlay(rollDice2(4))
    fun gamePlay(diceRoll: Int){
        // do something with the dice roll
        println(diceRoll)
    }
}

//Create a function gamePlay() that takes a roll of the dice as an argument and prints it out.
fun gamePlay(diceRoll: Int){
    // do something with the dice roll
    println(diceRoll)
}