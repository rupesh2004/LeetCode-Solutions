class Solution {
    fun isPathCrossing(path: String): Boolean {
        val visited = HashSet<Pair<Int, Int>>()
        var x = 0
        var y = 0
        visited.add(Pair(x, y))

        for (direction in path) {
            when (direction) {
                'N' -> y++
                'S' -> y--
                'E' -> x++
                'W' -> x--
            }

            val currentPos = Pair(x, y)
            if (visited.contains(currentPos)) {
                return true
            }

            visited.add(currentPos)
        }

        return false
    }
}
