
public class duplicateFromArray {

	public static void main(String[] args) {
		int arr[] = { 10, 10, 20, 30, 20, 40, 30 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("find duplicates" + arr[j]);
				}
				
			}
		}

	}
}
