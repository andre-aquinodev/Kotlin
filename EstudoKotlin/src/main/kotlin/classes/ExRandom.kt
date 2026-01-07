package classes

fun main() {

    val g = charGenerator('A', 'Z')
    println(g.next())
    println(g.next())
    println(g.next())
}

class charGenerator (val min: Char, val max: Char) {

    fun next() = (min..max).random()

}