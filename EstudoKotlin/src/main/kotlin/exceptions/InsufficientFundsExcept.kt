package exceptions

class InsufficientFundsExcept(val currentBalance: Double) : RuntimeException("Error: Current balance is $currentBalance"){

}