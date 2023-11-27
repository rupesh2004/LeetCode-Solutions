class Solution {
    fun countHomogenous(s: String): Int {
        val kMod = 1_000_000_007
        var ans = 0
        var count = 0
        var currentChar = '@'

        for (c in s.toCharArray()) {
            count = if (c == currentChar) count + 1 else 1
            currentChar = c
            ans += count
            ans %= kMod
        }

        return ans
    }
}
