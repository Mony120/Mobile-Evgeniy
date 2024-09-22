fun main() {

    println("Введите начало")
    var first = readln().toInt()
    println("Введите конец")
    var second = readln().toInt()

    while (first < second) {
        if (prover(first)) {
            println("$first")
        }
        first++
    }
}
fun prover(a: Int): Boolean {
    for(i in 2..a-1 ){
        if(a % i == 0){
            return false
        }
    }
    return true
}
