class Solution {
    fun knightDialer(n: Int): Int {
        val MOD = 1_000_000_007
        val moves = arrayOf(
            intArrayOf(4, 6),
            intArrayOf(6, 8),
            intArrayOf(7, 9),
            intArrayOf(4, 8),
            intArrayOf(0, 3, 9),
            intArrayOf(),
            intArrayOf(0, 1, 7),
            intArrayOf(2, 6),
            intArrayOf(1, 3),
            intArrayOf(2, 4)
        )

        val dp = Array(n + 1) { LongArray(10) }
        for (j in 0..9) {
            dp[1][j] = 1
        }

        for (i in 2..n) {
            for (j in 0..9) {
                for (move in moves[j]) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][move]) % MOD
                }
            }
        }

        var result = 0L
        for (j in 0..9) {
            result = (result + dp[n][j]) % MOD
        }

        return result.toInt()
    }
}
