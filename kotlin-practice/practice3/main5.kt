fun main() {
    println("Vvedite 3 chisla")
    val a = readln().toInt();
    val c = readln().toInt();
    val b = readln().toInt()
    if ((a + b > c) && (b + c > a) && (c + a > b)) {
        println("Treugolnika ne budet")
    } else println("Treygolnik bydet")
}