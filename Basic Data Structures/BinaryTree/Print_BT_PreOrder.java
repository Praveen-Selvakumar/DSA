import java.util.*;


class Print_BT_PreOrder{
  
   
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
   
   private void  recursive_pre_order(TreeNode node){
    if(node ==  null) return ;
	
	if(node !=  null) System.out.println("RP Leaf Node is "+node.data); 
	
    recursive_pre_order(node.left);
    recursive_pre_order(node.right);
   }
   
   
   
    //ITERATIVE PRE-ORDER  
	
	/* 
	  Iteration  means process of repeating process ( exactly a loop ) 
	 */
   private void iterative_pre_order(){
      
      if( root == null ) return;

      Stack<TreeNode> stack  = new Stack<>();
      stack.push(root); 	
      
     while(!stack.isEmpty()){
		 TreeNode temp = stack.pop();
		 System.out.println(" IP "+temp.data);
	 	  
	 
	  if(temp.right !=  null){
		 stack.push(temp.right); 
	  }
 	
	
	  if(temp.left !=  null){
		 stack.push(temp.left); 
	  }
	 
	 }  	
	} 
	
	
	 
	 
   
   public static void main(String[] args){
    
	 Print_BT_PreOrder cn  = new Print_BT_PreOrder();
	 
	 cn.createTree();
	 cn.recursive_pre_order(root);
	 cn.iterative_pre_order();
   
   }
 
}