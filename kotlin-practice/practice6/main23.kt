fun main(){
    var mass1 = arrayOf(1,2,3,4,5)
    var mass2 = arrayOf(6,7,8,9,0)
    val combmMass = mass1 + mass2
    println("1 array: ${mass1.joinToString()}")
    println("2 array: ${mass2.joinToString()}")
    println("Combined massiv: ${combmMass.joinToString()}")
}