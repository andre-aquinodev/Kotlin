package exceptions

/**
 * EXERCÍCIO
 *
 * Crie uma class Rect para representar um retângulo. O retângulo deve receber doi valores de lado quando for criado,
 * e os lados não podem ser 0 ou com valor negativo, Nestes casos, uma IllegalArgumentException deve ser lançado.
 */

fun main() {

    val rect = Rect(10.0, -4.0)
    println(rect)

}

data class Rect(val width: Double, val height: Double) {

    init {
        require(width >= 0)
        require(height >= 0)
    }
}