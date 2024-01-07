import java.util.*;
   
   
   
@SuppressWarnings("unchecked")
class Pattern8{
 
 
  

  public static void main(String[] args){
	 
	 Temp cn  = new Temp();
	 
	  
	  int i=0 , j=0;
	  
	  int count = 0;
	  
	   while(i< 5){
		  while(j < 5){
			  count++;
			  System.out.print(count+" ");
			  j++;
		  } 
		  j=0;
		  i++;
		  System.out.println();
	  }
	 
	 
  }
}
