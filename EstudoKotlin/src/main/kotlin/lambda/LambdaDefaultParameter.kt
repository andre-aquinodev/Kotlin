package lambda

fun main() {

    val x: (Int) -> Int = { it * 2}

    println(x(6))
}