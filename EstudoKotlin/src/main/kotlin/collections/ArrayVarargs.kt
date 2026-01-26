package collections

fun main() {

    println(sum(1, 4, 3, 5, 3, 8, 6))

    val a = intArrayOf(5, 7, 5, 9, 3, 2, 6)
    println(sum(*a))

}

//fun sum(n1: Int, n2: Int): Int {
//    return n1 + n2
//}

fun sum(vararg values: Int): Int {
    var sum = 0
    values.forEach { sum += it}
    return sum
}