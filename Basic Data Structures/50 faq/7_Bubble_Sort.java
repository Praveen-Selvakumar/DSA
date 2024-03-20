import java.util.*;
   
   
 class Temp {
	  
	 // Meant as sinking  Sort
   // Because it will sink big element at last 	  
	  
	   public static int[] bubble_sort(){
		    int[] a  = {16, 67, 8 , 4, 6, 2, 1};
			
			boolean isSwapped = false;
			
			for(int i=0; i<a.length; i++){
				isSwapped = false;
				for(int j=0; j<a.length-1-i; j++){
					 if(a[j] > a[j+1]){
						 int temp = a[j];
						 a[j] = a[j+1];
						 a[j+1]  = temp;
						 isSwapped = true;
					 }
				}
				if(isSwapped == false)break;
			}
			
			return a;
			
		   
	   }
	 
	   
	  
	 
	public static void main(String[] args){
		   Temp cn  = new Temp();
		  	    
				
		   System.out.println(" Sorted Array : "+Arrays.toString(bubble_sort()));
		  
		  
		 
	
   }
 
 }
 
