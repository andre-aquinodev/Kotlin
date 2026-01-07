package friststeps

import java.util.Scanner

fun main () {

    val sc = Scanner(System.`in`)

        println("-------------------------Sejá Bem-Vindo---------------------------------")
        print("Digite um número: ")

        var numero = sc.nextInt()

        if (numero % 2 == 0 ) {
            print("Esse numero ${numero} é par")
        } else {
            print("Esse numero ${numero} é impar")
        }


}
