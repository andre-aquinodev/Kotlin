package polimorphism

fun main() {

    val a: Dog = Dog()
    a.eat()
    a.run()

    val b: Animal = Dog()

    if (b is Dog) {
        b.run()
        b.eat()
    }
}

abstract class Animal {

    fun eat() {
        println("Eating")
    }
}

class Dog: Animal() {
    fun run() {
        println("Running")
    }
}

class Cat: Animal() {
    fun sleep() {
        println("Sleeping")
    }
}