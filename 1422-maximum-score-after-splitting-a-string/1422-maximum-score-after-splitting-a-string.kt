class Solution {
    fun maxScore(s: String): Int {
        var maxScore = 0
        var leftZeros = 0
        var rightOnes = s.count { it == '1' }
        for (i in 0 until s.length - 1) {
            if (s[i] == '0') {
                leftZeros++
            } else {
                rightOnes--
            }

            val currentScore = leftZeros + rightOnes
            maxScore = maxOf(maxScore, currentScore)
        }

        return maxScore
    }
}

fun main() {
    val solution = Solution()
    println(solution.maxScore("011101"))
}
