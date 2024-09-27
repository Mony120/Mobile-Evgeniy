fun main(){
    var mass = arrayOf(1, 2, 3, 4)
    var summ:Int = 0
    println(mass.sum())
    //или
    for(i in 0 ..3 ){
        summ += mass[i]
    }
    println(summ)

}