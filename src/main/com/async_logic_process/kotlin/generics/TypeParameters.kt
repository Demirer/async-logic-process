package generics

/**
 * We can restrict GENERICS TYPE Parameters.
 */

fun main(){
    val sqr = Geometry<Square>()
    sqr.getArea(Square(),15.0)

    val circle = Geometry<Circle>()
    circle.getArea(Circle(),15.0)


}

abstract class Shape {
    abstract fun size(size:Double):Double
}

class Square: Shape(){
    override fun size(size:Double):Double {
        return size*size
    }
}

class Circle: Shape(){
    override fun size(size:Double):Double {
        return size*size*3.141515
    }
}

class Geometry<T:Shape>{
    fun getArea(item :T, size:Double){
        println("Area is ${item.size(size)}")
    }
}