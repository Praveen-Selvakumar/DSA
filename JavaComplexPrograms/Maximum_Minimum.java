import  java.util.*;




class Maximum_Minimum{
 
    
 
    public static void main(String[] args){
	 
	  int[] a  = {23, 4, 5,89, 78};
	  
	  int temp_max = a[0];
	  int temp_min = a[0];
	  
	   for(int i=0; i < a.length; i++){
	      if(temp_max < a[i]){
		     temp_max = a[i];
		  }
		  if(temp_min > a[i]){
			  temp_min = a[i];			  
		  }
	    }
		
		System.out.println(" Larget element is : "+ temp_max + ",  Smallest element is : " + temp_min);
		
		
		 
	
	}
  
}