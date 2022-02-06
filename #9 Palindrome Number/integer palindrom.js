/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let sign = 1;
    if(x < 0) sign = -1;
    
    let originalX = x;
    let result = 0;
    while(x > 0){
        result = result * 10 + x%10;
        x = Math.floor(x/10);
    }
    return sign*result == originalX;
};