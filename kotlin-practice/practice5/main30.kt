fun main() {
    println("Введите целое число:")
    val a = readln().toInt()
    val binary = Integer.toBinaryString(a)
    println("в двоичной системе: $binary")
}