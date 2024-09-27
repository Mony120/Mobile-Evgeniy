fun main() {
    var mass = arrayOf(1, 23, 12, 6, 3, 44, 12, 55, 41)
    println("${mass.joinToString(", ")}")
    println("Введите число: ")
    var a = readln().toInt()
    var esli = false
    if(a in mass){
        esli = true
    }
    else esli = false
    println("Вывод: $esli")
}