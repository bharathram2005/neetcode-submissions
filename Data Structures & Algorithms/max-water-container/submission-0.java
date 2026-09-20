class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxWater = 0;

        while (left <= right){ 
            int water = Math.min(heights[left], heights[right]) * (right - left);
            if (water > maxWater) {
                maxWater = water;
            }
            if (heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
    
}

