Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores)




class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
         if (n == 0) return 0;
    int i = 0;
    for (int j = 1; j < n ; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
    }





public int removeDuplicates(int[] nums) {
        
    if (nums == null) {
      return 0;
  }
   int w = 1;

  for (int r = 1; r < nums.length; r++) {
      
	  if (nums[r] != nums[r - 1]) {
          
          nums[w] = nums[r];
         
          w++;
      }
  }
       return w;
}



===================================================================


Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]



public void moveZeroes(int[] nums) {
int j = 0;
for(int i = 0; i < nums.length; i++){
if(nums[i] != 0){
nums[j]= nums[i];
j++;
}
}
for(;j<nums.length; j++){
nums[j] = 0;
}
}



=============================================================
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int j = 0;

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[j++] = A[i];

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[j++] = A[i];

        return ans;
    }
}





=================================================================
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).


public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
}




=================================================================
height checkeer

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.


class Solution {
  public int heightChecker(int[] A) {
    int[] nums = Arrays.copyOf(A, A.length);
    Arrays.sort(nums);
    int count = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] != nums[i]) {
        count++;
      }
    }
    return count;
  }
}

