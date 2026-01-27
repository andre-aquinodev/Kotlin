package collectionlambda

/**
 * OBJETIVO
 *
 *Criar uma String com os nomes das pessoas separados por um hífen.
 */

fun main() {

    val names = Person
        .data()
        .joinToString ("-") {it.name}

    println(names)

}