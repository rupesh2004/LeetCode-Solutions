class Solution {
    fun numDecodings(s: String): Int {
        val n = s.length
        if (n == 0) return 0

        val dp = IntArray(n + 1)
        dp[0] = 1
        dp[1] = if (s[0] == '0') 0 else 1

        for (i in 2..n) {
            val oneDigit = Integer.parseInt(s.substring(i - 1, i))
            val twoDigits = Integer.parseInt(s.substring(i - 2, i))

            if (oneDigit >= 1) {
                dp[i] += dp[i - 1]
            }

            if (twoDigits in 10..26) {
                dp[i] += dp[i - 2]
            }
        }

        return dp[n]
    }
}
