fun main(){
    println("Введите строку:")
    var str = readln()
    var massStr = str.toCharArray()
    println(massStr.sorted().joinToString(" "))
}
