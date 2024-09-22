fun main() {
    println("Введите число")
    val a = readln().toInt()
    var odin: Int = 1
    var dva: Int = 1
    print("Первые $a чисел фиббоначи: ")
    for (i in 1..a) {
        print("$odin ")
        val sum = odin + dva
        odin = dva
        dva = sum
    }
}