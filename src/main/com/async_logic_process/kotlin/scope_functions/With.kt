package scope_functions

fun main(){
    with(Store()){
        shoes = 50
        shirts = 100
        jackets = 200
        inventory()
    }
}

class Store {

    var shoes = 0
    var shirts = 0
    var jackets = 0

    fun inventory(){
        println("Shoes : $shoes  || Shirsts: $shirts || Jackets: $jackets")
    }

}