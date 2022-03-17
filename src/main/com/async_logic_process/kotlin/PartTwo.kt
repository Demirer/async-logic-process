import kotlin.random.Random

/**
 * User Input implementation practices.
 */

fun main() {
    ageCalculator()
    getUserInputFromTerminal()
    personalGreeting()
    randomNumberGenerator()
}

fun getUserInputFromTerminal(){
    println("Please enter a number :")
    val userInput = readLine()?:"" // ?:"" is null safe usage, basically if input null, we create "" empty string as input for null safe code.
    val result = userInput.toInt()*5
    println("$userInput * 5 = $result")
}

fun personalGreeting(){
    println("What is your name : ")
    val userName = readLine()
    println("Hello : $userName")
}

fun ageCalculator(){
    println("What year you birth ?")
    val userBirthYear = readLine()?:""
    val age = 2022 - userBirthYear.toInt()
    println("Your age is either ${age-1} if your Bday not passed OR $age")
}

fun randomNumberGenerator(){
    println(Random.nextInt()) // Will generate random number.
    println(Random.nextInt(10)) // Will generate number between 0-9, Up to upper bound limit. Upper bound NOT included (10 in this case)
    println(Random.nextInt(10,20)) // Will generate number between 10-19,Lower bound included. Upper bound NOT included (20 in this case)
    println(Random.nextDouble(100.0)) // Will generate double with regarding Random rules.
}