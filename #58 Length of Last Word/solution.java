class Solution {
    public int lengthOfLastWord(String s) {
         /*String[] split = s.split(" ");  
         int min = Integer.MAX_VALUE;
         for(int i=0; i < split.length; i++){
             String temp = split[i].trim();
             if(temp.length() > 0)
                 min = split[i].length();
         }        
        return min;*/
        
        int length = 0;
         for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(length > 0) return length;
                continue;
            } else {
              length++;  
            }     
         }
        return length;
    }
}