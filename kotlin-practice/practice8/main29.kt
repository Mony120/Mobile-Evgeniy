fun main(){
    var mass = arrayOf(2,1,12,455,64,23,75,8)
    println(mass.joinToString())
    println("Max and min element - ${MinAndMax(mass)}")
}
fun MinAndMax(mass:Array<Int>):Pair<Int,Int>{
    return mass.max() to mass.min()

}