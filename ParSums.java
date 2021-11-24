
// Pair Sums
// Given a list of n integers arr[0..(n-1)], determine the number of different pairs of elements within it which sum to k.
// If an integer appears in the list multiple times, each copy is considered to be different; that is, two pairs are considered different if one pair includes at least one array index which the other doesn't, even if they include the same values.


import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int numberOfWays(int[] arr, int k) {
    // Write your code here
    // so n is just k -1 
    int length = k - 1;
    int count = 0;
    int sum;
    
    // determine whether any of the numbers in the array sum up to k : )
    for (int i = 0; i < length; i++)
    {
      for (int j = i + 1; j < length; j++)
      {
        sum = arr[i] + arr[j];
        if (sum == k)
        {
          count++;
        }
      }
    }
    
    return count; 
    
  }

