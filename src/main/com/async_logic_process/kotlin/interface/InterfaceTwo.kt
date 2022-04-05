package `interface`

fun main(){
    val limousine:CarRental = Limousine()
    val car:CarRental = Car()

    car.ride()
    println(car.price)
    limousine.ride()
    println(limousine.price)
}

interface CarRental {
    val price:Int
    fun ride()
}

class Car :CarRental{
    override val price = 100
    override fun ride() {
        println("Car is not luxury but OK!")
    }
}

class Limousine:CarRental{
    override val price = 500
    override fun ride() {
        println("Limousine is awesome but expensive")
    }
}