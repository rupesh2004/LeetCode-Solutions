class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        val concatinatedword1= word1.joinToString("")
        val concatinatedword2= word2.joinToString("")

        return concatinatedword1==concatinatedword2
    }
    fun main(){
        val solution = Solution()
        val word1_1 : Array<String> = arrayOf("a", "bc")
        val word2_1 : Array<String> = arrayOf("a", "cb")
        println(solution.arrayStringsAreEqual(word1_1, word2_1))
    }
}