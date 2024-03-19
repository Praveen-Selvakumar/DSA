import java.util.*;
   
   
 class Temp {
	  
	  
	
	public  static  boolean isAnagram(String str1, String str2){
		if(str1.length() != str2.length())return false;
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		 
        for(int i=0; i<c1.length; i++){
			if(c1[i] ! = c2[i])return false
		}
 		 
		return true;
	}
	
	
	
		
	public static void main(String[] args){
		   Temp cn  = new Temp();
		    
 	 
		  isAnagram("listen", "silten");
		   
			 
	
   }
 
 }
 
