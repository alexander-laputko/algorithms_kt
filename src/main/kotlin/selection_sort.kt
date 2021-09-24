fun findSmallest(list: MutableList<Int>): Int {
    var smallest = list[0]

    for (i in 1..list.lastIndex) {
        if (list[i] < smallest) {
            smallest = list[i]
        }
    }

    return smallest
}

fun selectionSort(list: MutableList<Int>): MutableList<Int> {
    val newList = mutableListOf<Int>()

    for (i in 0..list.lastIndex) {
        val smallest = findSmallest(list)
        newList.add(smallest)
        list.remove(smallest)
    }

    return newList
}

fun main() {
    val list = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    println(selectionSort(list).joinToString(" "))
}