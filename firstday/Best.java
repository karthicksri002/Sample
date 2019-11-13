package firstday;

import java.util.Scanner;

public class Best {
	   public static void main(String[] args) 
	    {
	       int n[]={5,6,7,8};
	       int temp=n[n.length-1];
	       for(int i =0;i<n.length;i++){
	    	   int temp1=n[i];
	    	   n[i]=temp;
	    	   temp=temp1;
	    	   System.out.println(n[i]);
	       } 
	       }
	         
}
