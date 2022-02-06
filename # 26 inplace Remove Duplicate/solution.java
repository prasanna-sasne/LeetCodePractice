class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            else {
                count++;
                nums[index++] = nums[i];
            }
        }
        return count;
    }
}