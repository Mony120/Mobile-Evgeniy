fun main(){
    val mass = arrayOf(1,2,3,4,5,6,7,8,9,0)
    println(mass.joinToString(" "))
    println(masscopy(mass))
}
fun masscopy(mass:Array<Int>):Array<Int>{
    val mass2:Array<Int> = mass
    return mass2
}