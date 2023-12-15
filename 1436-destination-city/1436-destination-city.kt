class Solution {
    fun destCity(paths: List<List<String>>): String {
        val startingCities = paths.map { it[0] }.toSet()
        val destinationCities = paths.map { it[1] }.toSet()

        return destinationCities.minus(startingCities).first()
    }
}
