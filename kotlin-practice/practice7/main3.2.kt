
fun main(){
    println("Введите 1 число")
    var first = readln().toInt()
    println("Введите 2 число")
    var second = readln().toInt()
    var boolka = true
    if(second == first){
        boolka = true
        println(boolka)
    }
    else {
        boolka = false
        println(boolka)
    }
}