fun main(){
    println("Введите строку")
    var str = readln()
    println("Строка в верхнем регистре - ${reg(str)}")
}
fun reg(str:String): String {
    return str.toUpperCase()
}