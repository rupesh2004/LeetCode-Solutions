class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val numRows = matrix.size
        val numCols = matrix[0].size
        val result = Array(numCols) { IntArray(numRows) }

        for (i in 0 until numRows) {
            for (j in 0 until numCols) {
                result[j][i] = matrix[i][j]
            }
        }

        return result
    }
}
