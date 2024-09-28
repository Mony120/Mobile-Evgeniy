

fun main() {
    println("Введите первое число")
    var first = readln().toDoubleOrNull()
    println("Введите второе число")
    var second = readln().toDoubleOrNull()
    if ((first == null) || (second == null)) {
        println("Введите нормальные чилса блин ты чо дурак")
        return
    }
    var res: Double = 0.0
    println("Выбери действие: / * + - %")
    var doing = readln()
    when (doing) {
        "+" -> res = first + second
        "-" -> res = first - second
        "*" -> res = first * second
        "/" -> {
            if (second != 0.0) {
                res = first / second
            } else println("На нуль делить нельзя ты чо дурной")
        }

        "%" -> {
            if (second != 0.0) {
                res = first % second
            } else println("На нуль делить нельзя ты чо дурной")
        }
        else -> println("Такого действия нет выбери из предложеных блин")
    }
    println("Ваш результат - $res")

}