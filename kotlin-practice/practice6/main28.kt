fun main() {
    print("Введите элементы массива разделенных пробелами: ")
    val mass = readLine()!!.split(" ").map { it.toInt() }
    println(mass.joinToString(", "))
}