package collectionlambda

/**
 * EXERCÍCIO
 *
 * A partir de uma lista de números distintos, crie uma mapa que mapeia o número ao seu sucessor. Imprima o resultado
 * na tela de forma que os números estejam ordenados em ordem crescente
 */

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
        .associateWith { it + 1 }
        .toSortedMap()
        .forEach { (k, v) -> println("$k => $v")  }


}