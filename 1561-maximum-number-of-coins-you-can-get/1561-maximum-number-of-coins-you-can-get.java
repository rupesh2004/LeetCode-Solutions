import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length / 3;
        int maxCoins = 0;

        for (int i = n; i < 3 * n; i += 2) {
            maxCoins += piles[i];
        }

        return maxCoins;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] piles1 = {2, 4, 1, 2, 7, 8};
        System.out.println(solution.maxCoins(piles1)); // Output: 9

        // Example 2
        int[] piles2 = {2, 4, 5};
        System.out.println(solution.maxCoins(piles2)); // Output: 4

        // Example 3
        int[] piles3 = {9, 8, 7, 6, 5, 1, 2, 3, 4};
        System.out.println(solution.maxCoins(piles3)); // Output: 18
    }
}
