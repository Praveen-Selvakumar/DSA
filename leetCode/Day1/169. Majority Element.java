//https://leetcode.com/problems/majority-element/description/ 

class Solution {
    public int majorityElement(int[] nums) {
        int[] a = nums;
		
		int count = 0;
		int maxCount  = 0;
		int value = 0;
		
		ArrayList<Integer> list  = new ArrayList<>();
		
		for(int i=0 ; i< a.length; i++){
			if(!list.contains(a[i])){
				list.add(a[i]);
				for(int j=0; j < a.length; j++){
				 if(a[i] == a[j]){
					count++;
				 }
			   }
			   
			   if(count > maxCount){
				 maxCount = count;
				 value = a[i];
			    }
				
				count = 0;
			   
			}
			
			
		}
		
		return value;
    }
}
