import java.util.*;
   
   
   
@SuppressWarnings("unchecked")
class Pattern13{ 
	
	
	public static void main(String[] args){
		   Temp cn  = new Temp();
		   
		   int i=1, j=1;
		   
		   while(i<=5){
			   while(j<=5){
				 if(j%2 == 0){
					 System.out.print("0 ");
				 }else{
					 System.out.print("1 ");
				 }  
                  j++;				 
			   } 	
                     j=1;
                     i++;
                     System.out.println();					  
		   }
		    
 		 
		 
	}	  
 }
