import java.util.*;



class Factorial{

   public static void main(String[] args){
    
	
	int target  = 9;
	int fact = 1;
	
	
	for(int i=1; i <= target; i++){
	  fact = fact*i;
	}
	
	System.out.println("Factorial of "+target+" is "+fact);
	
	 
	 
   }
  
}