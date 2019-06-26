package com.cg.payroll.beans;

public class BankDetails {
		int accNo;
		String bankName, ifsc;
		public BankDetails(){}
		public BankDetails(int accNo, String bankName, String ifsc) {
			super();
			this.accNo =accNo;
			this.bankName= bankName;
			this.ifsc = ifsc;
		}
		public int getAccNo() {
			return accNo;
		}
		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getIfsc() {
			return ifsc;
		}
		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}
		
		}
		
	


