import java.util.Scanner;

public class Que12 {

	public static void main(String[] args) {
		int n, sum = 0;
		System.out.println("enter the nth number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sum = sum + i;

		}

		System.out.println("sumof series:" + sum);
	}
}
