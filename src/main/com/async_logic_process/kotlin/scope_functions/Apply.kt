package scope_functions

fun main(){
    val name = readLine()?:""
    CoffeeShop().sellCoffee(name)
}


class CoffeeShop{
    fun sellCoffee(name :String){
        CoffeeCup().apply {
            clientName = name
            println("Preparing coffee for client $clientName")
            println(this)
        }
    }
}

class CoffeeCup(){
    var clientName = ""
    fun prepareCoffee(){
        println("Brewing coffee")
    }
}