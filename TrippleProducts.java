


// You're given a list of n integers arr[0..(n-1)]. You must compute a list output[0..(n-1)] such that, for each index i (between 0 and n-1, inclusive), output[i] is equal to the product of the three largest elements out of arr[0..i] (or equal to -1 if i < 2, as arr[0..i] then includes fewer than three elements).
// Note that the three largest elements used to form any product may have the same values as one another, but they must be at different indices in arr.


import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int[] findMaxProduct(int[] arr) {
    // Write your code here
    // output i is the product of the last 3 elements 
    
    // make a new array to store the result;
    int[] products = new int[arr.length];
    // im just starting at index 2 of the array
    int result = 0;
    
    for (int i = 2; i < arr.length; i++)
    {
     
      
      result = arr[i] * arr[i - 1] * arr[i - 2];
      if (arr[i] == 1)
      {
        result = products[i - 1] * 1;
      }
        
      products[i] = result;
      
    
    }
     // lets do that after wards tho so we can use the original array 
     // if its the first 2 just make the result -1
   products[0] = -1;
   products[1] = -1;
    
    return products;
  }
