class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty()) return 0;
        long result = 0;
        int sign = 1;
        int i = 0, n = s.length();
        
        //get rid of leading white space
        while (i < n && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        
        //check sign bits
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        
        while(i < n && Character.isDigit(s.charAt(i))){
            result = result * 10 + Character.getNumericValue(s.charAt(i++));
            if(result*sign > Integer.MAX_VALUE || result*sign < Integer.MIN_VALUE)
                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        
        return (int)(result * sign);
    }
}