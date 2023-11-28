class Solution {
    fun numberOfWays(corridor: String): Int {
        val kMod = 1_000_000_007L
        var ans = 1L
        var prevSeat = -1
        var numSeats = 0

        for (i in corridor.indices) {
            if (corridor[i] == 'S') {
                if (++numSeats > 2 && numSeats % 2 == 1) {
                    ans = ans * (i - prevSeat) % kMod
                }
                prevSeat = i
            }
        }

        return if (numSeats > 1 && numSeats % 2 == 0) ans.toInt() else 0
    }
}
