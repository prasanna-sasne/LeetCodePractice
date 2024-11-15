/*
Input Format: N = 3
Result: 
  *  
 *** 
*****   
Input Format: N = 6
Result:
     *     
    ***    
   *****   
  *******  
 ********* 
***********

As we can observe, each row has a pattern of spaces followed by stars, and then more spaces, creating a pyramidal shape. For example, in the first row (i = 0), there are 4 spaces, 
followed by 1 star, and then 4 more spaces. In the second row (i = 1), there are 3 spaces, followed by 3 stars, and then 3 more spaces. Based on this, we can deduce that each row has N - i - 1 spaces, 
followed by 2 * i + 1 stars, and then again N - i - 1 spaces. To implement this, we simply need to run three nested loops: the first loop prints the spaces, the second loop prints the stars, 
and the third loop prints the spaces again.
*/

let n = 6;
for(let i = 0; i < n; i++){
    let arr = [];
    for(let j = 0; j < n-i-1; j++){
        arr.push(' ');
    }
    for(let j = 0; j < 2*i+1; j++){
        arr.push('*');
    }
    for(let j = 0; j < n-i-1; j++){
        arr.push(' ');
    }
    console.log(arr.join(' '));
}
