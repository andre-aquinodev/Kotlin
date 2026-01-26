package lambda

fun main() {

    val f1: (Int) -> Int = {n: Int ->
        val d = n *2
        println("New value: $d")
        d
    }

    f1(30)
    f1(4)

}