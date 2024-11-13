// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int oneDigit = num % 10;
		int tenDigit = (num % 100 - oneDigit) / 10;
		int hundredDigit = num / 100;
		System.out.println( hundredDigit + " hundreds, " + 
							tenDigit + " tens, and " + 
							oneDigit +" ones.");
	}
}
