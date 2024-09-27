fun main(){
    var mass = arrayOf(1, 2, 6, 4, 3, 7, 3,14, 65, 32)
    var mass1 = arrayOf(4,19,43,11,2,1)
    val intersectionSet = mass.toSet().intersect(mass1.toSet())//метод сравнения массивов и нахождение общих членов
    println(intersectionSet.joinToString())
}