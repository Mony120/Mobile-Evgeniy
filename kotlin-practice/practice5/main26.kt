fun main(){
    println("Введите до какого числа считать")
    var first = readln().toInt()
    var sumchet:Int = 0
    var sumnechet:Int = 0
    for(i in 1..first){
        if(i%2 == 0){
            sumchet += i
        }
        else{
            sumnechet +=i
        }
    }
    println("Сумма четных: $sumchet")
    println("Сумма нечетных: $sumnechet")

}