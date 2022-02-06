class Solution {
    private class romanBuilder{
        String symbol;
        int value;
        romanBuilder(int val, String s){
            this.symbol = s;
            this.value = val;
        }
    }
    
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        romanBuilder arr[] = new romanBuilder[13];
        arr[0] = new romanBuilder(1, "I");
        arr[1] = new romanBuilder(4, "IV");
        arr[2] = new romanBuilder(5, "V");
        arr[3] = new romanBuilder(9, "IX");
        arr[4] = new romanBuilder(10, "X");
        arr[5] = new romanBuilder(40, "XL");
        arr[6] = new romanBuilder(50, "L");
        arr[7] = new romanBuilder(90, "XC");
        arr[8] = new romanBuilder(100, "C");
        arr[9] = new romanBuilder(400, "CD");
        arr[10] = new romanBuilder(500, "D");
        arr[11] = new romanBuilder(900, "CM");
        arr[12] = new romanBuilder(1000, "M");
        
        int romanIndex = 12;
        while(num > 0){
            if(arr[romanIndex].value > num){
                romanIndex--;
            } else {
                num = num - arr[romanIndex].value;
                result.append(arr[romanIndex].symbol);
            }
        }
        return result.toString();
    }
}