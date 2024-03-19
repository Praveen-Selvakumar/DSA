import java.util.*;
   
   
 class Temp {
	 
	 public  static ListNode head ;
	 
	 public static class ListNode{
		 public int data;
		 public ListNode next;
		 
		 public ListNode(int data){
			 this.data = data;
			 this.next = nulal;
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
	 	
		
	public static void  reverse(){
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
            current = next; 			
		}
		
		head = prev;
		
	}	
		
	public static void main(String[] args){
		   Temp cn  = new Temp();
		    
		insert_head(10);
		insert_head(11);
		insert_head(12);
		insert_head(13);
		insert_head(14);
		
		reverse();
		
		println();
		  
		   
			 
	
   }
 
 }
 
