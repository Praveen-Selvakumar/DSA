import java.util.*;

class  SLL_Insert_From_Head{ 
	 
   public static ListNode head;
	
	public static class ListNode{
		private ListNode next ;
		private int data ;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	

    public ListNode insert_head(int data){
		 ListNode node = new  ListNode(data);
		 node.next = head;
		 		 		 
		return head = node;
	}
	
	public static void println(){
		
		ListNode current  = head;
		while(current != null){
			System.out.println(" The data is "+current.data);
			current = current.next;
		}
			System.out.println(" The data becomes null !");
	}
	
	   
		   
		   
	public static void main(String[] args){
		
		SLL_Insert_From_Head  cn = new SLL_Insert_From_Head();
		
		cn.insert_head(5);
		cn.insert_head(4);
		cn.insert_head(3);
		cn.insert_head(2);
		cn.insert_head(1);
		
		println();
 		
	}	   
	
}