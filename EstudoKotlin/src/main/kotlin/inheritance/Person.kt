package inheritance

fun main() {
    val person1 = Person("Andre", "Luis", 30)
    val person2 = Person("Andre", "Luis", 30)


    println(person1)
    println(person2)
    println(person1 == person2)
}

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
)