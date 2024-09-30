fun main(){
    var mass = arrayOf(2,1,12,455,64,23,75,8)
    println(mass.joinToString())
    println("Последний элемент массива - ${last(mass)}")
}
fun last(mass:Array<Int>):Int{
    var a = 0
    for(i in mass){
        a = i
    }
    return a
}