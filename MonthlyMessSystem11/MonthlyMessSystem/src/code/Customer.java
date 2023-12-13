package code;
//Customer id(int) , first name(String), last name (String), email(String), password(String), Address String,

//RegisterDate(LocalDate), planEndDate(LocalDate), Address(String), Phone No(String),plan Enum,
//final_amount double

import java.time.LocalDate;

@SuppressWarnings("hiding")
public class Customer{
	private int cusId;
	private String fName, lName, email, pass, address;
	private LocalDate regiDate, endDate;
	private String phoneNo;
	private MonthlyPlan plan;

	public Customer(int cusId, String fName, String lName, String email, String pass, String address, String phoneNo,
			MonthlyPlan plan) {
		super();
		this.cusId = cusId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pass = pass;
		this.address = address;
		this.regiDate = LocalDate.now();
		this.phoneNo = phoneNo;
		this.plan = plan;
		if (this.plan == MonthlyPlan.MONTHLY) {
			this.endDate = regiDate.plusMonths(1);
		} else if (this.plan == MonthlyPlan.QUARTERLY) {
			this.endDate = regiDate.plusMonths(3);
		} else if (this.plan == MonthlyPlan.HALFYEAR) {
			this.endDate = regiDate.plusMonths(6);
		} else {
			this.endDate = regiDate.plusYears(1);
		}
		
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	public int getCusId() {
		return cusId;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getRegiDate() {
		return regiDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public MonthlyPlan getPlan() {
		return plan;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", pass="
				+ pass + ", address=" + address + ", regiDate=" + regiDate + ", endDate=" + endDate + ", phoneNo="
				+ phoneNo + ", plan=" + plan + ", charges=" + plan.getCharges() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Customer c = (Customer) obj;
		return this.getEmail().equals(c.getEmail());
	}

}
