fun main(){
    println("Введите число")
    var num = readln().toInt()
    fiz(num)

}
fun fiz(num:Int){
    val List = mutableListOf<Int>()
    for(i in 1..num){
        if ((i%5 == 0)&&(i%3 ==0)){
            print(" ВизлБизл")
        }
        else if (i%5 == 0){
            print(" Бизл")
        }
        else if (i%3 ==0){
            print(" Физл")
        }
        else print(" $i")
    }

}