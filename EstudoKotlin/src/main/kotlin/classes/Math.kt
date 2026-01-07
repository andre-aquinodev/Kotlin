package classes

fun main() {
    println(Math.sum(20, 30))
}

class Math {
    companion object {
        fun sum(a: Int, b: Int) = a + b
    }
}