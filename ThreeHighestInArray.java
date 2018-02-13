package fastrack.ques;

public class FirstTwoElems {

	public static void main(String[] args) {
		int num[] = { 65, 8, 56, 56, 98, 2, 45, 7, 100, 900, 200 };
		printFirstTwo(num);
	}

	static void printFirstTwo(int[] n) {
		int first = 0;
		int second = 0;
		int third = 0;

		for (int i : n) {
			if (i > first) {
				third = second;
				second = first;
				first = i;
			} else if (i > second) {
				third = second;
				second = i;
			} else if (i > third) {
				third = i;
			}
		}
		System.out.println("first largest : " + first);
		System.out.println("second largest : " + second);
		System.out.println("third largest : " + third);
	}
}
