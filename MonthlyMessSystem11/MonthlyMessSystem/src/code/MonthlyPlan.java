package code;

public enum MonthlyPlan {
	MONTHLY (3000), QUARTERLY (11700), HALFYEAR (17500), YEARLY (32000);
	private double charges;

	private MonthlyPlan(double charges) {
		this.charges = charges;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}
	
}
