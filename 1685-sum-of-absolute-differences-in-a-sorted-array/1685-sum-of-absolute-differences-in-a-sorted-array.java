class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len = nums.length;
        int[] newArray = new int[len];

        int[] prefixSum = new int[len];
        int[] suffixSum = new int[len];

        prefixSum[0] = nums[0];
        suffixSum[len - 1] = nums[len - 1];

        for (int i = 1; i < len; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
            suffixSum[len - 1 - i] = suffixSum[len - i] + nums[len - 1 - i];
        }

        for (int i = 0; i < len; i++) {
            int leftSum = i * nums[i] - (i > 0 ? prefixSum[i - 1] : 0);
            int rightSum = (i < len - 1 ? suffixSum[i + 1] : 0) - (len - 1 - i) * nums[i];
            newArray[i] = leftSum + rightSum;
        }

        return newArray;
    }

    public static void main(String ar[]) {
        int[] a = {2, 3, 5};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.getSumAbsoluteDifferences(a)));
    }
}
