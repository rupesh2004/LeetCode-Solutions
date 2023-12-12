class Solution {
    fun maxProduct(nums: IntArray): Int {
        var max1 = 0
        var max2 = 0
        
        for (num in nums) {
            if (num > max1) {
                max2 = max1
                max1 = num
            } else if (num > max2) {
                max2 = num
            }
        }
   
        return (max1 - 1) * (max2 - 1)
    }
}

fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(3, 4, 5, 2)
    println(solution.maxProduct(nums1)) 
}
