import java.util.Scanner;

public class Que14 {

	public static void main(String[] args) {
		int even = 0, odd = 0, size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		size = sc.nextInt();
		int[] arr = new int[size];

		for (int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0)
				even = even + arr[i];

			else

				odd = odd + arr[i];
			
			

		}
		System.out.println("sum of even:" + even);
		System.out.println("sum of odd:" + odd);

		sc.close();
	}

}
