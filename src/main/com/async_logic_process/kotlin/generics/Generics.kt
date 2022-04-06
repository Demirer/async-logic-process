package generics

fun main(){
    Generic<Double>().message(12.0)
    Generic<String>().message("hellooooo")
    Generic<List<String>>().message(listOf("BOB","OGI","YELLY"))
}


class Generic<T> {

    fun message(item : T){
        println("Hello ${item.toString()}")
    }


}