fun main(){
    var mass = arrayOf(1, 2, 6, 4, 3, 7, 3,14, 65, 32)
    for(i in 0..mass.size-1){
        if(mass[i]%2 == 0)
            println(mass[i])
    }

}