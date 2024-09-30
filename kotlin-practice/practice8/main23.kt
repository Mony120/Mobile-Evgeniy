fun main(){
    println("Введите строку")
    var str = readln()
    println("Количество символов - ${kolvo(str)}")
}
fun kolvo(str:String):Int{
    var sum = 0
    for(symbol in str){
    sum++
    }
    return sum
}