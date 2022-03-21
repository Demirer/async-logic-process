/**
 * Functions section implementation.
 */

fun main(){
    /*val names = arrayListOf("James","Bill","Flynn")
    val lambdaFunction :(String) -> Unit = {name:String -> println("Hello $name")}
    higherOrderFunction(names,lambdaFunction) // First usage
    higherOrderFunction(names) {name:String -> println("Hello $name")} //Second usage

    println(personalizedMessageHigherOrderFunctions(arrayListOf("Ogi","Bob","Tim")) { name:String -> "Hello $name" })

    commonHigherOrderFunctions()*/

    val list = arrayListOf(1,60,101,4,7,8,3)
    println(multiTransactionMathematics(list))
}

fun multiTransactionMathematics(list: ArrayList<Int>): List<Int> {
    return list.map { if (it % 2 == 1){it * 2 }
                else{ it / 2 }}.filter { it>25 }.toList()


}

fun commonHigherOrderFunctions(){
    val clients = arrayListOf("James","Aob","Ban","Cal","Ai")
    clients.forEach{println("Hello $it")} //For each usage

    clients.filter { it.length >5 }.forEach{ println("Hello $it") } //Will print Hello James used with filter

    val sizes :List<Int> = clients.map { it.length } //Maps lengths to list
    println(sizes)

    val sorted:List<String> = clients.sortedBy { it } //Sort list accourding to first element of each string
    println(sorted)

    val maxLengthString:String? = clients.maxByOrNull { it.length } // Will return string which has max length on list
    println(maxLengthString)

    val minLengthString:String? = clients.minByOrNull{ it.length } // Will return string which has min length on list
    println(minLengthString)
}

fun personalizedMessageHigherOrderFunctions(names:ArrayList<String>, personalizedMsg: (String)->String):ArrayList<String>{
    val result = arrayListOf<String>()
    for(name in names){
        result.add(personalizedMsg(name))
    }
    return result
}

fun higherOrderFunction(names:ArrayList<String>, doSomething: (String) -> Unit){
    for(name in names){
       doSomething(name)
    }
}