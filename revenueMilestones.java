
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int[] getMilestoneDays(int[] revenues, int[] milestones) {
  // Write your code here
    int i=0,j=0;

    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
    for(int x : milestones)
    {
      pq.add(new int[]{x,i});
      i++;
      System.out.println(pq);
    }
    i = 0;
    int n = revenues.length, m = milestones.length;
    int[] res = new int[m];
    int sum =0;
    while(i < n && !pq.isEmpty())
    {
      sum += revenues[i];
      while(!pq.isEmpty() && sum >= pq.peek()[0])
      {
        res[pq.poll()[1]] = i+1;
      }
      i++;
    }
    while(!pq.isEmpty())
    {
      res[pq.poll()[1]] = -1;
    }
    return res;
    
  }
