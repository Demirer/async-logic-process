package extension_functions

fun main(){
    val list = arrayListOf<String>("Bob","Jim","Thomas")
    println(list.getNumberOfElements())
    println(Double.getClassOfDouble())
}

fun ArrayList<String>.getNumberOfElements() = "There are $size elements in list "


/**
 * We can only extend companion object if it is exist in class
 */

fun Double.Companion.getClassOfDouble() = "This is ${Double::class.java} class  "
