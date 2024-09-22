fun main(){
    println("Vvedite сколько часов")
    val a = readln().toInt()
    println("Введите сколько минут")
    val b = readln().toInt()
    if(a == 24){
        println("НОЧь")
        return
    }
    when{
        (a in 6..11 && b in 0..59) -> print("Утро")
        (a in 11..17 && b in 0..59) -> print("День")
        (a in 18..23 && b in 0..59) -> print("Вечер")
        (a in 0..5 && b in 0..59) -> print("Ночь")
        else -> print("Непонятное время")
    }

}