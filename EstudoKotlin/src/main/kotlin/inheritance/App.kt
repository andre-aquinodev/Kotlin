package inheritance

fun main() {
    
    val dog = Dog("Black")
    val cat = Cat("Black-White")

    cat.miau()
    cat.eat()
    println(cat.color)

    println()
    dog.bark()
    dog.eat()
    println(dog.color)


}