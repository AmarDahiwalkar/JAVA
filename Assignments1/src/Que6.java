import java.util.Scanner;

public class Que6 {
	public static void main(String[] args) {
		double basic_sal;
		double tax = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the basic salary:");
		basic_sal = sc.nextDouble();
		if (basic_sal < 150000) {
			System.out.println("tax is 0");
			System.out.println("tax is:" + tax);
		} else if (basic_sal > 150000 && basic_sal < 300000) {
			tax = basic_sal * 0.2;
			System.out.println("tax is:" + tax);

		} else {

			tax = basic_sal * 0.3;
			System.out.println("tax is:" + tax);
		}

	}

}
