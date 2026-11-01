class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        int[] stack = new int[n + 1];
        int top = -1; 
        
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];
         
            while (top != -1 && heights[stack[top]] >= currentHeight) {
                int h = heights[stack[top--]];
              
                int w = (top == -1) ? i : (i - stack[top] - 1);
                
                maxArea = Math.max(maxArea, h * w);
            }
            
            stack[++top] = i;
        }

        return maxArea;
    }
}