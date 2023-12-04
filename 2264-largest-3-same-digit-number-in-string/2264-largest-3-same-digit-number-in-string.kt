class Solution {
    fun largestGoodInteger(num: String): String {
        var maxGoodInteger = ""
        
        for (i in 0 until num.length - 2) {
            val currentSubstring = num.substring(i, i + 3)
            if (currentSubstring[0] == currentSubstring[1] && currentSubstring[1] == currentSubstring[2]) {
                if (currentSubstring > maxGoodInteger) {
                    maxGoodInteger = currentSubstring
                }
            }
        }
        
        return maxGoodInteger
    }
}

fun main() {
    val solution = Solution()
    
    // Example 1
    println(solution.largestGoodInteger("6777133339")) 
    
    // Example 2
    println(solution.largestGoodInteger("2300019"))   
    
    // Example 3
    println(solution.largestGoodInteger("42352338"))     // Output: ""
}
