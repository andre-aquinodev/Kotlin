package repetition

fun main() {
    print("> ")
    val n = readln().toInt()

    for (i in 1..10){
        println("$n X $i = ${n * i}")
    }
}