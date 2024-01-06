import java.util.*;
   
   
   
@SuppressWarnings("unchecked")
class Temp{
 
 
 
 private int[] get_value(int nums[] , int target ){
	  if(nums.length == 0){return nums;}
	  
	  
	  for(int i=0; i < nums.length; i++){
		  for(int j = i+1; j < nums.length; j++){
			    if(nums[i]+nums[j] == target){
					return new int[]{i,j};
				}
		  }
	  }
	  
	  return nums;
 }
   
	 
    

  public static void main(String[] args){
	 
	 Temp cn  = new Temp();
	 
	  
	  int i=5, j=5; 
	 
	 while(i >=1){
		 while( j >=1){
			 if(i>=j){
				 System.out.print("* ");
			 }else{
				 System.out.print(" ");
			 }
			 j--;
		 }		
		 j=5;
		 i--;
         System.out.println();		 
	 }
	 
	 
	 
	 
  }
}