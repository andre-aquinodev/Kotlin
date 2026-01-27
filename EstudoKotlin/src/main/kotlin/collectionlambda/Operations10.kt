package collectionlambda

/**
 * OBJETIVO
 *
 *Procurar na lista uma pessoa com a determinada idade. Retornar um boolean indicando se ela foi encontrada.
 */

fun main() {

    val existsAge = Person
        .data()
        .any {it.age == 19}

    println(existsAge)

}