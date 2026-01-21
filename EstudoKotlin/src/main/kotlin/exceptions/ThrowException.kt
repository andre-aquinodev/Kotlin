package exceptions

fun main() {

    val account = BankAccount()

    try {
        account.deposit(300.0)
        account.withdraw(100.0)
    } catch (e: RuntimeException) {
        println("Error: ${e.message}")
    } finally {
        println("Balance: ${account.balance}")
    }

}

class BankAccount() {
    var balance: Double = 0.0
        private set

    fun deposit(value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }
        balance += value
    }

    fun withdraw (value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }

        if(balance - value <0) {
            throw InsufficientFundsExcept(balance)
        }
        balance -= value
    }
}
