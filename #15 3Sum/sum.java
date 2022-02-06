class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List < List < Integer >> result = new ArrayList < > ();
        
        for(int i = 0; i+2 < nums.length; i++){
            //skip duplicate from left
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int secondIndex = i+1;
            int thirdIndex = nums.length-1;
          
            while(secondIndex < thirdIndex){
                int sum = nums[i] + nums[secondIndex] + nums[thirdIndex];
                if(sum == 0){
                result.add(Arrays.asList(nums[i], nums[secondIndex],
                                            nums[thirdIndex--]));
                //skip duplicates from right
                while (secondIndex < thirdIndex && nums[thirdIndex] == nums[thirdIndex + 1])                            thirdIndex--;
                }
                else if(sum > 0) thirdIndex--;
                else secondIndex++;
            }
        }
        return result;
    }
}