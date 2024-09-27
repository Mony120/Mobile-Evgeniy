fun main(){
    var mass = arrayOf(1, 2, 6, 4, 3, 7, 3,14, "LOL", 32)
    for (i in 0..9){
        when(mass[i]){
            is String -> println(mass[i])
        }
    }


}
