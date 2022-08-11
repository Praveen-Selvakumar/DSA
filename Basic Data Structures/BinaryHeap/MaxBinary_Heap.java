import java.util.*;


class MaxBinary_Heap{
	 
	   	Integer[] heap; 
		int  n  ;
		
		public  MaxBinary_Heap(int capacity){	 
			heap = new Integer[capacity+1];
			n  = 0;			
		}
		
		
		public boolean isEmpty(){
			return n == 0;
		}
		
		
		public int size(){
			return n ;
		}
		
		
	public void insert(int x){
		if(n  == heap.length-1){
			resize(2*heap.length);
		}
		
		n++;
		heap[n] = x;
		swim(n);			
	}
	
	public void swim(int k){
		while( k > 1 && heap[k/2] < heap[k] ){
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2;
		}
	}
	
	public void resize(int capacity){
		Integer[] temp = new Integer[capacity];
		for(int i=0; i < heap.length; i++){
			temp[i] = heap[i];
		}
		heap = temp;
	}
		
		
    private void println(){
		int i = 0 ;
		
		while( i <  heap.length){
			System.out.println(heap[i]);
			i++;
		}
	}		
		
	
	public static void main(String[] args){
		
		MaxBinary_Heap  cn  = new MaxBinary_Heap(3);
		System.out.println(" size is :  "+cn.size());
		System.out.println(cn.isEmpty());
		System.out.println(cn.heap.length);
		
	 //WHERE,  size = 0 , and isEmpty() = true , heaplength   =  4

		
		cn.insert(5);
		cn.insert(4);
		cn.insert(2);
		
		System.out.println(" Now size is : "+cn.size());
		
		System.out.println( " Printing Data : " );
		cn.println();
		
		
		
		
	}
	


}