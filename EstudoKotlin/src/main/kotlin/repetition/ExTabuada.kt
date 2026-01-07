package repetition

fun main() {

    print("> ")
    val n = readln().toInt()

    var i = 1
    while(i <= 10) {
        println("$n X $i = ${n * i}")
        i++
    }

}