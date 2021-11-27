import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int minOverallAwkwardness(int[] nums) {
    // Write your code here
   Arrays.sort(nums);
        int len = nums.length;
    
    // sorted 5,6,8,10
    // 6, 10, 8, 5

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = len-1; i >= 0; i--){
            if (i % 2 == 0) {
                list.addLast(nums[i]);
            }else{
                list.addFirst(nums[i]);
            }
        }
        System.out.println(list);
        int max = 0;
        int prev = list.get(len-1);
        for (int i=0; i < len; i++){
            max = Math.max(Math.abs(list.get(i)-prev), max);
            prev = list.get(i);
        }

        return max;
    
  }
