



// Given two arrays A and B of length N, determine if there is a way to make A equal to B by reversing any subarrays from array B any number of time

import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  // ignore my comments, just my throught process

  boolean areTheyEqual(int[] array_a, int[] array_b) {
    // Write your code here
    // make array a = to b
    
    // return true if u can make it eaual to each other
    // i mean first thing i can check is the arrays the same length?? 
    
    Set<Integer> a = new HashSet<Integer>();
    Set<Integer> b = new HashSet<Integer>();
    
    if (array_a.length == array_b.length)
    {
      // now that theyre the same length we can go a step further
      // we could perm through both arrays 
      // or we can store it in a set
      // create 2 sets ^^^
      for (int A : array_a)
      {
        a.add(A);
      }
      for (int B : array_b)
      {
        b.add(B);
      }
      // now that theyre added in 
      // check if theyre equal to each other
      boolean result1 = a.containsAll(b);
      boolean result2 = a.equals(b);
      
      if (result1 == true && result2 == true) return true;
      
      else return false;
      
    }
    // if its not just return false right off the bat 
    else
    {
      return false;
    }
    
  }

