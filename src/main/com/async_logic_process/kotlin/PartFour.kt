/**
 * Operators and booleans implementation practices.
 *
 */
const val GLOBAL_INFO = "Global String!"

fun main(){
    increment()
    implicitResultType()
    referenceGlobalValForFormNew()
    augmentedAssignmentOperators()
    multiplicationMistake()
    interestRateCalculator()
    booleanFundApplyWithConstraints()
}
fun booleanFundApplyWithConstraints(){
    val bull = 2
    val cow = 1
    val family = 4
    val canApplyFund = ((cow+bull<=5) && (cow>=1)) || (family>=3)
    println(canApplyFund)
}

fun interestRateCalculator(){
    println("Enter the deposit amount")
    val userDepositInput = readLine()?:"0"
    val userDeposit = userDepositInput.toDouble()
    println("Enter the year amount you want to deposit your money")
    val yearInput = readLine()?:"0"
    val year = yearInput.toInt()
    val interestRate = 105.5/100
    println("Total money after $year years is ${userDeposit*year*interestRate}")
}
fun multiplicationMistake(){
    val base =30
    val divider = 1/3
    println(base*divider) // Will result zero because as default 1/3 integer val will be 0

    val trueDivider = 1F/3
    println(base*trueDivider) //10 will be true result !

}
fun augmentedAssignmentOperators(){
    var numberOfPeople = 10
    numberOfPeople +=4
    println(numberOfPeople)
}

fun referenceGlobalValForFormNew(){
    val composite = "This is reference val of $GLOBAL_INFO"
    println(composite)
}

fun implicitResultType(){
    //Byte<Short<Int<Long<Float<Double
    //result class implicitly assigned to bigger class type automatically by Kotlin
    val longNumber:Long = 1
    val floatNumber:Double = 3.14
    val result = longNumber*floatNumber
    println(result::class.java) //Double
}

fun increment(){
    var catNumber = 1
    println("I have ${catNumber++} cats !") //Print 1
    println("I have now $catNumber cats !") //Print 2
    // It is very important that Kotlin makes incremention in template after use that variable in println() if incrementor right side. "++catNumber" will print 2-2
}