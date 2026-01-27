package collectionlambda

/**
 * OBJETIVO
 *
 * Obter a quantidade de pessoas cujo o nome começa com a letra 'R'.
 */


fun main() {

//    val count = Person
//        .data()
//        .filter {it.name.startsWith("R") }
//        .count()

    val count = Person
        .data().count { it.name.startsWith("R") }
    println(count)
}