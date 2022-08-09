import java.util.*;


class Print_BT_InOrder{
  
   
   public static TreeNode root ;
   
   
   public static class TreeNode{
     
	 public TreeNode right;
	 public TreeNode left;
	 public int data;
	 
	 public TreeNode(int data1){
	   this.data = data1;
	   this.left = null;
	   this.right = null; 
	 }
	
   }
   
  
  //CREATE BINARY TREE
  private void createTree(){
      root  = new TreeNode(1);
   
     TreeNode first = new TreeNode(2);   
     TreeNode second = new TreeNode(3);   
     TreeNode third = new TreeNode(4);   
     TreeNode fourth = new TreeNode(5);   
     TreeNode fifth = new TreeNode(6); 
     TreeNode sixth = new TreeNode(7); 

      root.left = first;
	  root.right = second;
	  
	  first.left = third;
	  first.right = fourth;
	  
	  second.left = fifth;
	  second.right = sixth;
	 
   }
   
   
   //PRINT TYPES IN BINARY TREE
   
   
   //RECURSIVE PRE-ORDER
   /*In  a programming language , if a program  allows you to call a function
   inside a same function is Called RECURSIVE  .   
   */
   
   private void  recursive_in_order(TreeNode node){
    if(node ==  null) return ;
	
	
    recursive_in_order(node.left);
	 if(node !=  null) System.out.println("RP Leaf Node is "+node.data); 
    recursive_in_order(node.right);
   }
   
   
   
    //ITERATIVE PRE-ORDER  
	
	  
	/* Iteration  means process of repeating process ( exactly a loop )  */
	 
   private void iterative_in_order(){
      
      if( root == null ) return;

      Stack<TreeNode> stack  = new Stack<>();      
      TreeNode temp  = root;	  
      
      while(!stack.isEmpty() || temp != null ){
		  
		  if( temp !=  null ){
			  stack.push(temp);
			  temp = temp.left;
		  }else{
			  temp = stack.pop();
			  System.out.println( " IN-ORDER "+ temp.data);
			  temp = temp.right;
		  }
		 
	 }

	 
	}  
	
	
	 
	 
   
   public static void main(String[] args){
    
	 Print_BT_InOrder cn  = new Print_BT_InOrder();
	 
	 cn.createTree();
	 cn.recursive_in_order(root);
	 cn.iterative_in_order();
   
   }
 
}