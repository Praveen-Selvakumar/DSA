class Solution {
    public boolean isValid(String s) {
        
         
	 char[] a = s.toCharArray();
	 Stack<Character> stack  = new Stack<>();
	 
     if(a.length == 0 || a[0] == ')'|| a[0] == '}'|| a[0] == ']' )return false;
	 
	 for(int i=0; i < a.length; i++){
		    if(a[i] == '(' || a[i] == '{' || a[i] == '['){
				stack.push(a[i]);
			}else if(!stack.isEmpty()){
				char c = stack.peek();
			   if( (c == '(' && a[i] == ')') ||
				   (c == '{' && a[i] == '}') ||
				   (c == '[' && a[i] == ']') ){
					stack.pop();
				}else{
				return false;
			    }

			}else{
				return false;
			}
	 }
	 
	 if(stack.isEmpty()){
		 return true; 
	 }
        return false; 

    }
}
