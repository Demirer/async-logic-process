package sealed_classes

import kotlin.random.Random

fun main(){
    when (lottery()){
        is VW -> println("CONGRATZ YOU WON CAR")
        is Maldives -> println("CONGRATZ YOU WON MALDIVES VACATION")
        else -> println("You won gift ticket !")
    }
}



fun lottery():Prize{
    return when(Random.nextInt(1,4)){
        1 -> VW()
        2 -> Maldives()
        else -> Dollar()
    }
}




sealed class Prize

sealed class Car: Prize()

sealed class Vacation : Prize()

sealed class GiftCard:Prize()

class VW : Car()

class Maldives : Vacation()

class Dollar : GiftCard()

