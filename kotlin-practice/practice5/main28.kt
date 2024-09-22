fun main() {
    println("Введите количество чисел:")
    val x = readln().toInt()
    val mass = IntArray(x)

    for (i in 0 until x) {
        println("Введите ${i + 1}-е число: ")
        mass[i] = readln().toInt()
    }

    mass.sort()
    println("Числа в порядке возрастания: ${mass.joinToString()}")
}