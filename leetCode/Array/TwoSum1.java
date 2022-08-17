import java.util.* ;


 class TwoSum1{
 
    public static int  target = 9 ;
	
	public static int[] nums  = {2,11,15,7};
	 
   //USING ARRAY
   private int[]  get_integer(){
    
	int i = 0; 
	int j = 0;
	
	while(i < nums.length){
	  while(j < nums.length){
	     if((nums[i]+nums[j]) == target){
		   return  new int[]{i,j};
		 }
		 j++;
	  }
	  j=0;
	  i++;
	}
	
	return new int[]{};
   
   } 
   
   
   
   //USING HASHTABLE
   
   
   public static void main(String[] args){
    
	 TwoSum1 cn = new  TwoSum1();
	 System.out.println(Arrays.toString(cn.get_integer()));
    
   }
   
   
   
   
 }