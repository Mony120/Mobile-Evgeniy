fun main(){
    var sum:Int = 0
    var ymn:Int = 1
        var mass = arrayOf(1, 2, 6, 4, 3, 7, 3,14, 65, 32)
    for(i in 0..mass.size-1){
        sum += mass[i]
        ymn *= mass[i]
    }
    println(" Умножение всех элементов: $ymn")
    println("Сумма всех элементов: $sum")
}