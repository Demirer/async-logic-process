package lazy_init


fun main(){
    val newUserClass by lazy { NewUser() }
    val banList = listOf("Bob","James","Jim")
    val readInput = readLine()?:""
    if(readInput !in banList){
        newUserClass.printHello(readInput)
    }
}

class NewUser{
    fun printHello(name:String){
        println("HELLO $name")
    }
}