import kotlin.random.Random
fun main() {
    val masSize = 20
    val mass = Array(masSize) { Random.nextInt(0, 100) }
    for(i in 0..mass.size - 1){
        if(mass[i]%3 == 0) print(" ${mass[i]}")
    }

}