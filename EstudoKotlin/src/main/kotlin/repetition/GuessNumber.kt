package repetition

import kotlin.random.Random

fun main() {
    println("************** Bem-Vindo ao jogo de adivinhação **************")
    println()
    println("Digte o número para tentar acertar")

    val secret = Random.nextInt(0, 101)
    var playing = true

    while (true) {
        print("> ")
        val n = readln().toInt()

        when {
            n > secret -> println("O número sorteado é menor ")
            n < secret -> println("O número sorteado é maior")
            else -> {
                println("PARABÉNS!!!! você acertou o número sorteado era: $n ")
                break
            }
        }
    }

}