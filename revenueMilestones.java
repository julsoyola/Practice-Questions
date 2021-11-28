
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int[] getMilestoneDays(int[] revenues, int[] milestones) {
 // Write your code here
    int[] milestoneDays = new int[milestones.length];
    Arrays.fill(milestoneDays, -1);
    Map<Integer, Integer> idx = new HashMap<>();
    for(int i=0; i<milestones.length; i++) {
      idx.put(milestones[i], i);
    }
    
    Arrays.sort(milestones);
    
    int j=0;
    int sum = 0;
    for(int i=0; i<revenues.length; i++) {
      sum += revenues[i];
      while(j < milestones.length && sum >= milestones[j]){
        milestoneDays[idx.get(milestones[j])] = i+1;
        j++;
      }
    }
    return milestoneDays;
    
  }
