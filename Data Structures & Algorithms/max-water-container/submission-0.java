class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;
        
        while (l < r) {
            int area = 0;

            if (heights[l] > heights[r]) {
                area = heights[r] * (r - l);
                r--;
            } else {
                area = heights[l] * (r - l);
                l++;
            }

            if (area > max) {
                max = area;
            }
        }

        return max;
    }
}
