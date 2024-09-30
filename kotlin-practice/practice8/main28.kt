fun main(){
    println("Введите сколько элементов массива вы хотите вывести")
    var num = readln().toInt()
    println(makearray(num).joinToString())
}
fun makearray(num:Int): Array<Int?> {
    var mass = arrayOfNulls<Int>(num)
    for(i in 0 until num){
        mass[i] = i
    }
    return mass
}