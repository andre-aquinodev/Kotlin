package collections

/**
 * EXERCÍCIOS
 *
 * Crie uma lista de cidades que você visitou hipoteticamente nps últimos meses( a lista pode conter cidades repetidas).
 * Crie um algorithm que conta quantas cidades diferentes você visitou (isto é, excluindo cidades duplicadas).
 */

fun main() {

    val cidades = listOf("Ilheus", "Brasilia", "Itacare", "Una", "Canavieiras", "Porto-Seguro", "São=Paulo" ,
    "Ilheus", "Itabuna", "Itacare", "Una")

    println(cidades)
    println(cidades.size)

    val uniqueCities = cidades.toSet()

    println(uniqueCities)
    println(uniqueCities.size)
}