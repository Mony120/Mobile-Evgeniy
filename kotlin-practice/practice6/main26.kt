fun main() {
    var mass = arrayOf(1, 23, 12, 6, 3, 44, 12, 55, 41)
    println("${mass.joinToString(", ")}")
    var  sred = 0
    var tochnosred = 0
    for(i in 0..mass.size-1){
        sred += mass[i]
        tochnosred = sred/mass.size
    }
    println("Srednee = $tochnosred")

}