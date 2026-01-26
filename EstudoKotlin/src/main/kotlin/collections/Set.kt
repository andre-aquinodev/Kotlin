package collections

fun main() {
    val s1 = setOf(1, 2, 3, 4)
    val s2 = mutableSetOf("A", "B", "C")
    val s3 = hashSetOf("1A", "5B", "10C")

    s1.forEach {print("${it} ") }
    println()
    s2.forEach { print("${it} ") }
    println()
    s3.forEach { print("${it} ") }
}