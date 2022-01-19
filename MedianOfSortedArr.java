class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] resultArr = new int[nums1.length + nums2.length];
        double sum = 0;
        int left = 0;
        int right = 0;
        for(int i = 0; i < resultArr.length; i++){
            if(left >= nums1.length){
                resultArr[i] = nums2[right++];
            } else if(right >= nums2.length){
                resultArr[i] = nums1[left++];
            } else if(nums1[left] < nums2[right]){
                resultArr[i] = nums1[left++];
            } else {
                resultArr[i] = nums2[right++];
            }
        }
        if(resultArr.length%2 != 0){
            sum = resultArr[resultArr.length/2];
        } else {
            sum = (double)(resultArr[resultArr.length/2] + resultArr[resultArr.length/2 - 1])/2;
        }
        return sum;                    
    }
}
