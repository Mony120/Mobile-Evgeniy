import kotlin.random.Random

fun main(){
    var arr = Array<Int>(100, { Random.nextInt(-50, 50)})
    for (a in 0 until arr.size){
        if ((a+1) % 10 == 0) println("${arr[a]} ")
        else print("${arr[a]}\t")
    }

}