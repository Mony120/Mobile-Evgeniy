import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    println("Введите год:")
    val year = readln().toInt()
    println("Введите месяц:")
    val month = readln().toInt()

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val days = LocalDate.of(year, month, 1).lengthOfMonth()

    for (day in 1..days) {
        val date = LocalDate.of(year, month, day)
        println(date.format(formatter))
    }
}