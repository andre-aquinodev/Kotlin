package nullable

fun main() {

    val password: String? = null
    val defaultPassword = "1234"

    val mask = "".padEnd((password ?: defaultPassword).length, '*')

    println(password)
    println(mask)

}