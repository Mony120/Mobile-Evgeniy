import kotlin.random.Random
fun main(){
    val masSize = 20
    val mass = Array(masSize) { Random.nextInt(0, 100) }
    println(mass.joinToString())

}