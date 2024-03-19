import java.util.*;
   
   
 class Temp {
	  
	  public static int[] array;
	  public static int top;
	  
	  public Temp(int capacity){
		  this.array =new int[capacity];
		  top = -1;
	  }
	  
	  
	  public static void push(int data){
		  if(top == array.length-1){
			  System.out.println("Stack is full");
		  }else{
			  top++;
			  array[top] = data;
			  System.out.println("Pushed element "+data);
		  }
	  }
	  
	  
	  public static void pop(){
 		  if(top == -1){
			  System.out.println("Stack is already empty");
		  }else{
			  int get = array[top];
 			  top--;
			  System.out.println("Popped element "+get);
		  }
		  
 	  }
	  
	  public static int peek(){
		   if(top == -1){
			  System.out.println("Stack is already empty");
			  return -1;
		  }else{
			  System.out.println("Top element");
			  return array[top];
		  }
	  }
	  
	 
	public static void main(String[] args){
		   Temp cn  = new Temp(5);
		 
		  

           		 
		 
	
   }
 
 }
 
