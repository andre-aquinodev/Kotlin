package funtions

fun main() {
    sayHello("André")

}

private fun sayHello(name: String, message: String = "") {
    println("Hi, $name! $message")
}