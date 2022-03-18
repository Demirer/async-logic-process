/**
 * Nullability implementation practices.
 *
 */

fun main(){
    nullable()
    nullableOperator()
    nullableArithmaticOperators()
    nullableStringMethods()
    elvisOperator()
    nonNullAssertionOperator()
    elvisAndAssertionOperator()
}


fun elvisAndAssertionOperator(){
    val cost:Double? = 29.99
    val userInput = readLine()
    val totalPurchase = userInput?.toInt()?:3 // We are first using nullable operator then giving default value to variable with elvis operator
    println("Total cost of purchase is ${cost!!.times(totalPurchase)}")
}

fun nonNullAssertionOperator(){
    var name:String? = null
    name ="New Name"
    println(name!!.length) //We are using non-null assertion for guarantee that value will be not null

    val nameTwo:String? = null
    //10println(nameTwo!!.length) // WILL THROW AN NULL POINTER EXCEPTION because we gurantee that nameTwo non-null but it is given null
}

fun elvisOperator(){
    val catName:String? = null
    println(catName?:"This cat has no name") //Will print default because elvis operator knows value is null
    println(catName?:"This cat has no name".length) // No need to use null safe operator (?.length) because we know that elvis operator will provide default string

    val catTwoName:String? = "Fluffy"
    println(catTwoName?:"This cat has no name") //Will print "Fluffy" because variable is NOT NULL and will print default value
}

fun nullableStringMethods(){
    val name:String? = "ThisIsMyString"
    println(name?.substring(2,14))

    val userInput = readLine() //No elvis operator (?:"") so it can be null. We have to call it null safe
    val double = userInput?.toDouble()
    println("Length of input ${double?.times(7)} is ${(double?.times(7))?.toString()?.length}")
}

fun nullableArithmaticOperators(){
    val numberOne = 10
    val numberTwo:Int? = 5

    println(numberTwo?.plus(numberOne)) // If numberTwo is null will print null.
    println(numberTwo?.minus(numberOne)) // If numberTwo is null will print null.
    println(numberTwo?.div(numberOne)) // If numberTwo is null will print null.
    println(numberTwo?.times(numberOne)) // If numberTwo is null will print null.
    println(numberTwo?.rem(numberOne)) // If numberTwo is null will print null.

    //println(numberOne?.plus(numberTwo)) Will not compile because type-mismatch numberOne is not nullable variable
}

fun nullable(){
    val nameOne:String = "James" // this cant be null because Kotlin will not allow. It don't have "?" operator
    var nameTwo:String? = null // This can be null because has "?" operator
    nameTwo = "New Name !"
}

fun nullableOperator(){
    val name:String = "Name"
    val nullName:String? = null
    val nullableFilledName:String = "Awesome name"

    name.length // return default length because "name" is not nullable.
    nullName?.length // Will return null "?." operator says that, If string not null return length else return null so WE PREVENT GETTING NULLPOINTER EXPECTION !
    nullableFilledName?.length //Will return default length because nullable string has value. If it was null it will return null as length aswell
    println(name.length)
    println(nullName?.length?.toString())
    println(nullableFilledName?.length?.toString())
}