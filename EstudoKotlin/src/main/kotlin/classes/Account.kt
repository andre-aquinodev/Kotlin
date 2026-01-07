package classes

class Account (val accountNumber: String, val  accountOwner: String) {

    var balance: Double = 0.0

    constructor() : this(accountOwner = "", accountNumber = "") {
        println("Constroctor()")
    }


    fun deposit(amount: Double) {
        balance += amount

    }

    fun deposit(amount: Int) {
        balance += amount

    }

    fun withdrawal(amount: Double) {
        balance -= amount
    }

    fun withdrawal(amount: Int) {
        balance -= amount
    }

    fun print() {
        println("Number: $accountNumber; Owner: $accountOwner; Balance: $balance")
    }

}