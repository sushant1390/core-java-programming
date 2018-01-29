package fastrack.ques;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 2, 3, 1 }; // input array
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					while (j < (len) - 1) {
						arr[j] = arr[j - 1];
						j++;
					}
					len--;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.print("  " + arr[i]);
		}

	}
}
