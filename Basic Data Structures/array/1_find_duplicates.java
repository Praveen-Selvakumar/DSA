import java.util.*;
   
   
 class Temp {
 
 
  
	  
	public static void main(String[] args){
		   Temp cn  = new Temp();
		   
		   int[]  a = {3,5,7,8,5,2,3};

            Set<Integer> set = new HashSet<>();

            for(int i=0; i < a.length; i++){
				if(set.contains(a[i]))
					System.out.println(a[i]);
				
				set.add(a[i]);
			}			
		    
   }
   
   
   
 
 }
 
