package enum

import kotlin.random.Random

fun main(){
    val medal = when(Random.nextInt(1,5)){
        1-> Medal.GOLD
        2-> Medal.SILVER
        3-> Medal.BRONZE
        else -> "NO MEDAL"
    }
    println(medal)
}


enum class Medal(val position:Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3)
}