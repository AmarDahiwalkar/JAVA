package day3;

public class Date {
	private int dd;
	private int mm;
	private int yy;

	public Date() {
		dd = 03;
		mm = 12;
		yy = 1999;
	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getdd() {
		return dd;
	}

	public void setdd(int dd) {
		this.dd = dd;
	}

	public int getmm()

	{
		return mm;
	}

	public void setmm(int mm) {
		this.mm = mm;
	}

	public int getyy() {
		return yy;
	}

	public void setyy(int yy) {
		this.yy = yy;
	}
}
