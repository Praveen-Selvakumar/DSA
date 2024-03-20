import java.util.*;
   
   
 class Temp {
	  
	  
	    // Playing cards 
		// Taking out one card comparing with all and merging
	  
	   
	    public static  int[] insertion_sort(){
			 int[] a  = {5, 4, 3, 2, 1};
			  
			  
			 for(int i=1; i<a.length; i++){
				 int temp = a[i];
				 int j = i-1;
				 
				 System.out.println("index = "+i+", element = "+a[i]);
				 
				 while(j >=0 && a[j] > temp){
					 a[j+1] = a[j];
					 j = j-1;
				 }
				 
				 a[j+1] = temp;
			 }
			 
			 return a;
			 
		}
	 
	  
	public static void main(String[] args){
		   Temp cn  = new Temp();
		   
		   System.out.println(Arrays.toString(insertion_sort()));
		 
   }
 
 }
 
