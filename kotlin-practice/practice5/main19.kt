fun main() {
    val arr = intArrayOf(12, 4, 15, 3, 45, 11, 228)
    println("Массив до сортировки: ${arr.contentToString()}")

    for (i in 0 until arr.size - 1) {
        for (j in 0 until arr.size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }

    println("Массив после сортировки: ${arr.contentToString()}")
}