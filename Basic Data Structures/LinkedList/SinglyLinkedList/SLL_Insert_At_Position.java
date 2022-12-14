import java.util.*;


class SLL_Insert_At_Position{ 

	 public static ListNode head ;
	 
	 public static class ListNode{
		 private ListNode next ;
		 private int data ;
		 
		 public ListNode(int data){
			 this.data = data;
			 this.next = null;
		 }
		 
	 }
	 
	 

	 
	  
	  public static void create_list(){
		head = new ListNode(1);
		ListNode one = new ListNode(2);
		ListNode two = new ListNode(3);
		ListNode three = new ListNode(4);
		ListNode four = new ListNode(5);
		ListNode five = new ListNode(6);
		
		head.next = one;
		one.next = two;
		two.next =three;
		three.next = four;
		four.next = five;
		
	}
	
	//MY ALGORITHM
	private ListNode insert_AtPosition1(int data, int position){
		int counter = 1;
		if(head == null){
			return head;
		}else {
			
		 ListNode node = new  ListNode(data);
		
		 if(position == 1){
			 node.next = head;
			 return head = node;
		 }
		
		ListNode current = head;
		ListNode previous = null;
		
		while(counter != position){
			previous = current;
			current = current.next;
			counter++;
		}
		
		previous.next = node;
		node.next = current;
		
		return  head;
		}

	}
	
	
	//DINESH VARYANI
	private ListNode insert_AtPosition(int data, int position){
		 ListNode node = new  ListNode(data);

		if(position == 1){
			node.next = head;
			return head = node;
		}else{
			int count =1;
			ListNode previous = head;
			
			while(count < position-1){
				previous = previous.next; 
				count++;
			}
			
			ListNode current = previous.next;
			
			previous.next = node;
			node.next = current;
			return current;		
						
		}
		
		 
		
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
		
		SLL_Insert_At_Position cn  = new SLL_Insert_At_Position();
		
		create_list();
		
		println();
		
		cn.insert_AtPosition(77, 1);
		cn.insert_AtPosition(55, 3);
		
		println();
		
		
		
	}
	
}