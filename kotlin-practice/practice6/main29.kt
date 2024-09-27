fun main() {
    var mass = arrayOf(1, 23, 12, 6, 3, 44, 12, 55, 41)
    println("${mass.joinToString(", ")}")
    val sortedArray = mass.sortedArray()
    val n = sortedArray.size
    if (n % 2 == 0) {
        (sortedArray[n / 2 - 1] + sortedArray[n / 2]) / 2.0
    } else {
        sortedArray[n / 2].toDouble()
    }
}