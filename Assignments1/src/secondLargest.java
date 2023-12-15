
public class secondLargest {

	public static void main(String[] args) {
		int[] arr = { 45, 52, 17, 23, 22 };
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println("sorted array");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
		System.out.println("second largest element :" + arr[arr.length - 2]);

	}

}
