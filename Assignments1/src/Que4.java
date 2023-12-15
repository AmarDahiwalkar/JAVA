import java.util.Scanner;

public class Que4 {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("number is even");
		} else
			System.out.println("num is odd");

	}

}
