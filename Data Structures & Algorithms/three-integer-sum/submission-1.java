class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                if (k < n - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                int s = nums[i] + nums[j] + nums[k];
                if (s == 0) {
                    result.add(Arrays.asList(new Integer[] {nums[i], nums[j], nums[k]}));
                    k--;
                } else if (s > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return result;
    }
}
