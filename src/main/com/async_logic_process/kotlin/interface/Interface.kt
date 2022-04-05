package `interface`

fun main(){
    val machine:Coffee = CoffeeMachine()
    machine.deliverArabica()
    machine.deliverRobusta()
}




interface Coffee {

    fun deliverArabica()
    fun deliverRobusta()
}

class CoffeeMachine : Coffee{
    override fun deliverArabica() {
        println("HERE IS YOUR ARABICA COFFEE")
    }

    override fun deliverRobusta() {
        println("HERE IS YOUR ROBUSTA COFFEE")
    }

}
