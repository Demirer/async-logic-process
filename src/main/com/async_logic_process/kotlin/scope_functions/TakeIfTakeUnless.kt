package scope_functions

fun main(){
    val main = arrayListOf<Int>()
    for(i in 1..10){
        val inputNumber = readLine()?:""
        inputNumber.toInt().takeIf { it % 2 == 1 }.takeUnless { it == 3 || it == 13}?.let { main.add(it) }
    }

    println(main)
}