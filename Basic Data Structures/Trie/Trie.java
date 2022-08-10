import java.util.*;

class Trie{
  
   public static TrieNode root;
   
   public Trie(){
      root  =  new TrieNode();
   }
   
   public static class TrieNode{
	   
     private TrieNode[] children;
	 private boolean isWord;
	 
	 public TrieNode(){
	  this.children = new TrieNode[26];
	  this.isWord = false;
	 }	
   }
   
   public void insert(String word){
	   
      word = word.toLowerCase() ;
	  TrieNode current  = root;
	  for(int i=0; i<word.length(); i++){
		  char c = word.charAt(i);
           //TELLS ABOUT EXACT INDEX OF THE ALPHABET
		  int index = c - 'a';
		  
 		  if(current.children[index] ==  null){
			  TrieNode node  = new  TrieNode();
			  current.children[index] = node;
			  current = node;
 		  }else{
			 current =   current.children[index];
 		  }
		  
	  }
	  current.isWord = true;
	  System.out.println( " Is Word Available : "+ current.isWord );
   }
   
   public boolean isWord(){
    return false;
   }
   
   
   public static void main(String[] args){
      Trie cn = new Trie();
	  cn.insert("cat");
	  
 	   
	  
   }
  
}