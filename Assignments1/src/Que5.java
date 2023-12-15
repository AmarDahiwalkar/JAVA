import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num % 5 == 0 && num % 7 == 0) {
			System.out.println("number is divisible by both 5 and 7");

		} else if (num % 5 == 0) {
			System.out.println("number is div only by 5");

		} else {
			System.out.println("number is divisible by 7");
		}

	}
}
