fun quickSort(numbers: List<Int>): List<Int> {
    return if (numbers.count() < 2) {
        numbers
    } else {
        val pivot = numbers[0]
        val less = numbers.filter { it < pivot }
        val equal = numbers.filter { it == pivot }
        val greater = numbers.filter { it > pivot }

        quickSort(less) + equal + quickSort(greater)
    }
}

fun main() {
    val numbers = readLine()!!.split(" ").map { it.toInt() }.toList()

    println(quickSort(numbers).joinToString(" "))
}