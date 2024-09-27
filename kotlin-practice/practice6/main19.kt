fun main() {
    var mass1 = arrayOf(3, 1, 2, 4, 0)
    var mass2 = arrayOf(5, 9, 7, 6, 8)
    var mass3 = mass1 + mass2
    println("Массивы до сортировки:")
    println("1 mass: ${mass1.joinToString()}")
    println("2 mass: ${mass2.joinToString()}")
    println("3 mass: ${mass3.joinToString()}")

    mass1.sort()
    mass2.sort()
    mass3.sort()
    println("Массив собран в одим и отсортирован")
    println(mass3.joinToString())

}