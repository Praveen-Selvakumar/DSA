import java.util.*;
   
   
   
@SuppressWarnings("unchecked")
class Pattern4{
 
	 
    

  public static void main(String[] args){
	  
	     
		 
		 /*
		 * * * * *
		   * * * *
		     * * *
		       * *
                 *
		 
		 */
		            
	
	           int i = 0, j =0; 
				
				while(i < 5){
					while(j < 5){
						 if(j >= i){
							 System.out.print("* ");
						 }else{
							 System.out.print("   ");
						 }
						 j++;
					} i++;
					j=0;
					System.out.println();
				}
				 
			  
	        
 
  }
  
        
   
   
   
}
