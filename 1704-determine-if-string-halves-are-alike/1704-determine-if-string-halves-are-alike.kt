class Solution {
    fun halvesAreAlike(s: String): Boolean {
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        
        fun countVowels(str: String): Int {
            return str.count { it in vowels }
        }
        
        val length = s.length
        val firstHalf = s.substring(0, length / 2)
        val secondHalf = s.substring(length / 2)
        
        val countFirstHalf = countVowels(firstHalf)
        val countSecondHalf = countVowels(secondHalf)
        
        return countFirstHalf == countSecondHalf
    }
}

fun main() {
    val solution = Solution()
    println(solution.halvesAreAlike("book")) 
}
