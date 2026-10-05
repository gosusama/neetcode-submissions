class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        } 

        Arrays.sort(nums);
        int result = 0;
        int temp = 1;

        for (int i = 1; i < n; i++) {
            int diff = nums[i] - nums[i - 1];
            if (diff == 1) {
                temp++;
            } else if (diff == 0) {
                continue;
            } else {
                result = Math.max(result, temp);
                temp = 1;
            }
        }

        return Math.max(result, temp);
    }
}
