class Solution {
    fun minOperations(nums: IntArray): Int {
        var ans = 0
        val count = mutableMapOf<Int, Int>()

        for (num in nums)
            count.merge(num, 1) { oldValue, _ -> oldValue + 1 }

        for (freq in count.values) {
         
            if (freq == 1)
                return -1
            ans += (freq + 2) / 3
        }

        return ans
    }
}

fun main() {
    val solution = Solution()

    val nums = intArrayOf(2, 3, 3, 2, 2, 4, 2, 3, 4)
    println(solution.minOperations(nums))  // Output: 4
}
