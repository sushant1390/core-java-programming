package base.pkg;

public class StringPattern {
	public static void main(String[] args) {

		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {
			lastIndex = str.indexOf(findStr, lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += findStr.length();
			}
		}

		System.out.println("Count of Pattern 'hello' in the string =" + count);

	}
}
