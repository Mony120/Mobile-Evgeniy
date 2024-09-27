fun main(){
    var mass1 = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val grouppy = mass1.toList().chunked(5)  // Разделение массива на группы по 5 элементов
    for(group in grouppy){
        println(group.joinToString())
    }
}