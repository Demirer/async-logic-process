package inheritance

fun main(){
    var user = UserAccount("User",110)
    user = UserAccount()
}


class UserAccount {

    var userName:String = ""
    var account:Int = 0

    constructor(usr:String,acc:Int){
        userName = usr
        account = acc
        println(canAfford(acc))
    }

    constructor(){
        println(canAfford(20))
    }

    fun canAfford(balance:Int):Int{
        return balance/20
    }
}