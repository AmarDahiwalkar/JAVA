package com.banking;

import java.time.LocalDate;

import CustomException.InsufficientFundsException;
import CustomException.InvalidInputException;

public class BankAccount {

	private int acctNo;
	private String customerName;
	private AcType acctType;
	private double balance;
	private LocalDate creationDate;
	private LocalDate lastTxDate;
	private boolean isActive;

	public BankAccount(int acctNo, String customerName, AcType acctType, double balance, LocalDate creationDate) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.acctType = acctType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lastTxDate = LocalDate.parse(this.creationDate.toString());
		this.isActive = true;

	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", acctType=" + acctType
				+ ", balance=" + balance + ", creationDate=" + creationDate + ", lastTxDate=" + lastTxDate
				+ ", isActive=" + isActive + "]";
	}

	public void deposit(double amount) throws InvalidInputException {
		if (this.isActive)
			throw new InvalidInputException("acc is in-active");
		balance += amount;
	}

	public void wirthdrawl(double amount) throws InvalidInputException {
		if (this.isActive)
			throw new InvalidInputException("acc is in-active");
		balance -= amount;
	}

	public void transferFunds(BankAccount dest, double transamount)
			throws InsufficientFundsException, InvalidInputException {
		this.wirthdrawl(transamount);
		dest.deposit(transamount);
	}

	public void simpleintrest(int rate, int periodinyear) {
		balance += (balance * rate * periodinyear);
	}

	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public AcType getAcctType() {
		return acctType;
	}

	public void setAcctType(AcType acctType) {
		this.acctType = acctType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getLastTxDate() {
		return lastTxDate;
	}

	public void setLastTxDate(LocalDate lastTxDate) {
		this.lastTxDate = lastTxDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BankAccount) {
		BankAccount	o =(BankAccount)obj;
		return this.acctNo==(o.acctNo);
		}
		return false;
	}

}
