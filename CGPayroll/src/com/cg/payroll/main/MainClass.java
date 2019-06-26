package com.cg.payroll.main;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Employee;
import com.cg.payroll.beans.Salary;
public class MainClass{
	public static void main (String[]  args) throws Exception {
		BankDetails b = new BankDetails(1254,"hdfc","hdfc123");
		Salary s = new Salary(10000,100,102,105,106,107,10,20, 10006);
		Employee emp = new Employee(101,"Atharva","Fulsoundar","atharva@gmail.com","hgf1223","IT","SE", b, s);
		System.out.println(emp.getSalary().getNetSalary());
	}
}

