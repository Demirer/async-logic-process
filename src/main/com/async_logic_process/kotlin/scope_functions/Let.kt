package scope_functions

/**
 * •	Allows us run code on an object. Most common usage filter nun-null
 */
fun main(){
    val arrL = arrayListOf<String?>()
    var vari = ""
    while (vari != "stop"){
        vari = readLine()?:""
        vari.let {
            if (vari == ""){
                arrL.add(null)
            }
            if(vari != "stop"){
                arrL.add(it)
            }
        }
    }

    arrL.forEach(::println)
}


