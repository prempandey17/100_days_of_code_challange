problem:  
     Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

     0 <= a, b, c, d < n
     a, b, c, and d are distinct.
     nums[a] + nums[b] + nums[c] + nums[d] == target
     You may return the answer in any order.

 

Test Case 1:

      Input: 
             nums = [1,0,-1,0,-2,2], target = 0
      Output:
             [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Test Case 2:

       Input: 
              nums = [2,2,2,2,2], target = 8
        Output:

              [[2,2,2,2]]
 

Constraints:

        1 <= nums.length <= 200
        -109 <= nums[i] <= 109
          -109 <= target <= 109


 Logics: 
      class Solution {
            public List<List<Integer>> fourSum(int[] nums, int target) {
        
             int n = nums.length;
             if (n < 4) return new ArrayList<>(); // it'd still be handled even if we don't write this condition
             Arrays.sort(nums);

              Set<List<Integer>> ans = new HashSet<>();

               for (int i = 0; i < n; i++) 
                   for (int j =  i + 1; j < n; j++) 
                         for (int k =  j + 1; k < n; k++) 
                             for (int l = k + 1; l < n; l++) 
                                   if (nums[i] + nums[j] + nums[k] + nums[l] == target) 
                                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

        return new ArrayList(ans);
    }
}

