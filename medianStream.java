// Median Stream
// You're given a list of n integers arr[0..(n-1)]. You must compute a list output[0..(n-1)]
// such that, for each index i (between 0 and n-1, inclusive), output[i] is equal to the median of the 
// elements arr[0..i] (rounded down to the nearest integer).
// The median of a list of integers is defined as follows. If the integers were to be sorted, then:

class Main {

  // Add any helper functions you may need here
  

  int[] findMedian(int[] arr) {
    // Write your code here
     PriorityQueue<Integer> large = new PriorityQueue<Integer>(Comparator.reverseOrder());
     PriorityQueue<Integer> small = new PriorityQueue<Integer>();
     int[] output = new int[arr.length];
     for(int i =0;i<arr.length;i++){
        if((i+1)%2 ==0){
          large.add(arr[i]);
          // getting and removing the top element
          small.add(large.poll());
          
          // gettting the largest from the small and large queues
          output[i] = (int)((small.peek()+ large.peek())/2);
          //System.out.println(i+" "+output[i]);
        }
        else{
          small.add(arr[i]);
          large.add(small.poll());
          output[i] = large.peek();
          //System.out.println(i+" "+ arr[i]+"  "+output[i]);
      }
      
    }
    return output;
  }
