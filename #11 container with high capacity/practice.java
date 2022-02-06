class Solution {
    public int maxArea(int[] height) {
        int maxCapacity = -1;
        int left = 0;
        int right = height.length -1;
        
        while(left < right){
            int capacity = Math.min(height[left], height[right]) * (right - left);
            
            maxCapacity = Math.max(maxCapacity, capacity);
            if(height[left] < height[right]) left++;
            else right--;
        }
        
        return maxCapacity;
    }
}