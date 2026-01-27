package collectionlambda

/**
 * OBJETIVO
 *
 * Somar a idade de todas as pessoas cujo o nome começa com a letra 'R'.
 */

fun main() {

     val count = Person
        .data()
        .filter { it.name.startsWith("R") }
        .sumOf { it.age}

    println(count)
}