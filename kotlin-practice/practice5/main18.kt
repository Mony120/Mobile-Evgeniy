fun main() {
    print("Введите высоту лестницы: ")
    val height = readln().toInt()

    for (i in 1..height) {
        print("#".repeat(i))
        println()
    }
}