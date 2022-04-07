package lateinit

import kotlin.random.Random

fun main(){
    val list = listOf(2,3,5,7)
    println(MessageWithPrime().selectPrimeWithMessages(list))
}

class MessageWithPrime {
    lateinit var message:String

    fun selectPrimeWithMessages(primeList:List<Int>): String{
        val index = Random.nextInt(0,primeList.size)
        message = "Your random generated prime number is ${primeList[index]}"
        return message
    }
}