fun main(){
    println("Введите до какого числа считать")
    var num = readln().toInt()
    println("  Сумма чисел от 1 до $num - ${sumochka(num)}")
}
fun sumochka(num:Int):Int{
    var a = 0
    for(i in 0..num){
        a+=i
    }
    return a
}