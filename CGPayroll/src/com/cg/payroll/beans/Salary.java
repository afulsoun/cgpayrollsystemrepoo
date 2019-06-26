package com.cg.payroll.beans;

public class Salary {
	int basicSalary, hra, covieneceAllounce, otherAllounce, monthlyTax, personalAllounce, epf,companyPf, netSalary;
	
	public Salary(){}

	public Salary(int basicSalary, int hra, int covieneceAllounce, int otherAllounce, int monthlyTax,
			int personalAllounce, int epf, int companyPf, int netSalary) {
		super();
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.covieneceAllounce = covieneceAllounce;
		this.otherAllounce = otherAllounce;
		this.monthlyTax = monthlyTax;
		this.personalAllounce = personalAllounce;
		this.epf = epf;
		this.companyPf = companyPf;
		this.netSalary = netSalary;
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

	public int getCovieneceAllounce() {
		return covieneceAllounce;
	}

	public void setCovieneceAllounce(int covieneceAllounce) {
		this.covieneceAllounce = covieneceAllounce;
	}

	public int getOtherAllounce() {
		return otherAllounce;
	}

	public void setOtherAllounce(int otherAllounce) {
		this.otherAllounce = otherAllounce;
	}

	public int getMonthlyTax() {
		return monthlyTax;
	}

	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}

	public int getPersonalAllounce() {
		return personalAllounce;
	}

	public void setPersonalAllounce(int personalAllounce) {
		this.personalAllounce = personalAllounce;
	}

	public int getEpf() {
		return epf;
	}

	public void setEpf(int epf) {
		this.epf = epf;
	}

	public int getCompanyPf() {
		return companyPf;
	}

	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}

	public int getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;

}
}