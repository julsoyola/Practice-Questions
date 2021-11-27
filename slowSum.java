
// Example
// arr = [4, 2, 1, 3]
// output = 26
// First, add 4 + 3 for a penalty of 7. Now the array is [7, 2, 1]
// Add 7 + 2 for a penalty of 9. Now the array is [9, 1]
// Add 9 + 1 for a penalty of 10. The penalties sum to 26.




import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int getTotalTime(int[] arr) {
    // Write your code here
    
   int penalty = 0;
   Arrays.sort(arr);

    // since sum already equals the last num we start by adding that 
   int sum = arr[arr.length - 1];
    
   for (int i = arr.length - 2; i >= 0; i--)
   {
     sum += arr[i];
    
     penalty += sum;
     // just debug to see whats going on
      System.out.println(sum+ " [] " +arr[i]+ " = " +penalty);
   }
    
    return penalty;
  }
