fun main() {
    println("Введите до какого числа считать")
    var num = readln().toInt()
    for (i in 1..num) {
        if (prost(i)) print("$i ")
    }
}
fun prost(num: Int): Boolean {
    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false
    var i = 3
    while (i * i <= num) {
        if (num % i == 0) return false
        i += 2
    }
    return true
}