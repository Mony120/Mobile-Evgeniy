fun main() {
    println("Введи число")
    val a = readln().toInt()


    for(i in 1..a){
        for(n in 1..i ){
            print(n)
        }
    println()
    }
}