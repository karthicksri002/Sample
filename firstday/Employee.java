package firstday;

import java.util.Scanner;

public class Employee {

	private int gross;
	private String empName;
	private int empId;
	private int basicSalary;
	private int hra;
	private int dA;
	private int lic;
	private int pf;
	private int netSalary;

	public String getEmpName() {
		return empName;

	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getdA() {
		return dA;
	}

	public void setdA(int dA) {
		this.dA = dA;
	}

	public int getLic() {
		return lic;
	}

	public void setLic(int lic) {
		this.lic = lic;
	}

	public int getPf() {
		return pf;
	}

	public void setPf(int pf) {
		this.pf = pf;
	}

	public int getnetSalary() {
		return netSalary;
	}

	public void setnetSalary(int netSalary) {
		this.netSalary = netSalary;
	}

	public int getgross() {
		return gross;
	}

	public void setgross(int gross) {
		this.gross = gross;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of employes");
		int noOfEmployee = sc.nextInt();
		Employee emp[] = new Employee[noOfEmployee];
		int i;

		for (i = 0; i < noOfEmployee; i++) {
			emp[i] = new Employee();
			System.out.println("Name");
			String empName = sc.next();

			System.out.println("id");
			int empId = sc.nextInt();

			System.out.println("salary");
			int basicSalary = sc.nextInt();

			System.out.println("hra");
			int hra = sc.nextInt();

			System.out.println("da");
			int dA = sc.nextInt();

			System.out.println("lic");
			int lic = sc.nextInt();

			System.out.println("pf");
			int pf = sc.nextInt();

			emp[i].setEmpName(empName);
			emp[i].setEmpId(empId);
			emp[i].setBasicSalary(basicSalary);
			emp[i].setHra(hra);
			emp[i].setdA(dA);
			emp[i].setLic(lic);
			emp[i].setPf(pf);

		}
		System.out.println("EmpName\tEmpId\tBasicSal\tHra\tDA\tLic\tPF\tgross\tnetSalary");

		for (i = 0; i < noOfEmployee; i++) {
			emp[i].gross = emp[i].basicSalary + emp[i].hra + emp[i].dA;
			int net = emp[i].lic + emp[i].pf;
			emp[i].netSalary = emp[i].gross - net;

			System.out.println(" " + emp[i].empName + "\t" + emp[i].empId + "\t\t" + emp[i].basicSalary + "\t"
					+ emp[i].hra + "\t" + emp[i].dA + "\t" + emp[i].lic + "\t" + emp[i].pf + "\t" + emp[i].gross + "\t"
					+ emp[i].netSalary);

		}
		System.out.println("enter the bonus :");
		int Bonus = sc.nextInt();
		System.out.println("EmpName\t\tEmpId\tBasicSalary\tHra\tDA\tLic\tPF\tgross\tnetSalary\tbonus");
		for (i = 0; i < noOfEmployee; i++) {

			int Bonus1 = Bonus + emp[i].netSalary;
			System.out.println(" " + emp[i].empName + "\t" + emp[i].empId + "\t\t" + emp[i].basicSalary + "\t"
					+ emp[i].hra + "\t" + emp[i].dA + "\t" + emp[i].lic + "\t" + emp[i].pf + "\t" + emp[i].gross + "\t"
					+ emp[i].netSalary + "\t\t" + Bonus1);

		}
		sc.close();
	}

}
