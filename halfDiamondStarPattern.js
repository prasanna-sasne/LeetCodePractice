/*
Input Format: N = 3
Result: 
  *  
  **
  ***  
  **
  *   
Input Format: N = 6
Result:   
     *
     **
     *** 
     ****
     *****
     ******  
     *****
     ****
     ***    
     **
     *
*/

function method1(n){
  for(let i = 0; i < n; i++){
      let arr = [];
      for(let j = 0; j <= i; j++){
          arr.push('*');
      }
      console.log(arr.join(' '));
  }
  for(let i = 1; i < n; i++){
      let arr = [];
      
      for(let j = 0; j < n-i; j++){
          arr.push('*');
      }
      
      console.log(arr.join(' '));
  }
}
function method2(n){
  let n = 3;
  for(let i = 1; i <= 2*n-1; i++){
      let stars = i;
      if(stars>=n) stars = 2*n-i;
      let arr = [];
      for(let j = 1; j <= stars; j++){
          arr.push('*');
      }
      console.log(arr.join(' '));
  }
}

