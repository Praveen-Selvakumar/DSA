import java.util.*;
   
   
 class Temp {
 
	   public static int binary_search(){
		   int[] a  = {11, 22, 23, 32 ,34, 35};
		   int target = 32;
		   int low = 0;
		   int high = a.length-1;
		   
		   while(low <= high){
			   int mid = (low+high)/2;
			   if(a[mid] == target)return mid;
			   if(a[mid] >  target){
				   high = mid-1;
			   }else{
				   low = mid+1;
			   }
		   }
		   
		   return -1;
		   
	   }
	 
	   
	  
	 
	public static void main(String[] args){
		   Temp cn  = new Temp();
		  	    
				System.out.println(" Matching Index : "+binary_search());
		   
   }
 
 }
 
