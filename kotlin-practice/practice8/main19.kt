fun main(){
    println("Введите элементы массива разделенных пробелами: ")
    val mass = readLine()!!.split(" ").map { it.toInt() }
    println("Cумма элементов массива - ${sumel(mass)}")
}

fun sumel(mass:List<Int>):Int{
    var a = 0
    for(i in 0 until mass.size){
        a += mass[i]
    }
    return a
}