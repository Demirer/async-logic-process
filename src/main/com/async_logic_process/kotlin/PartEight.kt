/**
 * Implementation of flow controls section.
 *
 */

fun main(){
    canCustomerMakePurchase()
    hourConverter()
    shortIfUsage()
    purchase()
    multibranchValueStatemenr()
    grading()
    ageMessage()
    whenCondition() //Is like switch case in Java
    anotherWhenCondition() //another usage
    months()
    nameLength()
    nameSeparation()
    basicForLoop()
    anotherFor()
    hashMapFor()
    leapYear()
    forLoopReverseCount()
    reverseForLoopWithStep()
    userInputMatrix()
    simpleWhile()
    divisibility()
    userNameChoose()
    breakAndContinue()
    labelUsage()
    ageFilter()
}

fun ageFilter(){
    while(true){
        println("please enter your name")
        val name = readLine()?:""
        println("Please enter your age")
        val userInput = readLine()?:"0"
        val age = userInput.toInt()
        if(age>=21){
            println("Welcome $name")
            continue
        }else{
            println("Your age needs to be 21")
            break
        }
    }
}

fun labelUsage(){
    loop@ for(i in 1..10){
        for (j in 1..10){
            if(i == 5 && j==5){
                break@loop // this will break the upper labeled loop so directly ends both loop
            }
        }
    }
}

fun breakAndContinue(){
    val listOfNumbers = listOf(2,4,6,7,8,10)
    for (number in listOfNumbers){
        if(number % 2 != 0) break //break the loop if condition met
        println("$number is even")
    }

    for (number in listOfNumbers){
        if(number % 2 != 0) continue //resets the loop if you meet condition
        println("$number is even")
    }
}

fun userNameChoose(){
    val userNames = arrayListOf("Bob","Kate","Jim")
    var isRecorded = false
    do{
        println("Please enter an username you want to take")
        val userInput = readLine()?:""
        if(!userNames.contains(userInput)){
            userNames.add(userInput)
            println("User name $userInput successfully recorded ")
            isRecorded = true
        }
    } while(!isRecorded)

}

fun divisibility(){
    println("Please enter a number")
    val readNumber = readLine()?:"0"
    val input = readNumber.toInt()
    var counter = 0
    while(counter<input){
        if(counter % 7 == 0){
            println("$counter is divisible by 7")
        }
        counter++
    }
}

fun simpleWhile(){
    val totalPieces = 20
    var piecesPlaced = 0
    while(totalPieces>=piecesPlaced){
        piecesPlaced++
    }


    //Do while form
    do{
        piecesPlaced++
    }while (totalPieces>=piecesPlaced)
}

fun userInputMatrix(){
    println("Please enter size of the square matrix")
    val userInput = readLine()?:"0"
    val size = userInput.toInt()
    for(i in 1..size){
        for (j in 1..size){
            when(i*j % 3){
                0 -> print("0\t")
                1 -> print("1\t")
                2 -> print("2\t")
            }

        }
        println()
    }
}

fun reverseForLoopWithStep(){
    for(i in 10 downTo 0 step 3){//enters loop every 4 time 10 7 4 1
        println(i)
    }
}

fun forLoopReverseCount(){
    for (i in 10 downTo 0){
        println(i)
    }
}

fun leapYear(){
    println("Enter the year please")
    val userInput = readLine()?:""
    val year = userInput.toInt()
    val leapYear = year%4==0
    for (i in 1..12){
        val day = when(i){
            1 -> 30
            2 -> if(leapYear) 29 else 28
            3 -> 31
            4-> 30
            else -> 999
        }
        println(day)
    }
}

fun hashMapFor(){
    val hashmap = hashMapOf(Pair(1,"Jim"),Pair(2,"Alis"))
    for (key in hashmap.keys){
        println(hashmap[key])
    }
}

fun anotherFor(){
    for (i in 1..12){
        val number = when(i){
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            9 -> "nine"
            10-> "ten"
            else -> "another"
        }
        println(number)
    }
}

fun basicForLoop(){
    val animals = listOf("Dog","Cat","Bear")
    for(animal in animals){ // animal:String can be used also
        println("Animal name $animal")
    }
}

/**
 * when is like a switch case in a Java
 */

fun nameSeparation(){
    println(" Please enter your name")
    val userInput = readLine()?:""
    val message = when(userInput[0].lowercase()){
        in "a","b","c" -> "HELLO FIRST THREE"
        in "d".."f" -> "HELLO SECOND THREE" // Range cab be used for string and chars as well
        else -> "HELLO ANOTHER THAN FIRST OR SECOND THREE"
    }
    println(message)
}

fun nameLength(){
    val name = "jamien"
    when(val len = name.length){
         in 1..3 -> println("Short name length $len")
         in 4..6 -> println("Medium name length $len")
         else -> println("name very long length $len")

    }

    println(SEPARATOR)
}

fun months(){
    val month = "January"
    val days = when(month) {
        "January","March", "May" -> 31
        "February" -> 28
        else -> 30
    }
    println(days)

    println(SEPARATOR)
}

fun anotherWhenCondition(){
    val number  = 2345
    val result = when(number%2){
        0 ->  "number is even"
        1 ->  "number is odd"
        else -> "google it"
    }
    println(result)

    println(SEPARATOR)
}

fun whenCondition(){
    val pet = "dog"
    var requiredAction = ""
    when(pet){
        "cat" -> {
            requiredAction = "love it"
        }
        "dog" -> {
            requiredAction = "feed it"
        }
        else -> {
            requiredAction = "google it"
        }
    }
    println("Required action for animal $pet is $requiredAction")

    println(SEPARATOR)
}

fun ageMessage(){
    println("Please enter age")
    val ageInput = readLine()?:"1"
    val userAge = ageInput.toInt()
    val message = if(userAge<0){
        "Your age cannot be negative integer"
    }else if(userAge in 1..18){
        "You are young"
    }else if(userAge in 19..40){
        "You are at mibble ages"
    }else{
        "You are old"
    }
    println(message)

    println(SEPARATOR)
}

fun grading(){
    println("Please enter student grade")
    val userInput = readLine()?:"0"
    val grade = userInput.toInt()
    val mark = if(grade>100 || grade<0){
        "You must enter between 0-100"
    }else if(grade in 90..100){
        "A"
    }else if(grade in 80..89){
        "B"
    }else if(grade in 70..79){
        "C"
    }else if(grade in 60..69){
        "D"
    }else if(grade in 50..59){
        "E"
    }else{
        "F"
    }

    println(mark)

    println(SEPARATOR)
}

fun multibranchValueStatemenr(){
    println("Please enter animal")
    val input = readLine()?:"cat"
    val action = if(input == "dog"){
        println("Pet it")
    }else if(input == "cat"){
        "give fish"
    }else{
        "google it"
    }

    println("Animal $input do $action")

    println(SEPARATOR)
}

fun shortIfUsage() {
    val number = 2
    val result = if(number % 2== 0) "Number is Even" else "Number is Odd"
    println(result)
}

fun purchase(){
    var totalPurchasePrice= 0
    val hasEggs = true
    val hasBacon = false
    if(hasEggs){
        totalPurchasePrice += 5*12
        if(hasBacon){
            totalPurchasePrice += 2*20
        }else{
            println("Total purchase price is $totalPurchasePrice")
        }
    }
    println(SEPARATOR)
}

fun hourConverter(){
    println("Please enter hour you want to convert in 24H format")
    val userInput = readLine()?:"0"
    val hour = userInput.toInt()
    if(hour < 12){
        println(" It is $hour AM")
    }else{
        if(hour==12){
            println("It is $hour PM")
        }else{
            println("It is ${hour -12} PM")
        }
    }
    println(SEPARATOR)
}

fun canCustomerMakePurchase(){
    val price = 50
    var totalPurchasedProducts = 0
    println("Enter the funds")
    val fundInput = readLine()?:"0"
    var clientFunds = fundInput.toInt()

    if(clientFunds>=price){
        totalPurchasedProducts ++
        clientFunds -= price
        println("Client make purchase now client has $totalPurchasedProducts products AND total remaining fund = $clientFunds")
    }else{
        println("Insufficient funds")
    }
    println(SEPARATOR)
}