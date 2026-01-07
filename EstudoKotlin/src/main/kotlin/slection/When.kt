package slection

fun main () {

    println("**************** CALCULADORA ***************")
    println("Digite um número")

    print("> ")
    val v1 = readln().toDouble()

    print("> ")
    val op = readln()[0]

    print("> ")
    val v2 = readln().toDouble()

  val resultado = when(op) {
      '+' -> v1 + v2
      '-' -> v1 - v2
      '*' -> v1 * v2
      '/' -> v1 / v2
      else -> 0
  }

    println("Resultado: $resultado")
}