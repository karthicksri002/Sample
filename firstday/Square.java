package firstday;

import java.util.Scanner;

class Square {

	public static void main(String[] args) {
		System.out.print("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();

		double temp, temp2;
		int digits1 = Integer.parseInt(String.valueOf(number).substring(0, 2));
		int digits2 = Integer.parseInt(String.valueOf(number).substring(2, 4));
		double sr = digits1 / 2;
		double sr2 = digits2 / 2;
		do {
			temp = sr;
			temp2 = sr2;
			sr = (temp + (digits1 / temp)) / 2;
			sr2 = (temp2 + (digits2 / temp2)) / 2;
		} while ((temp - sr) != 0);
		while ((temp2 - sr2) != 0);
		System.out.println("answer" + sr + "square" + sr2);
	}

}