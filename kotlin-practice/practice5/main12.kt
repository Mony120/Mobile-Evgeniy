fun main() {
    println("веди начальное");
    var first = readln().toInt()
    println("веди шаг числа");
    var steppi = readln().toInt()
    for (i in first..first*100 step steppi) {
        println(i)
    }
}