import java.util.*;


class SLL_Insert_From_Tail{
	
	
	 public static ListNode head ;
	 
	 public static class ListNode{
		 private ListNode next ;
		 private int data ;
		 
		 public ListNode(int data){
			 this.data = data;
			 this.next = null;
		 }
		 
	 }
	 
	 

	 
	 private ListNode insert_tail1(int data){
		ListNode node = new ListNode(data); 
		 if(head == null){
			node.next = head;
            return head = node;			
		 }
		 ListNode current = head ;
		 ListNode previous = null ;
		 while(current != null){
			 previous = current;
			 current = current.next;
		 }
		  previous.next = node;
		  return head;
	 } 
	 
	 // OR
	 private ListNode insert_tail(int data){
		 ListNode node = new ListNode(data); 
		 if(head == null){
             return head = node;			
		 }
		 ListNode current = head ;
 		 while(current.next != null){
 			 current = current.next;
		 }
		 return current.next = node;
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
		
		SLL_Insert_From_Tail cn  = new SLL_Insert_From_Tail();
		
		cn.insert_tail(1);
		cn.insert_tail(2);
		cn.insert_tail(3);
		cn.insert_tail(4);
		cn.insert_tail(5);
		
		println();
		
	}
	
}