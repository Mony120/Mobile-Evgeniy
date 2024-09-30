fun main(){
    println("Введите строку ")
    var str = readln()
    println("Колтчество эелементов в строке - ${el(str)}")
}
fun el(str:String):Int{
    var a = 0
    for(elem in str){
        a++
    }
    return a
}