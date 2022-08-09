import java.util.*;


class Simple_BT{
  
   
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
   
   
   //PRINT DATA IN BINARY TREE
   private void  printleafNode(TreeNode node){
    if(node ==  null) return ;
	
	if(node !=  null) System.out.println(" Leaf Node is "+node.data); 
	
    printleafNode(node.left);
    printleafNode(node.right);
   }
   
   
   
   public static void main(String[] args){
    
	 Simple_BT cn  = new Simple_BT();
	 
	 cn.createTree();
	 cn.printleafNode(root);
   
   }
 
}