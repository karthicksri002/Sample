package firstday;


public class Pattern1 {
	public static void main(String[] args) {
          int n =9;
          for(int i=1;i<=n;i++){
        	  for(int j=i;j<=n-1;j++){
        	  System.out.print(1);
        	  }
        	  for(int j=1;j<=i;j++){
        		  System.out.print(i);
        		  
        	  }
        	  System.out.println("");
          }

	}

}