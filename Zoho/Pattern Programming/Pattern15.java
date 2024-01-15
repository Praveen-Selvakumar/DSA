import java.util.*;
   
   
   
@SuppressWarnings("unchecked")
class Pattern15{
	 
	 
	
	public static void main(String[] args){ 		   
		   
		   int i = 1 , j =5;
		   
		   
		   while(i<=5){
			   while(j>=1){
				   if(j<=i){
					   System.out.print(j+" "); 
				   }else{
					    System.out.print("  ");
				   }
				   j--;
			   }
			    System.out.println();
				j=5;
				i++;
			    
		   }
		    
		 
				
		 
	}	


	
 }
