package scope_functions

fun main(){
    Laptop().run {
        pushButton()
        pushButton()
        pushButton()
    }
}



class Laptop {
    var isOpen = false

    fun pushButton(){
        if(isOpen){
            println("Closing the laptop now...")
            isOpen = false
        }else{
            println("Opening the laptop now...")
            isOpen = true
        }
    }
}