
public class LargestElement {

	public static void main(String[] args) {
		int arr[] = { 35, 40, 12, 23, 32, 73 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("largest element in array" + max);
	}
}
