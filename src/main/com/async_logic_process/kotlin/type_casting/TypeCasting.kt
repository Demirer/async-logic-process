package type_casting

import kotlin.random.Random

fun main(){
    val list = getAnimals()
    for (animal in list){
        if(animal is Dog){
            animal.bark()
        }else if(animal is Cat){
            animal.purr()
        }else{
            println("This animal type is unknown")
        }
    }
}


abstract class Animal {
}

class Dog: Animal(){
    fun bark(){
        println("RAAAAR")
    }
}

class Cat: Animal(){
    fun purr(){
        println("CAT COMES TO YOU LOVE HIM")
    }
}

fun getAnimals():List<Animal>{
    val list = arrayListOf<Animal>()
    for(i in 1..10){
        val rnd = Random.nextInt(1,3)
        if(rnd == 1){
            list.add(Cat())
        }else{
            list.add(Dog())
        }
    }
    return list
}