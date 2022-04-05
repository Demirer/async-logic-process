package this_keyword

fun main(){
    val table = Table()
    println("Height: ${table.height} Width : ${table.width}")
    table.updateHeight(100)
    table.updateWidth(250)
    println("Height: ${table.height} Width : ${table.width}")
}


/**
 *  .this keyword refers to current variable in class with same name.
 */
class Table {

    var height = 0
    var width = 0

    fun updateHeight(height:Int){
        this.height = height
    }

    fun updateWidth(width:Int){
        this.width = width
    }
}