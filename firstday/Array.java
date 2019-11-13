package firstday;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int n;
		int temp1 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		for (int i : a) {

			System.out.println(i);
		}
		int temp = a[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			temp1 = a[i];
			a[i] = temp;
			temp = temp1;
			System.out.println(a[i]);
		}

	}

}
