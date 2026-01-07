package funtions

fun main() {
    println(spacing("Oi, tudo bem?"))

}

fun spacing(str: String, isUppercase: Boolean = false): String {
    val sb = StringBuilder()

    for (c in str) {
        sb.append("$c ")
    }

    val r = sb.toString()

    return if (isUppercase) {
         r.uppercase()
    } else {
        r
    }

}