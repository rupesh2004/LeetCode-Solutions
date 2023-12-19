class Solution {
    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
        val m = img.size
        val n = img[0].size
        val result = Array(m) { IntArray(n) }

        for (i in 0 until m) {
            for (j in 0 until n) {
                result[i][j] = smoothCell(img, i, j)
            }
        }

        return result
    }

    private fun smoothCell(img: Array<IntArray>, i: Int, j: Int): Int {
        val m = img.size
        val n = img[0].size
        var sum = 0
        var count = 0

        for (x in maxOf(0, i - 1) until minOf(m, i + 2)) {
            for (y in maxOf(0, j - 1) until minOf(n, j + 2)) {
                sum += img[x][y]
                count++
            }
        }

        return sum / count
    }
}

fun main() {
    val solution = Solution()
    val img1 = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
    val img2 = arrayOf(intArrayOf(100, 200, 100), intArrayOf(200, 50, 200), intArrayOf(100, 200, 100))

    val result1 = solution.imageSmoother(img1)
    val result2 = solution.imageSmoother(img2)

    println("Output 1: ${result1.map { it.toList() }}")
    println("Output 2: ${result2.map { it.toList() }}")
}
