class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()

        var contentChildren = 0
        var childIndex = 0
        var cookieIndex = 0

        while (childIndex < g.size && cookieIndex < s.size) {
            if (s[cookieIndex] >= g[childIndex]) {
                contentChildren++
                childIndex++
            }
            cookieIndex++
        }

        return contentChildren
    }
}
