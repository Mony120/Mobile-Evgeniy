fun main(){
    var mass = arrayOf(2,1,12,455,64,23,75,8)
    println(mass.joinToString())
    println("Введите индекс числа которое хотите вывести")
    var num = readln().toInt()
    println("${vivod(mass,num)} - Элемент который вы искали")
}
fun vivod(mass:Array<Int>,num:Int):Int{

    return mass[num]
}