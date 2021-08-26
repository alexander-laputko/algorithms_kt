fun findSmallest(arr: Array<Int>): Int {
    var smallest = arr[0]
    var smallestIndex = 0

    for (i in 1 until arr.size) {
        if (arr[i] < smallest) {
            smallest = arr[i]
            smallestIndex = i
        }
    }

    return smallestIndex
}

fun selectionSort(arr: Array<Int>): IntArray {
    var newArr = intArrayOf()

    for (i in arr.indices) {
        val smallest = findSmallest(arr)
        newArr += arr.drop(smallest)
    }

    return newArr
}

fun main() {
    val myArray = arrayOf(5, 3, 6, 2, 10)

    println(selectionSort(myArray).joinToString())
}