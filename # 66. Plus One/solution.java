class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int len = digits.length-1;
        int[] result = new int[len+2];
        
        int i;
        for(i = len; i>= 0; i--){
            int sum = digits[i] + carry;
            if(i == len) sum = sum+1;
            carry = sum > 9? 1:0;
            
            digits[i] = sum%10;
        }
        if(carry > 0){
            for(int j=1; j <= digits.length; j++){
               result[j] =  digits[j-1];
            }
            result[0] = carry;
            return result;
        }
        return digits;
    }
}