/*
Input Format: N = 3
Result: 
  *  
 ***
***** 
*****  
 ***
  *   
Input Format: N = 6
Result:   
     *
    ***
   ***** 
  *******
 *********
***********  
***********
 *********
  *******
   ***** 
    ***    
     *

You can also write these two for loops in seperate functions or use code from reversed pyramid and pyramid files
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
for(let i = n-1; i >= 0; i--){
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
