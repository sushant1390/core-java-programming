package fastrack.ques;

public class Test_JavaCallByValue {

	public static void main(String[] args) {

		Questions red = new Questions("Red"); // memory reference 50
		Questions blue = new Questions("Blue"); // memory reference 100

		swap(red, blue);
		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

		foo(blue);
		System.out.println("blue color=" + blue.getColor());

	}

	private static void foo(Questions balloon) { // baloon=100
		balloon.setColor("Red"); // baloon=100
		balloon = new Questions("Green"); // baloon=200
		balloon.setColor("Blue"); // baloon = 200
	}

	// Generic swap method
	public static void swap(Object o1, Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}

}
