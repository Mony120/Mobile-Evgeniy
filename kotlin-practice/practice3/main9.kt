fun main() {
    println("vvedite 2 chisla")
    var m = readln().toInt();
    var n = readln().toInt()
    if (m % n == 0)
        print("${m / n} - chastnoe")
    else
        print("nacelo ne delica")
}