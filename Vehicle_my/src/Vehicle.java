import java.time.LocalDate;



/*
 * chasisNo(string) : Unique ID, color(enum) , basePrice(double) ,
 *  manufactureDate(LocalDate),company,isAvailable
 */
public class Vehicle implements Comparable<Vehicle>{
	private String chasisNo;
	private color vehiclecolor;
	private double price;
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;

	public Vehicle(String chasisNo, color vehiclecolor, double price, LocalDate manufactureDate, String company) {
		this.chasisNo = chasisNo;
		this.vehiclecolor = vehiclecolor;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable = true;
	}

	public Vehicle(String chasisNo) {
		this.chasisNo=chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehiclecolor=" + vehiclecolor + ", price=" + price
				+ ", manufactureDate=" + manufactureDate + ", company=" + company + ", isAvailable=" + isAvailable
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in veh equals");
		if (obj instanceof Vehicle) {
			Vehicle v = (Vehicle) obj;
			return this.chasisNo.contentEquals(v.chasisNo);
		}
		return false;
	}
	@Override
	public int compareTo(Vehicle obj)
	{
		System.out.println("in compare to");
		return this.chasisNo.compareTo(obj.chasisNo);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public color getVehicleColor() {
		return vehiclecolor;
	}
	
	 

}
