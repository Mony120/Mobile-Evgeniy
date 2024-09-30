fun main(){
    var mass1 = mutableListOf(1,2,3,4,5)
    var mass2 = mutableListOf(6,7,8,9,10)
    println("${mass1.joinToString(" ")} - first massiv \n ${mass2.joinToString(" ")} - second massiv")
    println("${soed(mass1, mass2)} - Соединеный массив ")
}

fun soed(mass1:List<Int>, mass2:List<Int>):List<Int>{
    return mass1 + mass2
}