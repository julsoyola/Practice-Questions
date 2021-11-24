

// You have N bags of candy. The ith bag contains arr[i] pieces of candy, and each of the bags is magical!
// It takes you 1 minute to eat all of the pieces of candy in a bag (irrespective of how many pieces of candy are inside), and as soon as you finish, the bag mysteriously refills. If there were x pieces of candy in the bag at the beginning of the minute, then after you've finished you'll find that floor(x/2) pieces are now inside.
// You have k minutes to eat as much candy as possible. How many pieces of candy can you eat?

// Runtime: O(n)log(n)

import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int maxCandies(int[] arr, int k) {
   // Write your code here
    PriorityQueue<Integer> maxValue = new PriorityQueue<>(Collections.reverseOrder());
    
    // nlog(n)
    for(int i : arr) {
      maxValue.add(i);
    }
    // klog(k);
    int sum = 0;
    while(k > 0) {
      // gets the head and deletes it
      int cur =  maxValue.poll();
      sum += cur;
      maxValue.add(cur/2);
      // decerement the mins
      k--;
    }
   
    return sum;
  }
