fun main(){
    val first = 1
    val commonDifference = 2
    val terms = 10
    val progres = IntArray(terms) { i -> first + i * commonDifference }
    println(progres.joinToString(", "))
}

