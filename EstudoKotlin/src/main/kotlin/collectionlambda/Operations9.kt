package collectionlambda

/**
 * OBJETIVO
 *
 *Procurar na lista uma pessoa com determinado nome. Retornar a idade dessa pessoa se ela for encontrada, caso
 * contrario retorne 0.
 */

fun main() {

    val person = Person
        .data()
        .find { it.name == "Joana" }
        ?.age
        ?: 0


    println(person)
}