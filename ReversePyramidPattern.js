/*
Input Format: N = 3
Result: 
*****  
 ***
  *   
Input Format: N = 6
Result:     
***********
 *********
  *******
   ***** 
    ***    
     *
*/

let n = 6;
for(let i = 6; i >= 0; i--){
    let arr = [];
    for(let j = 0; j <= n-i-1; j++){
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
