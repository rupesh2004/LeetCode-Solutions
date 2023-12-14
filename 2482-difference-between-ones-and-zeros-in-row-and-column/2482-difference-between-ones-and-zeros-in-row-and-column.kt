class Solution {
    fun onesMinusZeros(grid: Array<IntArray>): Array<IntArray> {
        val m = grid.size
        val n = grid[0].size
        val diff = Array(m) { IntArray(n) }

        val onesRow = IntArray(m)
        val zerosRow = IntArray(m)
        for (i in 0 until m) {
            for (j in 0 until n) {
                onesRow[i] += grid[i][j]
                zerosRow[i] += 1 - grid[i][j]
            }
        }

        val onesCol = IntArray(n)
        val zerosCol = IntArray(n)
        for (j in 0 until n) {
            for (i in 0 until m) {
                onesCol[j] += grid[i][j]
                zerosCol[j] += 1 - grid[i][j]
            }
        }

        for (i in 0 until m) {
            for (j in 0 until n) {
                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j]
            }
        }

        return diff
    }
}
