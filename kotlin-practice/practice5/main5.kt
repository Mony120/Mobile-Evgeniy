fun main(){
    println("Введите число")
    val a = readln().toInt()
    var b:Int = 0
    if(a <= 1){
        println("Ваше число 1 это простое")
        return
    }
    else if(a <= 0){
        println("Введите другое число!!!")
        return
    }
    if((a == 5)|| (a==3)){
        print("Ваше число простое")
        return
    }
    if((a%2 == 0) || (a%3 == 0) || (a%5 == 0)){
        println("Ваше число не простое:)")
        return
    }else print("Ваше число простое")


}