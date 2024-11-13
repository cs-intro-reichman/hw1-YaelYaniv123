// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Receives the current value in the account, the interest rate and the number of saving years.
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow((1+rate/100), years);
		System.out.println("After " + years + " years, $" + 
							currentValue + " saved at " + rate +
							"% will yeild $" + (int) futureValue);
	}
}