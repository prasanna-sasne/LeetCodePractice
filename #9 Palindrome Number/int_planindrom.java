class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int y = 0;
        while(x > 0){
            y = y*10 + x%10;
            x /=10;
        }
        return original == y;
    }
}