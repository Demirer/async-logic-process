/**
 * Variables and Strings implementation practices.
 */

const val SHOP_NAME = "Best Shop"

fun main(args: Array<String>) {
    stringOperations()
    calculateTotal()
}

fun calculateTotal(){
    val customer = "James"
    val productPrice = 30
    val purchasedAmount = 3
    println("Customer $customer must pay total ${productPrice*purchasedAmount} for shopping in $SHOP_NAME !")
}


fun stringOperations(){
    val cityName = "    casa blan ca "
    val nameLength = cityName.length // Standard String length function.
    val capitalizeCityName = cityName.replaceFirst("c","C") //Replace first char occurrence with given parameter.
    val trimmedCityName = cityName.trim(' ') //Trim only remove whitespaces at the beginning and the end // .
    val getIndex = cityName[10] // Assign Index 25 which is "n". Alternatively "cityName.get(25)" can be used but not recommended.
    val substringFromIndexToEnd = cityName.substring(10) // Substring from index to end.
    val substringFromIndexWithTwoParameters = cityName.substring(10,13) // Substring index with start and end index.
    val removeStringPrefix = cityName.lastIndexOf("c") // Return the last element index of found variable input.
    println("Name length of city name is: $nameLength")
    println(capitalizeCityName)
    println(trimmedCityName)
    println(getIndex)
    println(substringFromIndexToEnd)
    println(substringFromIndexWithTwoParameters)
    println(removeStringPrefix)
    println("I have ${(2+2)*3} cats in total") //Usage of templates in String.
}