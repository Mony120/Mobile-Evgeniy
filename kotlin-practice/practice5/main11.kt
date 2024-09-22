fun main() {
    println("Введите первую строку : ")
    val str1 = readLine().toString()

    println("Введите вторую строку :")
    val str2 = readLine().toString()

    if (anrm(str1, str2)) {
        println("анаграммамы.")
    } else {
        println("Строки не являются анаграммами.")
    }
}

fun anrm(str1: String, str2: String): Boolean {

    val Str1 = str1.replace(" ", "").toLowerCase().toCharArray().sorted()
    val Str2 = str2.replace(" ", "").toLowerCase().toCharArray().sorted()

    return Str1 == Str2

}