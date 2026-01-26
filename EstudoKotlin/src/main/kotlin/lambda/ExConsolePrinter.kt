package lambda

/**
 * EXERCÍCIO
 *
 * Implemente uma função que imprime informações na tela entre duas linhas que contém asteriscos (******). O
 * conteúdo impresso deve ser computado através de uma expressão lambda
 */
fun main() {

    console { "Hey!!" }

    val x = 5

    console {
        val y = (x * 2) * 1
        y + 5
    }
}

fun console(produce: () -> Any){
    println("****************")
    println(produce())
    println("****************")
}