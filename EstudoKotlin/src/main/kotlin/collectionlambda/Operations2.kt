package collectionlambda

/**
 * OBJETIVO
 *
 * Construir uma lista apenas com os nomes das pessoas
 */

fun main() {

    Person
        .data()
        .map { it.name }
        .forEachIndexed { i, p -> println("${i + 1}.  $p") }

}