fun main() {
    println("Введите число:")
    var num = readln().toInt()
    pyramid(num)
}
fun pyramid(num: Int) {
    for (i in 1..num) {
        for (j in 1..num - i) {
            print(" ")
        }
        for (k in 1..i) {
            print("# ")
        }
        println()
    }
}