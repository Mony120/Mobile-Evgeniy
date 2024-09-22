fun main(){
    println(" Введи до какого числа ");
    var first = readln().toInt()
    for(i in 1.. first){
        for(n in 1..first){
            println("сумма квадратов от 1 до $first: ($i * $n)^2 = ${(i*n)*(i*n)}")
        }
    }

}