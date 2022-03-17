/**
    Numbers and Variable Types implementation practices.
 */
const val SEPARATOR = "----------------------------------------------"

fun main() {
    multiplyByPi()
    println(SEPARATOR)
    implicitAndExplicitValues()
    println(SEPARATOR)
    dataConversion()
    println(SEPARATOR)
    detectVariableTypeClass()
    println(SEPARATOR)
    doubleMultiply()
}
fun multiplyByPi(){
    val pi= 3.14
    println("Please enter an number:")
    val userInput = readLine()?:"0"
    println("Input multiplied by pi : ${pi*userInput.toDouble()}")
}
fun dataConversion(){

    println("Please enter an number :")
    val userInput = readLine()?:"-1"
    val byte:Byte = userInput.toByte() //If input larger than 128 it will be throw expection
    val short:Short = userInput.toShort() // If input larger than 32468 it will be throw expection
    val integer:Int = userInput.toInt()
    val long:Long = userInput.toLong()

    val float:Float = userInput.toFloat()
    val double:Double = userInput.toDouble()

    val string:String = userInput.toString()

    println("${byte::class.java}")
    println("${short::class.java}")
    println("${integer::class.java}")
    println("${long::class.java}")
    println("${float::class.java}")
    println("${double::class.java}")
    println("${string::class.java}")

    val pi = 3.941231411131
    val intPi = pi.toInt() // Always take integer part of float/double.
    val stringPi = pi.toString()
    println("Value : $pi Class: ${intPi::class.java}")
    println("Value : $intPi Class: ${intPi::class.java}")
    println("Value $stringPi Class: ${stringPi::class.java}")
}

fun implicitAndExplicitValues(){
    val implicitDefinition = 3 //implicit definition, Kotlin will assign automatically Class Integer
    val explicitByteDefinition:Byte = 3  //explicit definition, Kotlin will assign given explicit type to variable
    val explicitShortDefinition:Short =3 //explicit definition, Kotlin will assign given explicit type to variable
    val explicitIntegerDefinition:Int =3 //explicit definition, Kotlin will assign given explicit type to variable
    val explicitLongDefinition:Long =3 //explicit definition, Kotlin will assign given explicit type to variable. explicitLongDefinition = 3L is also define val as LONG
    val explicitFloatDefinition = 3.0F //explicit definition, Kotlin will assign given explicit type to variable. explicitFloatDefinition = 3.0F is also define float.
    val explicitDoubleDefinition:Double =3.0 //explicit definition, Kotlin will assign given explicit type to variable
    println("Value $implicitDefinition Class: ${implicitDefinition::class.java}")
    println("Value $explicitByteDefinition Class: ${explicitByteDefinition::class.java}")
    println("Value $explicitShortDefinition Class: ${explicitShortDefinition::class.java}")
    println("Value $explicitIntegerDefinition Class: ${explicitIntegerDefinition::class.java}")
    println("Value $explicitLongDefinition Class: ${explicitLongDefinition::class.java}")
    println("Value $explicitFloatDefinition Class: ${explicitFloatDefinition::class.java}")
    println("Value $explicitDoubleDefinition Class: ${explicitDoubleDefinition::class.java}")
}

fun doubleMultiply(){
    println("Enter a number :")
    val input = readLine()?:""
    val multiplierDouble = 12.83
    println("Multiplied with $multiplierDouble = ${multiplierDouble*input.toInt()} Class : ${(multiplierDouble*input.toInt())::class.java}")
}

fun detectVariableTypeClass(){
    val integer = 100
    val long = 1000000000000000
    val double = 1232.1232
    println("Value : $integer Class : ${integer::class.java}")
    println("Value : $long Class : ${long::class.java}")
    println("Value : $double Class ${double::class.java}")
}