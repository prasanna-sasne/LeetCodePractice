class Solution {
  public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int sum = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i+2 < nums.length; i++){
            int secondIndex = i+1;
            int thirdIndex = nums.length-1;
            while(secondIndex < thirdIndex){
                int total = nums[i] + nums[thirdIndex] + nums[secondIndex];
                if(total == target) return total;
                else if(total < target){
                    secondIndex++;

                    if(Math.abs(target - total) < diff){
                        sum = total;
                        diff = target - total;
                    }
                } else {
                    thirdIndex--;
                    if(total-target < diff){
                        sum = total;
                        diff = total-target;
                    }

                }
            }

        }
        return sum;
    }
}