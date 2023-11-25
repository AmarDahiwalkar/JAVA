
public enum color {
	WHITE(5000), BLACK(10000), BLUE(7500), SILVER(8000), RED(15000);

	private double additionalcost;

	private color(double additionalcost) {
		this.additionalcost = additionalcost;
	}

	public double getAdditionalcost() {
		return additionalcost;
	}

	public void setadditionalcost(double additionalcost) {
		this.additionalcost = additionalcost;
	}

	

}
