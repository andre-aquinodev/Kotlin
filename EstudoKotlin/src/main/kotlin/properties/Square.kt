package properties

fun main() {

    val s1 = Square(10)
    val s2 = Square(170)
    val s3 = Square(140)
    val s4 = Square(0)

}

class Square(val size: Int) {
    init {
        require( size >= 0 )
        println(size)
    }
}