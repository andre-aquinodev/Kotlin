package exceptions

/**
 * EXERCÍCIO
 *
 *
 * Escreva uma função que divide dois números. se for uma divisão por 0, a função deve retornar 0 como reesultado.
 * Os parâmetros e o retorno do método devem ser todos di tipo Int.
 */
fun main() {

    println(division(10, 0))
}

fun division(x: Int, y: Int) : Int {
    return try {
        x / y
    } catch (_: ArithmeticException) {
        0
    }
}