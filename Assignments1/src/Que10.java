import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
		int m, n, power = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		m = sc.nextInt();
		System.out.println("enter the n:");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			power = power * m;

		}
		System.out.println("power is:" + power);

	}

}
