package polimorphism

fun main() {

    val c = Coffe()
    c.prepare()
}

open class Drink {

    open fun prepare() {
        println("Preperar DRINK")
    }
}

class Coffe: Drink() {
    override fun prepare() {
        super.prepare()
        println("Preperar COFFE")
    }
}