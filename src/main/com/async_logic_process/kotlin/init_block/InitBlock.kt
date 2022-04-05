package init_block

fun main(){
    val os = OperatingSystem()
    println(os.mainMessage)
    println(os.isStarted)
}


class OperatingSystem{
    var mainMessage = ""
    var isStarted = false

    init{
        isStarted = true
        mainMessage = "Welcome"
    }
}