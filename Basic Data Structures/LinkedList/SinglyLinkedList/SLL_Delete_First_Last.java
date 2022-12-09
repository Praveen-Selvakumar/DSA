import java.util.*;


class SLL_Delete_First_Last{ 

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
	
	
	private   ListNode  DeleteFirs1(){     
		return head = head.next;
	}
	
	private ListNode DeleteFirst(){
		ListNode temp = head;
		head = head.next;
		temp = null;
		return head;
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
		
		SLL_Delete_First_Last cn  = new SLL_Delete_First_Last();
		
		create_list();
		
		println();
		
		cn.DeleteFirst();
		
		println();
		
		 
		
		
		
	}
	
}