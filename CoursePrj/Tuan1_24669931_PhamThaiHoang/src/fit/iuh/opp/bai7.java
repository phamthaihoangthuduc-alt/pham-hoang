package fit.iuh.opp;

public class bai7 {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		int value3 = 2;

		System.out.println("value1 == value2 = " + (value1 == value2)); // false
		System.out.println("value2 == value3 = " + (value2 == value3)); // true
		System.out.println("value1 != value2 = " + (value1 != value2)); // true
		System.out.println("value2 != value3 = " + (value2 != value3)); // false
		System.out.println("value1 > value2 = " + (value1 > value2));   // false
		System.out.println("value1 < value2 = " + (value1 < value2));   // true
		System.out.println("value1 <= value2 = " + (value1 <= value2)); // true
		System.out.println("value2 >= value3 = " + (value2 >= value3)); // true
	}
}
