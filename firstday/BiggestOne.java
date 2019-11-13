package firstday;

import java.util.Scanner;

public class BiggestOne {
	public static void main(String[] args) {

		int big = 0;
		int num;
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		num = input.nextInt();
		for (int i = 0; i < n; i++) {
			
			if (num > big) {
				big = num;
			}
		}
		System.out.println("the largest is:" + big);
		input.close();
	}

}
