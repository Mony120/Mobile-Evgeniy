import kotlin.random.Random
fun main(){
    println("Десять случайных чисел")
for(i in 1..10){
    ran()
}
}
fun ran() {
    return  println(Random.nextInt(1,100))
}