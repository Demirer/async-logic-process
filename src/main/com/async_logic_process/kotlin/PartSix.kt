import java.lang.Exception

/**
 * Handling exceptions implementation practices.
 *
 */

fun main(){
    simpleExceptionHandling()
    finallyBlock()
    multiplierWithExceptionHandler()
    priceCalculator()
}

fun priceCalculator(){
    val price = 9.99
    println("Enter name of product : ")
    val productNameInput = readLine()
    println("Enter amount you want to buy")
    val inputAmount = readLine()
    try {
        print("$productNameInput with number $inputAmount costs : ${inputAmount?.toInt()?.times(price)}")
    }catch (e:Exception){
        throw IllegalStateException("Your input amount must be integer")
    }finally {
        println("Transaction completed")
    }
}

fun simpleExceptionHandling(){
    try {
        val userInput = readLine()
        val exceptionConversion = userInput?.toInt()
    }catch (e:Exception){
        println("Exception occured, stacktrace \n${e.localizedMessage}") //Print & Log localized message
        throw IllegalStateException("You have to give integer input for this method")
    }
}

fun finallyBlock(){
    try {
        val userInput = readLine()
        val exceptionConversion = userInput?.toInt()
    }catch (e:Exception){
        print("Exception occured meesage : ${e.localizedMessage}")
        e.printStackTrace() // You can print stacktrace aswell
    }finally {
        println("Execution of process completed")
    }
}

fun multiplierWithExceptionHandler(){
    var result:Int? = null
    try {
        println("Please enter a number for multiply with 5")
        val userInput = readLine()?.toInt()
        result = userInput?.times(5)
    }catch (e:Exception){
        throw IllegalStateException("You must Enter an input number")
    }finally {
        println("Result is $result")
    }
}