
// You are given an array arr of N integers. For each index i, you are required to determine the number of contiguous subarrays that fulfill the following conditions:
// The value at index i must be the maximum element in the contiguous subarrays, and
// These contiguous subarrays must either start from or end on index i.


import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int[] countSubarrays(int[] arr) {
    // Write your code here
    
    
    // create an array to store it all in 
    int [] ans = new int[arr.length];
    
    // go through the array 
    for (int i = 0; i < arr.length; i++) {
     // start at 1 cause even if you have "no" sub arrays that one num will be its own subarray; 
      
      int count = 1;
      int currentMax = arr[i];
      
      // checking the next iteration
      for (int j = i + 1; j < arr.length; j++) {
        
        if (arr[j] < currentMax) {
          count++;
        } else{
          break;
        }
          
      }
      for (int k = i - 1; k >= 0; k--) {
        
        if (arr[k] < currentMax) {
          count++;
        }else{
          break;
        }
      }
      // store it all in this new array
      ans[i] = count;
    }
    
    return ans;
  }
