package properties

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie uma classe Account para representar uma conta bancária. Esta classe deve ter uma propriedade balance para
 * armazenar o saldo da conta. Quando uma conta é criada, ela pode opcionalmente conter um saldo inicial, o
 * qual não pode ser inferior a 0. Além disso, o saldo só pode ser alterado através do método deposit() e
 * withdraw(), responsáveis pelos depósitos e saques na conta, respetivamente.
 */

fun main() {

    val account = Account(100.0)
    account.deposit(100.0)

    println("Seu saldo é: ${account.balance}")

    account.withdraw(50.0)
    println("Seu saldo é: ${account.balance}")

}

class Account(balance: Double = 0.0) {

    init {
        require(balance >= 0)
    }

     var balance = balance
         private set

    fun deposit(amount: Double){
        require(amount >= 0)
        balance += amount
    }
    fun deposit(amount: Int){
        require(amount >= 0)
        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount >= 0)
        balance -= amount
    }
    fun withdraw(amount: Int) {
        require(amount >= 0)
        balance -= amount
    }

}
