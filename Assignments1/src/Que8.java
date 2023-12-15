import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		int angle1, angle2, angle3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle1:");
		angle1 = sc.nextInt();
		System.out.println("Enter angle2:");
		angle2 = sc.nextInt();
		System.out.println("Enter angle3:");
		angle3 = sc.nextInt();
		int total = angle1 + angle2 + angle3;
		System.out.println("total :" + total);
		if (total == 180) {
			System.out.println("triangle is valid");

		} else
			System.out.println("triangle is not valid");
		sc.close();
	}

}
