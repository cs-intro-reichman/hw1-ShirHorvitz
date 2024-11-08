// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double rate = Double.parseDouble(args[1]);
		int currentValue = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[2]);
		//calculate future value
		double futureValue = (double) (currentValue * Math.pow((1 + rate) , n)) / 100;
		System.out.println("After " + n + " a years, $" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue );
	}
}