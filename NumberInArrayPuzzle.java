import java.util.Scanner;
class NumberInArrayPuzzle {
 
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int S = in.nextInt();
		int[] array = {90,30,100,40,20};
		int len = array.length;
		int sAvg = S/len;
 
		int trackSmallerThanAverage = 0;
		int countMorethanAverage = 0;
 
		for(int i=0; i<len; i++) {
			if(array[i] > sAvg) {
				countMorethanAverage ++;
			} else if (array[i]<sAvg) {
				trackSmallerThanAverage += array[i];
			}
 
		}
 
		int finalValue = ( S - trackSmallerThanAverage )/countMorethanAverage;
		System.out.println(finalValue);
		in.close();
 
	}
}
