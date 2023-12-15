import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		int num;
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num % 2 == 0) {

			System.out.println("number is prime");
		} else
			System.out.println("number is odd");

		sc.close();

	}

}
