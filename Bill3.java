// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Receives the names of the 3 diners and the sum of the diner.
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int price = Integer.parseInt(args[3]);
		double each = (double) price / 3;
		System.out.println("Dear " + name1+ ", " + name2 + ", " + name3 + ": pay " + Math.ceil(each) + " Shekels each "); 
	}
}
