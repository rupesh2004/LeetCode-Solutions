class Solution {
    fun minOperations(s: String): Int {
        var count1 = 0
        var count2 = 0
        
        for ((index, char) in s.withIndex()) {
            val expectedChar1 = if (index % 2 == 0) '0' else '1'
            val expectedChar2 = if (index % 2 == 0) '1' else '0'
            
            if (char != expectedChar1) {
                count1++
            }
            if (char != expectedChar2) {
                count2++
            }
        }
        return minOf(count1, count2)
    }
}
