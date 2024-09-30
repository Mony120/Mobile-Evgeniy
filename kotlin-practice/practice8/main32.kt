fun main(){
    println("Введите строку")
    var str = readln()
    println("Строка в обратном порядке - ${reverse(str)}")
}

fun reverse(str:String):String{
    return str.reversed()
}