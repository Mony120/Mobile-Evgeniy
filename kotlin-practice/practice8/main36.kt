fun main(){
    println("Введите первую строку")
    val str1 = readln()
    println("Введите вторую строку")
    val str2 = readln()
    println("Есть ли одна строка в другой: ${str(str1, str2)}")
}
fun str(str1:String, str2:String):Boolean{
    if(str2 in str1){
        return true
    } else false
    return true
}