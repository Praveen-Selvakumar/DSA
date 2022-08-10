import java.util.*;




class Simple_Undirected{
	 
	int[][] adjMatrix ;
	
	public Graph(int nodes){
		this.adjMatrix = new int[nodes][nodes];
	}
	
	
	public void addEdge(int u, int v){
		this.adjMatrix[u][v] = 1;
		this.adjMatrix[v][u] = 1;
	}
	
	 
	
	private void println(){
		int length  = adjMatrix.length;
		
		for(int i=0; i < length; i++){
			for(int j=0; j < length; j++){
				System.out.println("Adjacency FOR :"+i+"*"+j+" = "+adjMatrix[i][j]);
			}
		}
		   
	}
	
	private  void specific_data(int u, int v){
		System.out.println( " Data is : " + adjMatrix[u][v] );
	}
	
    public static void main(String[] args){
		
		Simple_Undirected cn  = new  Simple_Undirected(4);
		
		cn.addEdge(0,1);
		cn.addEdge(1,2);
		cn.addEdge(2,3);
		cn.addEdge(3,0);
		
		cn.println();
		
		cn.specific_data(1,2);
		
 		
	}
	
	
	 
}