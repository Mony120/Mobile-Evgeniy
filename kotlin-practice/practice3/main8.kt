fun main(){
    println("Vvedite dva растояния(сначала в км, потом в футах")
    val a = readln().toDouble();
    val b = readln().toDouble()
    val m:Double = b * 0.0003048
    if(a > m){
        println("Расстояние в км больше")
    }
    else println("расстояние в футах больше")
}
