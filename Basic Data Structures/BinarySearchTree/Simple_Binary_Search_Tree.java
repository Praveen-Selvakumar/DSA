import java.util.*; 



class Binary_Search_Tree{

  
  public static TreeNode root; 
  
  public static class TreeNode{
   
    public TreeNode left;
    public TreeNode right;
	public int data;
	
	public TreeNode(int data1){
	 this.data = data1;
	 this.left = null;
	 this.right = null;
	}
   
  }
  
  //INSERTING DATA INTO BINARY SEARCH TREE
  
  public void add(int data){
     root = insert_recursive(root, data);
  }
  
  
  public TreeNode insert_recursive(TreeNode root , int data){
     
	 if(root == null){
	     root = new TreeNode(data);
		 return root;
	 }
	 
	 if( data  <  root.data ){
	      root.left = insert_recursive(root.left, data);
 	 }else if( data > root.data ){
	      root.right = insert_recursive(root.right, data);
 	 }
	 
	 return root;
	 
  }
  
   
  
   private void recursive_preorder(TreeNode node){
	   if(node ==  null){
		   return;
	   }
	   
	   if( node !=  null ) System.out.println(" Data is "+node.data);
	    
		recursive_preorder(node.left);
		recursive_preorder(node.right);			   
   }
   
   
     public TreeNode search(TreeNode root, int key){
		 
		 if(root ==  null || root.data == key){
			 return root;
		 }
		 
		 if(key < root.data){
			 return search(root.left, key);
		 }else{
			return search(root.right, key); 
		 }
	   
     }
	 
	 
  
  public static void main(String[] args){
     
	 Binary_Search_Tree cn = new Binary_Search_Tree();
	 
	 cn.add(6);
	 cn.add(4);
	 cn.add(8);
	 cn.add(3);
	 cn.add(5);
 	 cn.add(7);
	 cn.add(10);
	 
	 cn.search(root, 8);
	 
	 System.out.println( " The given key is "+ cn.search(root, 8).data );
	 
 	 
 	 	 
  }
  
 
}

