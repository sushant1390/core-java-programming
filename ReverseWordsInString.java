package home.sushant.practice.string;

public class ReverseWordsInString {

	public String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		// split to words by space
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}

	public static void main(String[] args) {
		String str = "I love Java";
		ReverseWordsInString rws = new ReverseWordsInString();
		System.out.println(rws.reverseWords(str));
	}

}
