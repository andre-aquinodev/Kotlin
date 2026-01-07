package slection

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    println("----------------------------Sejá Bem-Vindo!!!------------------------------")

    print("Digite sua idade: ")
    var age = sc.nextInt()

    if( age >= 0 && age <= 12 ){
        println("CRIANÇA: 0 a 12 anos")
    } else if(age >= 13 && age <= 17){
        println("ADOLECENTE: 13 a 17 anos")
    } else if (age >= 18 && age <= 65) {
        println("ADULTO: 18 a 65 anos")
    } else if(age >= 66 && age <= 100) {
        println("SÊNIOR: 66 nos ou mais")
    } else {
        println("IDADE INVALIDA")
    }


}