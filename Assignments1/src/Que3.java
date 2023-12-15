import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 and num2:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("---before swapping---");
		System.out.println("num and num2:" + num1 + "   " + num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("---after swapping---");
		System.out.println("num1 and num2:" + num1 + "   " + num2);
		System.out.println("---end of program---");

	}

}
