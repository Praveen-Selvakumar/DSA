import java.util.*;
   
   
class Temp {
	  
	   
	   public static String longestSubString(String str){
		    String longestOverAll = "";
		    String longestTillNow = "";
			
			HashSet<Character> set = new HashSet<>();
			
			for(int i=0; i< str.length(); i++){
				char c  = str.charAt(i);
				 if(set.contains(c)){
					 set.clear();
					 longestTillNow= "";
				 }
				 set.add(c);
				 longestTillNow  = longestTillNow+c;
				 
				 if(longestTillNow.length() > longestOverAll.length()){
					 longestOverAll = longestTillNow;
				 }
				 
			}
			return longestOverAll;
	   }
	   
	  
	 
	public static void main(String[] args){
		   Temp cn  = new Temp();
		  	    
		  
	    System.out.println(" Longest sub-string is : "+longestSubString("abcabcd"));
		   
   }
 
 }
 
