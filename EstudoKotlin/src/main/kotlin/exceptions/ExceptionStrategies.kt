package exceptions

fun main() {
    a()
}

fun a() {
    try {
        b()
    } catch (b: B) {
        throw A()
    }

}

fun b() {
    throw B()
}

class A : RuntimeException()
class B: RuntimeException()