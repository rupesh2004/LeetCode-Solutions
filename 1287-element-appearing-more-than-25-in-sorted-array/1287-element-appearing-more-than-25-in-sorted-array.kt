class Solution {
    fun findSpecialInteger(arr: IntArray): Int {
        val targetCount = arr.size / 4

        for (i in 0 until arr.size - targetCount) {
            if (arr[i] == arr[i + targetCount]) {
                return arr[i]
            }
        }

        return -1
    }
}

fun main() {
    val solution = Solution()

    val arr1 = intArrayOf(1, 2, 2, 6, 6, 6, 6, 7, 10)
    println(solution.findSpecialInteger(arr1))

}
