fun main(){
    val mass = arrayOf(1,2,3,4,5,6,100)
    println(mass.toString())
    println("max - ${maxi(mass)}")
}

fun maxi(mass:Array<Int>):Int{
    return mass.max()

}