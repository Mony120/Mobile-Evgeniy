fun main() {
    println("Введите число N:")
    val a = readln().toInt()
    val sum = (1..a).sumOf { 1.0 / it }
    println("Сумма = $sum")
}