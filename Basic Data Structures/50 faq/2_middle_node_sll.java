import java.util.*;
   
   
 class Temp {
	 
	 public  static ListNode head ;
	 
	 public static class ListNode{
		 public int data;
		 public ListNode next;
		 
		 public ListNode(int data){
			 this.data = data;
			 this.next = null;
		 }
	 }
	 
	 
	 public static ListNode insert_head(int data){
		  ListNode node = new ListNode(data);
		  
		  if(head == null){
			  return head = node;
		  }		  
		  
          node.next = head;
          head = node; 		  
          return head; 			
	 }
	 
	 
	 public static void println(){
		 ListNode current = head;
		 
		 while(current != null){
			 System.out.println(current.data);
			 current = current.next;
		 }	 	           		 
	 }
	 	
		
	 public static ListNode middle_node(){
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr.next != null && fastPtr.next.next != null ){
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		
		return slowPtr;
	}
	
	
	
		
	public static void main(String[] args){
		   Temp cn  = new Temp();
		    
		insert_head(9);
		insert_head(10);
		insert_head(11);
		insert_head(12);
		insert_head(13);
		insert_head(14);
		 
		
		
		System.out.println("print middle node :- "+middle_node().data);
 		  
		   
			 
	
   }
 
 }
 
