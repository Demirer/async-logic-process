package scope_functions

fun main(){
    CarFactory().apply { buildCar() }.also { println("Notification send for car $it") }
}

class CarFactory {
    fun buildCar(){
        println("Car is currently building...")
    }
}