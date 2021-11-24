// ------------------------------------------
// n^2 solution
  int[] findSignatureCounts(int[] arr) {
    // Write your code here
    
    // you are given yearbooks 1 - n
    // pass the yearbooks around
    
    // i each student will sign the yearbook
    // then pass the students [i - 1]
    // [i - 1] = i
    // 
    
    // create an array to store the result
    int[] result  = new int[arr.length];
    
    // n is the the array length
    
    // since it started w 2 they sign their own they get student2 sign it then they get theirs back.2 sig
    
    int count = 1;
    // they will always sign their own year book
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = i + 1; j < arr.length; j++)
      {
        if(arr[i] > arr[j])
        {
            count++;
        }
        else
        {
          continue; 
        }
       
      }
      
       result[i] = count;
    }
    
    return result;
  }
//-------------------------------------------
// Better Solution:
public static void main(String[] args) {
	int[] nums1 = {2, 1};
	int[] nums2 = {1, 2};
	System.out.println(Arrays.toString(solve(nums1)));
	System.out.println(Arrays.toString(solve(nums2)));
}
private static int[] solve(int[] nums) {
	int[] res = new int[nums.length];
	Map<Integer, Integer> map = new HashMap<>();
	for(int i=0;i<nums.length;i++) {
		map.put(nums[i], i+1);
	}
	Set<Integer> visited = new HashSet<>();
	for(int k : map.keySet()) {
		if(!visited.contains(k)) {
			Set<Integer> round = new HashSet<>();
			while(!visited.contains(k)) {
				round.add(k);
				visited.add(k);
				k = map.get(k);
			}
			for(int i : round) {
				res[i-1] = round.size();
			}
		}
	}
	return res;
}
