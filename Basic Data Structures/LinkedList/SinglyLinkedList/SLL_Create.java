import java.util.*;

class  SLL_Create{ 
	 
    public static ListNode head;
	
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
	
	   
		   
		   
	public static void main(String[] args){
		
		SLL_Create cn = new SLL_Create();
		
		create_list();
 		
	}	   
		   
  
   
   

 }