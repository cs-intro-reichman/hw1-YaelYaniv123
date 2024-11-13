// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Creates 3 random integers between 0 and the inserted number.
		int limit = Integer.parseInt(args[0]);
		int num1 = (int) (Math.random() * limit);
		int num2 = (int) (Math.random() * limit);
		int num3 = (int) (Math.random() * limit);
		// Determins which number in the smallest, medium or largest.
		int small = Math.min(Math.min(num1,num2),num3);
		int big = Math.max(Math.max(num1,num2),num3);
		int mid = num1 + num2 + num3 - small - big;

		System.out.println( num1 + " " + num2 + " " + num3);
		System.out.println( small + " " + mid + " " + big);
	}
}
