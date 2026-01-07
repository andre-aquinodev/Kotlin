package funtions

fun main() {

    println(calculateAgeDog(readln().toDouble()).toUInt())
}

private fun calculateAgeDog(ageDog: Double): Double {
    return ageDog * 7
}