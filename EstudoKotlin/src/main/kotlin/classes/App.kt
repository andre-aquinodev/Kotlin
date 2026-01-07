package classes

fun main () {

    val a1 = Account("1234-1", "André")
    val a2 = Account("4321-2", "Luis")


    a1.deposit(2000.0)
    a2.deposit(150.0)

    a1.print()
    a2.print()

    a1.deposit(2000)
    a2.deposit(150)

    a1.print()
    a2.print()


    a1.withdrawal(500.0)
    a2.withdrawal(50.0)

    a1.print()
    a2.print()

    a1.withdrawal(500.0)
    a2.withdrawal(50.0)

    a1.print()
    a2.print()

}