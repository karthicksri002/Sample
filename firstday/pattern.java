package firstday;

import java.util.Arrays;
import java.util.Scanner;

class pattern { 
	 public static void main(String[] args) {

	        Scanner s=new Scanner(System.in);

	        System.out.println("enter number of elements");

	        int n=s.nextInt();

	        int arr[]=new int[n];

	        System.out.println("enter elements");

	        for(int i=0;i<n;i++){
	            arr[i]=s.nextInt();

	        }

	        for(int i: arr){

	            System.out.println(i);
	            System.out.println(arr[n-1]);

	        }


	    }

	}