class Solution {
    fun minSteps(s: String, t: String): Int {
        val charCount = IntArray(26)

        // Count the frequency of each character in string s
        for (char in s) {
            charCount[char - 'a']++
        }

        // Decrement the count for each character in string t
        for (char in t) {
            charCount[char - 'a']--
        }

        // Calculate the total steps needed by summing half of the absolute values of remaining counts
        return charCount.map { kotlin.math.abs(it) }.sum() / 2
    }
}

fun main() {
    val solution = Solution()

    // Test cases
    println(solution.minSteps("bab", "aba")) // Output: 1
    println(solution.minSteps("leetcode", "practice")) // Output: 5
    println(solution.minSteps("anagram", "mangaar")) // Output: 0
}
