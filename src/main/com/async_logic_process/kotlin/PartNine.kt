/**
 * Functions section implementation.
 */

fun main(){

    for(i in 1..3) greeting()
    calculateSquare(3)
    calculateSquare(3,"New entered message")

    val set = setOf("Ogi","Jon")
    val list =  listOf("Ogi","Jon")
    helloToAll(set) //collection may accept set as well in same implementation Kotlin
    helloToAll(list) //collection may accept list as well in same implementation Kotlin

    val sumOfIntegers = simpleSumWithReturnType(2,5)
    val sumOfIntegersSimplified = simpleSumWithReturnTypSimplified(6,9)
    println(sumOfIntegers)
    println(sumOfIntegersSimplified)

    println(estimatedLifeSpan("dog"))
    taxCalculatorSingleElement("Shoe",10.0)
    taxCalculatorSingleElement(mapOf(Pair("Shoe",10.0),Pair("Pants",30.0)))

    varargExample("Jim","Ogi","Fiona","Beatrix","James")
    varargHello(3,"Jim","Ogi","Farah")

    localFunctionExample()
}

fun localFunctionExample(){
    fun greetingLocalFun(name:String) = println("Hello $name")
    println("Please enter your name")
    val control = false
    while(!control){
        val userInput = readLine()?:""
        if (userInput == "") break
        else greetingLocalFun(userInput)
    }
}

fun varargHello(count:Int,vararg customers:String){
    for (customer in customers){
        for (i in 1..count){
            println("Hello $customer")
        }
    }
}

fun varargExample(vararg names:String){
    for (name in names){
        println("Hello $name")
    }
}

fun taxCalculatorSingleElement(product:String,price:Double?){//we used because we assume this extracted from map and can be null
    val newPrice = price?.times(1.2)
    println("$product costs $newPrice after tax")
}

fun taxCalculatorSingleElement(products:Map<String,Double>){
    for(product in products){
        val newPrice = product.value * 1.2
        println("${product.key}'s new price is $newPrice ")
    }
}

fun estimatedLifeSpan(animal:String,someParamOther:String):Int{
    println("OVERLOADING FUNCTION")
    return -1
}

fun estimatedLifeSpan(animal:String):Int{
    val lifespan = when(animal){
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }
    return lifespan
}

fun simpleSumWithReturnType(numberOne:Int,numberTwo:Int):Int{
    return numberOne+numberTwo
}

fun simpleSumWithReturnTypSimplified(numberOne:Int,numberTwo:Int) = numberOne+numberTwo

fun calculateSquare(number:Int, message:String = "This is default"){
    println("Message is : $message square is :${number*number}")
}

fun helloToAll(people : Collection<String>){
    for(person in people){
        println("Hello $person")
    }
}

fun greeting(){
    println("Please enter your name")
    val inputName = readLine()?:""
    println("Please enter favorite food")
    val favfood = readLine()?:""
    println("Hello $inputName your favorite food $favfood ready")
}