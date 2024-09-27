fun main() {
    var mass = arrayOf(1, 2, 6, 4, 3, 7, 3, 14, 65, 32)
    var mass2 = mutableListOf<Int>()
    for(i in 0..mass.size - 1){
        mass2.add(mass[i])
    }
  println(mass2.joinToString())

}