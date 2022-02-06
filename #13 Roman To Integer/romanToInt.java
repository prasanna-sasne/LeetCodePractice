class Solution {
    
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while(i!=s.length()){
            switch(s.charAt(i)){
                case 'I' : sum = sum + 1;
                    break;
                //check if it is IV, then add 4 - 1 = 3 as 1 is already added     
                case 'V': if(i!=0 && s.charAt(i-1)=='I') sum = sum+3; 
                          else sum = sum + 5;
                    break;
                //check if it is IX, then add 9 - 1 = 8 as 1 is already added
                case 'X': if(i!=0 && s.charAt(i-1)=='I') sum = sum+8; 
                          else sum = sum + 10;
                    break;
                case 'L': if(i!=0 && s.charAt(i-1)=='X') sum = sum+30; 
                          else sum = sum + 50;
                    break;
                case 'C': if(i!=0 && s.charAt(i-1)=='X') sum = sum+80; 
                          else sum = sum + 100;
                    break;
                case 'D': if(i!=0 && s.charAt(i-1)=='C') sum = sum+300; 
                          else sum = sum + 500;
                    break;
                case 'M': if(i!=0 && s.charAt(i-1)=='C') sum = sum+800; 
                          else sum = sum + 1000;
                    break;
            }    
            i++;
        }
        return sum;
    }
}