// https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
 
    if(nums == null){
        return;
    }

   for(int i=0; i<nums.length; i++){
		  if(nums[i] == 0){
			  for(int j=i+1; j<nums.length; j++){
				   if(nums[j] != 0){
					   int temp = nums[i];
					   nums[i] = nums[j];
					   nums[j] = temp;
                       break;
				   }
			  }
		  }		
	   }
	   
     
    }

}
