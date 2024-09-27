fun main() {
    var mass = arrayOf(1, 23, 12, 6, 3, 44, 12, 55, 41)
    println("${mass.joinToString(", ")}")
    var max = 0
    var secondMax = 0
    for (num in mass) {
        if (num > max) {
            secondMax = max
            max = num
        }
        else if (num > secondMax && num != max) {
            secondMax = num
        }
    }
    println(secondMax)
}