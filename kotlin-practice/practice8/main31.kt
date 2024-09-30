fun main(){
    println("Введите градусы цельсия - ")
    var cel = readln().toInt()
    println("Это в фаренгейтах - ${farenget(cel)}")
}

fun farenget(cel:Int):Int{
    return (cel * 9/5)+32

}
