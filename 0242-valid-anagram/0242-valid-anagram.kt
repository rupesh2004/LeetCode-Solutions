class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val sFreq = IntArray(26)
        val tFreq = IntArray(26)

        for (char in s) {
            sFreq[char - 'a']++
        }

        for (char in t) {
            tFreq[char - 'a']++
        }

        for (i in 0 until 26) {
            if (sFreq[i] != tFreq[i]) {
                return false
            }
        }

        return true
    }
}

fun main() {
    val solution = Solution()

    val result1 = solution.isAnagram("anagram", "nagaram")
    println("Example 1: $result1")
}
