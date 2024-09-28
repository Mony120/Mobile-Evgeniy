fun main() {
    println("Введите элементы массива разделенных пробелами: ")
    val mass = readLine()!!.split(" ").map { it.toInt() }
    val minimum = mass.min()
    println("Минимальное число в массиве - $minimum")
}