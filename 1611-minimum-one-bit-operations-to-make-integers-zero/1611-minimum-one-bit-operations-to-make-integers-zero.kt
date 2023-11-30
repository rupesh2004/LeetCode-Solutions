class Solution {
    fun minimumOneBitOperations(n: Int): Int {
        if (n == 0) {
            return 0
        }
        
        var x = 1
        while (x * 2 <= n) {
            x = x shl 1
        }
        
        return minimumOneBitOperations(n xor (x or (x shr 1))) + 1 + x - 1
    }
}
