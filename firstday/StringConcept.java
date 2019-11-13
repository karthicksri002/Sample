package firstday;

import java.util.Scanner;

public class StringConcept {

	  
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no of rows value");

		int n=sc.nextInt();
		int number=(n*(n+1))/2;
		for(int i=n;i>=1;i--)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(number+" ");
				number--;
			}
			System.out.println("");
		}
	}
}

