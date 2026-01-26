package collections

fun main() {

    //val array = Array(5) { "*" }

    val array = arrayOf("Teste", "45", "rts", "okay", "452")

    array[0] = "A"
    array[3] = "D"
    array[4] = "6"

    println(array.contentToString())
    println(array[0])

}