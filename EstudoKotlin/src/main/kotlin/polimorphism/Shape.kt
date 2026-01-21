package polimorphism

fun main() {

    val square = Square()
    println(square.vertexNumber)

    val triangle = Triangle()
    println(triangle.vertexNumber)
}

abstract class Shape {
    open val vertexNumber: Int = 0
}

class Square: Shape() {

    override val vertexNumber: Int = 15
}

class Triangle: Shape()