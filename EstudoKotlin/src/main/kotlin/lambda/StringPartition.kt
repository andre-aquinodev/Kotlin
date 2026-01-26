package lambda

fun main () {

    val (f, s) = "masdASDAFFafaSFRGTghthdTDDSF".partition { it.isUpperCase() }

    println("First: $f")
    println("First: $s")
}