fun fact(number: Int): Int {
    return if (number == 1) 1 else number * fact(number - 1)
}

fun main() {
    println(fact(readLine()!!.toInt()))
}