fun main(){
    var mass = arrayOf(2,1,12,455,64,23,75,8)
    println(mass.joinToString())
    println("Введите элемент который хотите найти")
    var num = readln().toInt()
    println("Есть ли ваш элемент - ${search(mass,num)}")
}
fun search(mass:Array<Int>, num:Int):Boolean {
    for(i in 0 until mass.size){
        if(num == mass[i]) return true
        else return false
    }
    return true
}