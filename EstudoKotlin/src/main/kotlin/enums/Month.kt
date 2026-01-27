package enums

import enums.Month.August

fun main() {

    val month = August
    println(month.numberOfMonth)
    println(month.name)
    println(month.ordinal)

    val nextMonth = month.next()
    println(nextMonth)

    val month11 = Month.getEnumByNumberOfMonth(11)
    println(month11)

    val monthJuly = Month.valueOf("July")
    println(monthJuly)
    println(monthJuly.getTotalDays())

}

enum class Month(val numberOfMonth: Int) {
    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12);


    fun next(): Month {
       return entries
           .find { it.numberOfMonth == numberOfMonth + 1 }
           ?: January
    }

    fun getTotalDays(): Int {
        return when (this) {
            January, March, May, July, August, October, December-> 31
            February -> 28
            else -> 30
        }
    }

    companion object {
        fun getEnumByNumberOfMonth(numberOfMonth: Int): Month {
            return entries
                .first{ it.numberOfMonth == numberOfMonth }
        }
    }
}

