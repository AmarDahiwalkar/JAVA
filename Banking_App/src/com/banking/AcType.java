package com.banking;

public enum AcType {
	SAVING(10000), CURRENT(5000), FD(50000);
	private double minbalance;

	private AcType(double minbalance) {
		this.minbalance = minbalance;
	}

	public double getMinbalance() {
		return minbalance;
	}

	public void setMinbalance(double minbalance) {
		this.minbalance = minbalance;
	}
	
	

}
