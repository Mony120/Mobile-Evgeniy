fun main(){
    val matrix = arrayOf(
        arrayOf(2, 2, 2),
        arrayOf(4, 4, 4),
        arrayOf(6, 6, 6)
    )

    val transposed = Array(matrix[0].size) { IntArray(matrix.size) }
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            transposed[j][i] = matrix[i][j]
        }
    }
    println("Транспонированная матрица:")
    for (row in transposed) {
        println(row.joinToString(" "))
    }
}
