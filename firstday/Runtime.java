package firstday;

public class Runtime {
	public static void main(String args[]) {

		System.out.println("Employee name:" + args[0]);
		System.out.println("Employee id:" + args[1]);
		System.out.println("Employee Basic Salary:" + args[2]);
		System.out.println("HRA:" + args[3]);
		System.out.println("DA:" + args[4]);
		System.out.println("LIC:" + args[5]);
		System.out.println("PF:" + args[6]);
		System.out.println("Bonus:" + args[7]);
		String args1 = args[2];
		int result = Integer.parseInt(args1);
		String args2 = args[3];
		int result1 = Integer.parseInt(args2);
		String args3 = args[4];
		int result2 = Integer.parseInt(args3);
		int gross_salary = result + result1 + result2;
		System.out.println("Gross Salary:" + gross_salary);
		String args4 = args[5];
		int result3 = Integer.parseInt(args4);
		String args5 = args[6];
		int result4 = Integer.parseInt(args5);
		int net = result3 + result4;
		int net_salary = gross_salary - net;
		System.out.println("Net Salary:" + net_salary);
		String args6 = args[7];
		int bonus = Integer.parseInt(args6);
		int bonus1 = bonus + net_salary;
		System.out.println("Total Salary:" + bonus1);
	}
}