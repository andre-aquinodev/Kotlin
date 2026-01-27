package collectionlambda

/**
 * EXERCÍCIO
 *
 * Com base em um mapa que mapeia um nome de produto ao seu preço, encontre as respostas para as seguintes perguntas:
 * 1)Qual é o maior preço?
 * 2)Qual o produto com o preço mais baixo?
 * 3)Qual a lista de produtos cujo preço é maior do que R$5?
 */

fun main() {
    val products = mapOf(
        "Alface" to 2.5,
        "Arroz" to 6.9,
        "Banana" to 4.8,
        "Sal" to 2.4
    )

    val maxPrice =products
        .map { it.value }
        .max()
    println("R1 - O valor maximo é: $maxPrice")

    val minPrice = products
        .minBy { it.value }
        .key
    println("R2 - O product com menor valor é: $minPrice")

    products
        .filter { it.value < 5.0 }
        .keys
        .forEach { print("R3 - $it ") }
}