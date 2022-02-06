class Solution {
    public String longestCommonPrefix(String[] strs) {
       //This will sort the string array in lexicological format
        Arrays.sort(strs);
        
        int i = 0;
        //check first and last string, if matches so all in between strings are matched
        while(i < strs[0].length()){
            //check last string
            if(strs[strs.length-1].charAt(i) == strs[0].charAt(i))
                i++;
            else 
                break;
        }
        if(i == 0) return "";
        return strs[0].substring(0,i);
    }
}