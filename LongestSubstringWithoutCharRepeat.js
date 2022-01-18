/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let start = 0;
    let end = 0;
    let max = 0;
    let currLen = 0;
    let myMap = new Map();
    
    for(let i = 0; i < s.length; i++){
        if(myMap.has(s[i]) && myMap.get(s[i]) >= start){
            start = myMap.get(s[i]) + 1;
        }
        myMap.set(s[i], i);
        end = i;
        currLen = end - start;
        if(currLen > max){
            max = currLen;
        }
    }
    max = s == ''? 0: max+1;
    return max;
};
