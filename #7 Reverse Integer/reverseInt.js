/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let signInteger = 1;
    let result = 0;
    const minIntegerNumber = Math.pow(-2, 31); 
    const maxIntegerNumber = Math.pow(2, 31) - 1; 

    if(x < 0){
       signInteger = -1;
       x = x * signInteger; 
    }
    
    
    while(x > 0){
        let digit = x % 10;
        result = result*10 + digit;
        x = Math.floor(x/10);
    }
   
     if(result*signInteger > maxIntegerNumber || 
        result*signInteger < minIntegerNumber) return 0;
    
    return result * signInteger;
};