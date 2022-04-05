package getter_setter

fun main(){
    var acc = Account()
    acc.account = 100
    println(acc.account)
    println(acc.interestRate)

    acc.account = 1500
    println(acc.account)
    println(acc.interestRate)

    acc.account = 999999
    println(acc.account)
    println(acc.interestRate)
}

class Account {
    var account = 0
        get() = field
        set(value) {
            interestRate = when(value){
                in 1..1000 -> 1.0
                in 1000..10000 -> 0.5
                in 10000..10000000 -> 0.2
                else -> 0.0
            }
            field = value
        }
    var interestRate:Double = 0.0
}