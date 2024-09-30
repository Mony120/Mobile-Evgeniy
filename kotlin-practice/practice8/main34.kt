fun main(){
    println("Введите строку с пробелами")
    val str = readLine()
    println("Без пробелов: ${spase(str)}")
}
fun spase(str:String?):String{
    return str!!.replace(" ", "")
}