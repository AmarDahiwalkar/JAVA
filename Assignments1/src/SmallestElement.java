
public class SmallestElement {

	public static void main(String[] args) {
		int arr[] = { 65, 47, 83, 29, 17, 8, 20 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("smallest element in array" + min);

	}

}
