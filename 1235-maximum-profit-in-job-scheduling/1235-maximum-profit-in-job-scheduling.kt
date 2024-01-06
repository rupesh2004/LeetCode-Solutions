class Solution {
    fun jobScheduling(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
        val jobs = mutableListOf<Triple<Int, Int, Int>>()

        for (i in startTime.indices) {
            jobs.add(Triple(startTime[i], endTime[i], profit[i]))
        }

        jobs.sortBy { it.second }

        val dp = IntArray(jobs.size)

        for (i in jobs.indices) {
            var lastNonOverlapping = -1
            for (j in i - 1 downTo 0) {
                if (jobs[j].second <= jobs[i].first) {
                    lastNonOverlapping = j
                    break
                }
            }

            val includeCurrent = jobs[i].third + (if (lastNonOverlapping != -1) dp[lastNonOverlapping] else 0)
            val excludeCurrent = if (i > 0) dp[i - 1] else 0

            dp[i] = maxOf(includeCurrent, excludeCurrent)
        }

        return dp.last()
    }
}

fun main() {
    val solution = Solution()

    val startTime1 = intArrayOf(1, 2, 3, 3)
    val endTime1 = intArrayOf(3, 4, 5, 6)
    val profit1 = intArrayOf(50, 10, 40, 70)
    println(solution.jobScheduling(startTime1, endTime1, profit1)) 
}
