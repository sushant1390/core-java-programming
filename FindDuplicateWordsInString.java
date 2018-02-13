package fastrack.ques;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateWordsInString {

	public static void main(String[] args) {
		String input = "batman bat ball spider man ball gloves ball bat man batman spider man";

		Map<String, Integer> output = new LinkedHashMap<String, Integer>();
		Scanner sc = new Scanner(input);
		while (sc.hasNext()) {
			String word = sc.next();
			if (output.containsKey(word)) {
				output.put(word, output.get(word) + 1);
			} else
				output.put(word, 1);
		}
		sc.close();

		for (String i : output.keySet()) {
			System.out.println("word : " + i + " | count : " + output.get(i));
		}
	}
}
